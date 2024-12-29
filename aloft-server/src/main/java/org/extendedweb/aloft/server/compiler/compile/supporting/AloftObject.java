package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.AloftComponentT;
import org.extendedweb.aloft.lib.lang.types.t.PathT;
import org.extendedweb.aloft.server.compiler.compile.base.AloftFunction;
import org.extendedweb.aloft.server.compiler.compile.base.AloftFunctionCompiler;
import org.extendedweb.aloft.server.compiler.compile.base.AloftFunctionContainer;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.base.register.ComponentObjectRegister;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public abstract class AloftObject implements CompilesAloftObjects {

    private String named = null;
    private ArrayList<AloftObjectProperty> defaultProperties = new ArrayList<>();
    protected ArrayList<AloftObjectProperty> properties = new ArrayList<>();
    protected AtomicReference<ArrayList<AloftVariable>> variables = new AtomicReference<ArrayList<AloftVariable>>();
    protected ArrayList<AloftFunctionContainer> functions = new ArrayList<>();
    private Class<?> type = null;
    private List<AloftParser.SyntaxContext> syntax;
    protected File file = null;
    protected ParserRuleContext ctx;
    protected CompiledObjectsRegister register;

    public AloftObject() { }

    public AloftObject(ParserRuleContext ctx, CompiledObjectsRegister register, File file) throws CompilerException {
        this.file = file;
        this.ctx = ctx;
        this.register = register;
        properties(defaultProperties);
        List<AloftParser.SyntaxContext> syntax = preCompile(ctx);
        this.syntax = syntax;
        compile(syntax, register);
    }

    protected void registerComponent(AloftComponent component) {
        this.register.getComponentsRegister().register(component.getName(), new AloftComponentClass(component, this.register, this.variables));
    }

    @Override
    public List<AloftParser.SyntaxContext> preCompile(ParserRuleContext ctx) {
        try {
            Method method = ctx.getClass().getMethod(namedVar());
            ParserRuleContext result = (ParserRuleContext) method.invoke(ctx);
            named(result.getText());
            return getSyntaxFromContext(ctx);
        } catch (Exception e) { e.printStackTrace(); }
        return null;
    }

    private List<AloftParser.SyntaxContext> getSyntaxFromContext(ParserRuleContext ctx) {
        try {
            AloftParser.Curly_blockContext innerCtx = (AloftParser.Curly_blockContext) ctx.getClass().getMethod("curly_block").invoke(ctx);
            return innerCtx.syntax();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    protected CompiledAloftObject getCompiled() {
        return null;
    }

    @Override
    public void parseVariables(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) {
        for(AloftParser.SyntaxContext ctx : syntax) {
            AloftParser.Declare_variableContext declareCtx = ctx.declare_variable();
            if(!__.isset(declareCtx)) continue;
            ArrayList<AloftVariable> vars = AloftVariable.fromContext(declareCtx, getName());
            ArrayList<AloftVariable> __v = variables.get();
            __v.addAll(vars);
            variables.set(__v);
        }
        System.out.println("DONE");
    }

    @Override
    public void parseProperties(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) throws CompilerException {
        for(AloftParser.SyntaxContext ctx : syntax) {
            AloftParser.PropertyContext pCtx = ctx.property();
            if(!__.isset(pCtx)) continue;
            AloftParser.Var_nameContext varCtx = pCtx.var_name();
            String var_name = varCtx.getText();
            AloftObjectProperty property = findProperty(var_name);
            properties.add(property.cloneProperty(property.getType(), new ContextContainer(pCtx.property_value(), file), variables));
        }
    }

    protected AloftObjectProperty getProperty(String key) {
        for(AloftObjectProperty prop : properties) {
            if(__.same(prop.getName(), key)) return prop;
        }
        return null;
    }

    protected V getPropertyValue(String key) {
        for(AloftObjectProperty prop : properties) {
            if(__.same(prop.getName(), key)) return prop.getValue();
        }
        return V.nothing();
    }

    @Override
    public void parseFunctions(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) throws CompilerException {
        for(AloftParser.SyntaxContext ctx : syntax) {
            AloftParser.UpdateContext fCtx = ctx.update();
            if(!__.isset(fCtx)) continue;
            AloftFunctionContainer func = AloftFunctionCompiler.compile(this, fCtx, register);
            if(__.isset(func)) functions.add(func);
            else new ContextContainer(fCtx, file).e("Duplicate function name.", CompilerException.ExceptionType.FATAL);
        }
        for(AloftParser.SyntaxContext ctx : syntax) {
            AloftParser.FunctionContext fCtx = ctx.function();
            if(!__.isset(fCtx)) continue;
            AloftFunctionContainer func = AloftFunctionCompiler.compile(this, fCtx, register, false);
            if(__.isset(func)) functions.add(func);
            else new ContextContainer(fCtx, file).e("Duplicate function name.", CompilerException.ExceptionType.FATAL);
        }
    }

    public AloftFunctionContainer getFunctionByName(String name, CompiledObjectsRegister register) throws CompilerException {
        //todo check for array typed functions
        for(AloftParser.SyntaxContext ctx : syntax) {
            AloftParser.FunctionContext fCtx = ctx.function();
            if(!__.isset(fCtx)) continue;
            String curName = AloftFunctionCompiler.getFunctionName(fCtx.function_declaration(), register, this);
            if(!__.same(curName, name)) continue;
            return AloftFunctionCompiler.compile(this, fCtx, register, true);
        }
        return null;
    }

    @Override
    public ArrayList<AloftFunction> getFunctions() {
        ArrayList<AloftFunction> list = new ArrayList<>();
        for(AloftFunctionContainer container : functions) {
            list.add(new AloftFunction(container));
        }
        return list;
    }

    public boolean functionExists(String functionName, boolean isArray, ArrayList<String> args) {
        for(AloftFunctionContainer func : functions) {
            boolean exists = true;
            if(!__.same(func.getName(), functionName)) continue;
            if(func.isArray() != isArray) exists = false;
            if(func.getArgs().size() != args.size()) exists = false;
            return exists;
        }
        return false;
    }

    protected void registration(CompiledObjectsRegister register) {

    }

    @Override
    public String className() {
        return "_" + named + extendsClassName();
    }

    protected AloftObjectProperty findProperty(String name) {
        for(AloftObjectProperty prop : defaultProperties) {
            System.out.println("propName=" + prop.getName());
            if(__.same(prop.getName(), name)) return prop;
        }
        return null;
    }

    @Override
    public void named(String named) {
        this.named = named;
    }

    @Override
    public void type(Class<?> c) {
        this.type = c;
    }

    public String getName() {
        return named;
    }

}
