package org.extendedweb.aloft.server.compiler.compile.base;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.lib.lang.types.base.A;
import org.extendedweb.aloft.server.compiler.compile.base.functions.AloftFunctionDefinedCallObject;
import org.extendedweb.aloft.server.compiler.compile.base.functions.base.AloftFunctionObject;
import org.extendedweb.aloft.server.compiler.compile.base.functions.builtin.BuiltInFunctionParser;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftAccess;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObject;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AloftFunctionCompiler {

    public static AloftFunctionContainer compile(AloftObject aloftObject, AloftParser.FunctionContext ctx, CompiledObjectsRegister register, boolean forUpdate) {
        AloftParser.Function_declarationContext declarationCtx = ctx.function_declaration();
        AloftFunctionType type = AloftFunctionTypeParser.parse(declarationCtx, register);
        String name = getFunctionName(declarationCtx, register, aloftObject);
        AloftAccess access = getFunctionAccess(declarationCtx);
        ArrayList<String> args = getArgs(declarationCtx);
        ArrayList<String> problematicArgs = argCheck(args, register);
        if(aloftObject.functionExists(name, isArray(declarationCtx), args)) return null;
        return new AloftFunctionContainer(type, isArray(declarationCtx), access.getType(), name, args, ctx.function_curly_block(), register, aloftObject);
    }

    public static AloftFunctionContainer compile(AloftObject aloftObject, AloftParser.UpdateContext ctx, CompiledObjectsRegister register) {
        AloftParser.Update_declarationContext declarationCtx = ctx.update_declaration();
        AloftFunctionType type = AloftFunctionType.UPDATE;
        String name = getFunctionName(declarationCtx, register, aloftObject);
        ArrayList<String> args = getArgs(declarationCtx);
        ArrayList<String> problematicArgs = argCheck(args, register);
        if(aloftObject.functionExists(name, false, args)) return null;
        return new AloftFunctionContainer(type, false, AloftAccess.AloftAccessType.PRIVATE, name, args, ctx.function_curly_block(), register, aloftObject);
    }

    public static String getFunctionName(AloftParser.Function_declarationContext ctx, CompiledObjectsRegister register, AloftObject aloftObject) {
        //TODO COMPILER CHECKS FOR DUPLICATE FUNCTIONS
        AloftParser.Name_declarationContext nameCtx = ctx.name_declaration();
        if(__.isset(nameCtx.private_named())) return nameCtx.private_named().var_name().getText();
        return nameCtx.var_name().getText();
    }

    private static String getFunctionName(AloftParser.Update_declarationContext ctx, CompiledObjectsRegister register, AloftObject aloftObject) {
        //TODO COMPILER CHECKS FOR DUPLICATE FUNCTIONS
        AloftParser.Name_declarationContext nameCtx = ctx.name_declaration();
        if(__.isset(nameCtx.private_named())) return nameCtx.private_named().var_name().getText();
        return nameCtx.var_name().getText();
    }

    private static AloftAccess getFunctionAccess(AloftParser.Function_declarationContext ctx) {
        boolean isStatic = __.isset(ctx.STATIC_ACCESS());
        AloftParser.Name_declarationContext nameCtx = ctx.name_declaration();
        boolean isPrivate = __.isset(nameCtx.private_named());
        return AloftAccess.getFunctionType(isStatic, isPrivate);
    }

    private static boolean isArray(AloftParser.Function_declarationContext ctx) {
        return __.isset(ctx.ARRAY_TYPE_SUFFIX());
    }

    private static ArrayList<String> getArgs(AloftParser.Function_declarationContext ctx) {
        ArrayList<String> args = new ArrayList<>();
        AloftParser.Var_argsContext argsCtx = ctx.var_args();
        if(!__.isset(argsCtx.EMPTY_PARENTHESIS())) {
            AloftParser.Named_with_params_specialContext paramsCtx = argsCtx.named_with_params_special();
            List<AloftParser.Var_nameContext> names = paramsCtx.var_name();
            for(int i=0; i<names.size(); i++) {
                AloftParser.Var_nameContext nameCtx = names.get(i);
                if(i == (names.size() - 1)) {
                    if(__.isset(paramsCtx.VARIABLE_ARGS())) args.add(null);
                }
                args.add(nameCtx.getText());
            }
        }
        return args;
    }

    private static ArrayList<String> getArgs(AloftParser.Update_declarationContext ctx) {
        ArrayList<String> args = new ArrayList<>();
        AloftParser.Var_argsContext argsCtx = ctx.var_args();
        if(!__.isset(argsCtx.EMPTY_PARENTHESIS())) {
            AloftParser.Named_with_params_specialContext paramsCtx = argsCtx.named_with_params_special();
            List<AloftParser.Var_nameContext> names = paramsCtx.var_name();
            for(int i=0; i<names.size(); i++) {
                AloftParser.Var_nameContext nameCtx = names.get(i);
                if(i == (names.size() - 1)) {
                    if(__.isset(paramsCtx.VARIABLE_ARGS())) args.add(null);
                }
                args.add(nameCtx.getText());
            }
        }
        return args;
    }

    private static ArrayList<String> argCheck(ArrayList<String> args, CompiledObjectsRegister register) {
        ArrayList<String> problems = new ArrayList<>();
        for(String arg : args) {
//            if(register.exists(arg)) problems.add(arg);
        }
        return problems;
    }

    public static ArrayList<AloftFunctionObject> compileChild(AloftParser.Function_curly_blockContext ctx, CompiledObjectsRegister global, AloftObject aloftObject, boolean update) {
        TempFunctionRegister register = new TempFunctionRegister(global, aloftObject, update);
        ArrayList<AloftFunctionObject> functionObjects = new ArrayList<>();
        List<AloftParser.Function_syntaxContext> root = ctx.function_syntax();
        for(int i=0; i<root.size(); i++) {
            ParserRuleContext child = root.get(i);
            int ruleIndex = child.getRuleIndex();
            if(ruleIndex == AloftParser.RULE_function_call) functionObjects.addAll(compileStatement((AloftParser.Function_callContext) child, register));
            if(ruleIndex == AloftParser.RULE_declare_variable) functionObjects.add(compileStatement((AloftParser.Declare_variableContext) child, register));
            if(ruleIndex == AloftParser.RULE_assign_variable) functionObjects.add(compileStatement((AloftParser.Assign_variableContext) child, register));
            if(ruleIndex == AloftParser.RULE_return) functionObjects.add(compileStatement((AloftParser.ReturnContext) child, register));
        }
        return functionObjects;
    }

    private static ArrayList<AloftFunctionObject> compileStatement(AloftParser.Function_callContext ctx, TempFunctionRegister register) {
        ArrayList<AloftFunctionObject> object = null;
        try {
            object = register.createIf(ctx);
        } catch (CompilerException e) {
            throw new RuntimeException(e);
        }
        return object; //TODO... IF NULL... THROW UNDEFINED FUNCTION ERROR
    }

    private static AloftFunctionObject compileStatement(AloftParser.Declare_variableContext ctx, TempFunctionRegister register) {
        AloftFunctionObject object = register.createIf(ctx);
        return object; //TODO... IF NULL... THROW UNDEFINED FUNCTION ERROR
    }

    private static AloftFunctionObject compileStatement(AloftParser.Assign_variableContext ctx, TempFunctionRegister register) {
        AloftFunctionObject object = register.createIf(ctx);
        return object; //TODO... IF NULL... THROW UNDEFINED FUNCTION ERROR
    }

    private static AloftFunctionObject compileStatement(AloftParser.ReturnContext ctx, TempFunctionRegister register) {
        AloftFunctionObject object = register.createIf(ctx);
        return object; //TODO... IF NULL... THROW UNDEFINED FUNCTION ERROR
    }

    public static class TempFunctionRegister {

        CompiledObjectsRegister global;
        AloftObject aloftObject;
        boolean update;

        TempFunctionRegister(CompiledObjectsRegister global, AloftObject aloftObject, boolean update) {
            this.global = global;
            this.aloftObject = aloftObject;
            this.update = update;
        }

        public ArrayList<AloftFunctionObject> createIf(AloftParser.Function_callContext ctx) throws CompilerException {
            List<AloftParser.Any_varContext> vars = ctx.any_var();
            ArrayList<AloftFunctionObject> list = new ArrayList<>();
            if(vars.size() == 1) {
                AloftParser.Any_varContext varCtx = vars.get(0);
                AloftParser.ThisContext thisCtx = varCtx.this_();
                String functionName = varCtx.getText();
                if(__.isset(thisCtx)) {
                    functionName = functionName.replace("this.", "");
                    AloftBuiltInFunction builtin = BuiltInFunctionParser.check(functionName, ctx);
                    if(!__.isset(builtin)) {
                        list.addAll(aloftObject.getFunctionByName(functionName, global).objects());
                    } else {
                        list.add(builtin);
                    }
                }
            }
            return list;
        }

        public AloftFunctionObject createIf(AloftParser.Declare_variableContext ctx) {
            return null;
        }

        public AloftFunctionObject createIf(AloftParser.Assign_variableContext ctx) {
            return null;
        }

        public AloftFunctionObject createIf(AloftParser.ReturnContext ctx) {
            return null;
        }

    }

}
