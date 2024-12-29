package org.extendedweb.aloft.server.compiler.compile.base.objects;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.lib._AloftComponent;
import org.extendedweb.aloft.lib.application.cache.RouteCache;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObject;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObjectProperty;
import org.extendedweb.aloft.server.compiler.compile.supporting.BuiltComponentContainerT;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ElementAloftObject extends AloftObject {

    public ElementAloftObject(ParserRuleContext ctx, CompiledObjectsRegister register, File file) throws CompilerException {
        super(ctx, register, file);
    }

    public static ElementAloftObject createIf(List<AloftParser.SyntaxContext> root, CompiledObjectsRegister register, int index, File file) {
        try {
            Object element = root.get(index);
            Method method = element.getClass().getMethod(getMethod());
            Object ctx = getContextClass().cast(method.invoke(element));
            if(!__.isset(ctx)) return null;
            return new ElementAloftObject((ParserRuleContext) getContextClass().cast(ctx), register, file);
        } catch (Exception ignored) { } catch (CompilerException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void properties(ArrayList<AloftObjectProperty> properties) {
        properties.add(new AloftObjectProperty("mounted", new BuiltComponentContainerT(), register, true));
    }

    @Override
    public boolean allowsWildcardProperties() {
        return false;
    }

    @Override
    public String namedVar() {
        return "var_name";
    }

    @Override
    public void compile(List<AloftParser.SyntaxContext> syntax, CompiledObjectsRegister register) throws CompilerException {
        parseVariables(syntax, register);
        parseProperties(syntax, register);
        parseFunctions(syntax, register);
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

    public _AloftComponent getCompiled(RouteCache routes) {
        return null;
    }

    public static String getMethod() {
        return "component";
    }

    public static Class<?> getContextClass() {
        return AloftParser.ComponentContext.class;
    }

    public static Class<?> getObjectClass() {
        return null;
    }
}
