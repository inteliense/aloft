package org.extendedweb.aloft.server.compiler.compile.base.objects;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.lib._AloftPage;
import org.extendedweb.aloft.lib.http.supporting.RequestType;
import org.extendedweb.aloft.lib.http.supporting.Route;
import org.extendedweb.aloft.lib.lang.types.t.PathT;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObject;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObjectProperty;
import org.extendedweb.aloft.server.compiler.compile.supporting.ContextContainer;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class RouteGroupAloftObject extends AloftObject {

    protected ArrayList<Route> routes = new ArrayList<>();

    public RouteGroupAloftObject(ParserRuleContext ctx, CompiledObjectsRegister register, File file) throws CompilerException {
        super(ctx, register, file);
    }

    public static RouteGroupAloftObject createIf(List<AloftParser.SyntaxContext> root, CompiledObjectsRegister register, int index, File file) {
        try {
            Object element = root.get(index);
            Method method = element.getClass().getMethod(getMethod());
            Object ctx = getContextClass().cast(method.invoke(element));
            if(!__.isset(ctx)) return null;
            return new RouteGroupAloftObject((ParserRuleContext) getContextClass().cast(ctx), register, file);
        } catch (Exception ignored) { } catch (CompilerException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void properties(ArrayList<AloftObjectProperty> properties) { }

    @Override
    public boolean allowsWildcardProperties() {
        return true;
    }

    @Override
    public String namedVar() {
        return "var_name";
    }

    @Override
    public void compile(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) throws CompilerException {
        System.out.println("PARSE PROPS - ROUTES");
        parseProperties(syntax, register);
        System.out.println("PARSED PROPS");
        register.register(RouteGroupAloftObject.class, this, new ContextContainer(ctx, file));
        System.out.println("DONE WITH ROUTES");
    }

    @Override
    public void parseProperties(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) {
        System.out.println("PARSE PROPS -- INNER");
        try {
            for (AloftParser.SyntaxContext ctx : syntax) {
                AloftParser.PropertyContext pCtx = ctx.property();
                System.out.println(pCtx.getText());
                AloftParser.Var_nameContext varCtx = pCtx.var_name();
                String var_name = varCtx.getText();
                AloftParser.Property_valueContext pValCtx = pCtx.property_value();
                ContextContainer valueCtx = new ContextContainer(pValCtx, file);
                String var_value = pValCtx.getText();
                if(!__.isset(this.routes)) System.exit(44);
                routes.add(buildRoute(var_name, var_value, register));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("DONE");
    }

    public ArrayList<Route> getRoutes() {
        System.out.println(routes.size());
        System.exit(23);
        return routes;
    }

    private Route buildRoute(String named, String path, CompiledObjectsRegister register) {
        _AloftPage page = ((PageAloftObject) register.getList(PageAloftObject.class, named).get(0)).getCompilerPage();
        return new Route(path, "GET", page);
    }

    @Override
    public ArrayList<String> imports() {
        return null;
    }

    @Override
    public String extendsClassName() {
        return null;
    }

    @Override
    public String[] constructorArgs() {
        return new String[0];
    }

    public static String getMethod() {
        return "routes";
    }

    public static Class<?> getContextClass() {
        return AloftParser.RoutesContext.class;
    }

    public static Class<?> getObjectClass() {
        return null;
    }

}
