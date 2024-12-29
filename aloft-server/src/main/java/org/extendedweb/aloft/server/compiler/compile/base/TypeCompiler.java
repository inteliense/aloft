package org.extendedweb.aloft.server.compiler.compile.base;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.*;
import org.extendedweb.aloft.lib.lang.types.v.NullV;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftVariable;
import org.extendedweb.aloft.server.compiler.compile.supporting.BuiltComponentContainerT;
import org.extendedweb.aloft.server.compiler.compile.supporting.ContextContainer;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class TypeCompiler {


    public static V compile(ContextContainer ctx) {
        ParserRuleContext o = ctx.context();
        if(o instanceof AloftParser.Property_valueContext) return property(ctx);
        return null;
    }

//    public static V compile(T type, ContextContainer ctx) throws CompilerException {
//        ParserRuleContext o = ctx.context();
//        System.out.println("type@compile=" + type.getClass());
//        if(o instanceof AloftParser.Property_valueContext)
//            if(type instanceof DynamicT) return property(ctx);
//            else return property(type, ctx);
//        return null;
//    }

    public static V compile(T type, ContextContainer ctx, CompiledObjectsRegister register, AtomicReference<ArrayList<AloftVariable>> instanceVars) throws CompilerException {
        ParserRuleContext o = ctx.context();
        System.out.println("type@compile=" + type.getClass());
        if(o instanceof AloftParser.Property_valueContext)
            if(type instanceof DynamicT) return property(ctx);
            else return property(type, ctx, register, instanceVars);
        return null;
    }

    private static V property(ContextContainer val) {
        return new DynamicT().value(getValue(val));
    }

    private static V property(T type, ContextContainer val, CompiledObjectsRegister register, AtomicReference<ArrayList<AloftVariable>> instanceVars) throws CompilerException {
        AloftParser.Property_valueContext ctx = (AloftParser.Property_valueContext) val.context();

        if(assertVariable(ctx)) {
            String varName = ctx.any_var().getText();
            for (AloftVariable var : instanceVars.get()) {
                String identifier = var.getIdentifier();
                if (var.isScoped()) varName = varName.replace("this.", "");
                if (__.same(identifier, varName)) {
                    if (type.getClass().getName().equals(var.getType().getClass().getName())) {
                        return var.value();
                    }
                }
            }
        }
        if(type instanceof StringT) {
            if(!assertString(ctx)) val.e("Property value got unexpected data type, expected string.", CompilerException.ExceptionType.CRITICAL);
            String str = string(ctx);
            return type.value(str);
        }
        if(type instanceof PathT) {
            if(!assertPath(ctx)) val.e("Property value got unexpected data type, expected path.", CompilerException.ExceptionType.CRITICAL);
            String path = path(ctx);
            return type.value(path);
        }
        if(type instanceof NumberT) {
            if(!assertPath(ctx)) val.e("Property value got unexpected data type, expected number.", CompilerException.ExceptionType.CRITICAL);
            String num = number(ctx);
            return type.value(num);
        }
        if(type instanceof ArrayT) {
            if(!assertPath(ctx)) val.e("Property value got unexpected data type, expected array.", CompilerException.ExceptionType.CRITICAL);
            Object[] arr = array(ctx);
            return type.value(arr);
        }
        if(type instanceof BuiltComponentContainerT) {
            if(!assertComponent(ctx)) val.e("Property value got unexpected data type, expected component.", CompilerException.ExceptionType.CRITICAL);
            return ((BuiltComponentContainerT) type).value(new ContextContainer(((AloftParser.Property_valueContext) val.context()).component_tree(), val.getFile()), register, instanceVars);
        }
        return new NullV();
    }

    private static boolean assertComponent(AloftParser.Property_valueContext ctx) {
        return __.isset(ctx.component_tree());
    }

    private static boolean assertVariable(AloftParser.Property_valueContext ctx) {
        AloftParser.Any_varContext varContext = ctx.any_var();
        return __.isset(varContext);
    }

    private static boolean assertString(AloftParser.Property_valueContext ctx) {
        AloftParser.StringContext strCtx = ctx.string();
        return __.isset(strCtx);
    }

    private static boolean assertPath(AloftParser.Property_valueContext ctx) {
        AloftParser.PathContext pathCtx = ctx.path();
        return __.isset(pathCtx);
    }

    private static boolean assertArray(AloftParser.Property_valueContext ctx) {
        AloftParser.ArrayContext arrCtx = ctx.array();
        return __.isset(arrCtx);
    }

    private static boolean assertNumber(AloftParser.Property_valueContext ctx) {
        AloftParser.NumberContext numCtx = ctx.number();
        return __.isset(numCtx);
    }

    private static String string(ParserRuleContext ctx) {
        if(ctx instanceof AloftParser.Property_valueContext) return string((AloftParser.Property_valueContext) ctx);
        return null;
    }

    private static String string(AloftParser.Property_valueContext ctx) {
        if(!assertString(ctx)) return null;
        return ctx.string().getText();
    }

    private static String number(ParserRuleContext ctx) {
        if(ctx instanceof AloftParser.Property_valueContext) return number((AloftParser.Property_valueContext) ctx);
        return null;
    }

    private static String number(AloftParser.Property_valueContext ctx) {
        if(!assertNumber(ctx)) return null;
        return ctx.number().getText();
    }

    private static String path(ParserRuleContext ctx) {
        if(ctx instanceof AloftParser.Property_valueContext) return path((AloftParser.Property_valueContext) ctx);
        return null;
    }

    private static String path(AloftParser.Property_valueContext ctx) {
        if(!assertPath(ctx)) return null;
        return ctx.path().getText();
    }

    private static V[] array(ParserRuleContext ctx) {
        if(ctx instanceof AloftParser.Property_valueContext) return array((AloftParser.Property_valueContext) ctx);
        return null;
    }

    private static V[] array(AloftParser.Property_valueContext ctx) {
        if(!assertArray(ctx)) return null;
        AloftParser.ArrayContext arrCtx = ctx.array();
        List<AloftParser.Property_valueContext> values = arrCtx.property_value();
        V[] arr = new V[values.size()];
        for(int i=0; i< values.size(); i++) {
            arr[i] = getValue(values.get(i));
        }
        return arr;
    }

    private static V getValue(ContextContainer ctx) {
        return getValue(ctx.context());
    }

    private static V getValue(ParserRuleContext val) {
        if(__.isset(string(val))) return new StringT().value(string(val));
        if(__.isset(number(val))) return new NumberT().value(number(val));
        if(__.isset(path(val))) return new PathT().value(path(val));
        if(__.isset(array(val))) return new ArrayT().value(array(val));
        return new NullV();
    }

}
