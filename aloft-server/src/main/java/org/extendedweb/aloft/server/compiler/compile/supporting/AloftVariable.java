package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.*;
import org.extendedweb.aloft.lib.lang.types.v.UndefinedV;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.List;

public class AloftVariable {

    private AloftAccess.AloftAccessType access;
    private String identifier;
    private T type;
    private V value;
    private boolean scoped;
    private String xpath = "";

    public AloftVariable(AloftAccess.AloftAccessType access, String identifier, T type, V value, boolean scoped, String componentName) {
        this.access = access;
        this.identifier = identifier;
        this.type = type;
        this.value = value;
        this.scoped = scoped;
        this.xpath = "/" + componentName + ":" + identifier;
    }

    public AloftVariable(String identifier, T type, V value, boolean scoped, String componentName) {
        this.identifier = identifier;
        this.type = type;
        this.value = value;
        this.scoped = scoped;
        this.xpath = "/" + identifier + ":" + componentName;
    }

    public AloftVariable(AloftAccess.AloftAccessType access, String identifier, T type, AloftExpression value) {
        this.access = access;
        this.identifier = identifier;
        this.type = type;
        this.value = new BooleanT().value(value.evaluate());
        this.xpath = "/" + identifier;
    }

    public static ArrayList<AloftVariable> fromContext(AloftParser.Declare_variableContext ctx, String componentName) {
        ArrayList<AloftVariable> allVars = new ArrayList<>();
        AloftAccess access;
        ArrayList<String> indentifiers;
        T type;
        AloftParser.VariableContext varCtx = ctx.variable();
        access = getAccess(varCtx);
        System.out.println(access.getType().name());
        indentifiers = getIdentifiers(varCtx);
        System.out.println(indentifiers.toString());
        AloftParser.Var_typeContext typeCtx = varCtx.var_type();
        type = (__.isset(typeCtx)) ? getType(typeCtx.getText()) : new DynamicT();
        System.out.println(__.isset(typeCtx) ? typeCtx.getText() : "dynamic");
        AloftParser.ExpressionContext exprCtx = ctx.expression();
        for(String identifier : indentifiers) {
            if(__.isset(exprCtx)) {
                allVars.add(new AloftVariable(access.getType(), identifier, type, parseExpression(exprCtx)));
            } else {
                allVars.add(new AloftVariable(access.getType(), identifier, type, V.unset(), true, componentName));
            }
        }
        return allVars;
    }

    public V value() {
        return value;
    }

    public void set(AloftParser.ExpressionContext ctx) {

    }

    public void set(V value) {

    }

    public void next(String component) {
        xpath = xpath + "/" + component;
    }

    public String getXpath() {
        return xpath;
    }

    public boolean isCurrent(String component, String var) {
        System.out.println(xpath);
        String[] split = this.xpath.split("/");
        String[] split2 = split[1].split(":");
        if(split2[0].equals(component) && split2[1].equals(var)) {
            return true;
        }
        return false;
    }

    public boolean nonExistent(String component, String var) {
        return !xpath.contains("/" + component + ":" + var);
    }

    public boolean isset() {
        return !(this.value instanceof UndefinedV);
    }

    public String getIdentifier() {
        return identifier;
    }

    public T getType() {
        return type;
    }

    public boolean isRequired() {
        return this.access == AloftAccess.AloftAccessType.PUBLIC_REQUIRED || this.access == AloftAccess.AloftAccessType.PRIVATE_REQUIRED;
    }

    public boolean isScoped() {
        return scoped;
    }

    private static T getType(String type) {
        switch(type) {
            case "string":
                return new StringT();
            case "number":
                return new NumberT();
            case "bool":
            case "boolean":
                return new BooleanT();
            case "time":
                return new TimeT();
            case "dynamic":
                return new DynamicT();
            default:
                return new NamedT();
        }
    }

    private static AloftExpression parseExpression(AloftParser.ExpressionContext ctx) {
        return new AloftExpression(false, null, null, null);
    }

    private static ArrayList<String> getIdentifiers(AloftParser.VariableContext ctx) {
        ArrayList<String> indentifiers = new ArrayList<>();
        AloftParser.Var_namesContext namesCtx = null;
        if(__.isset(ctx.private_named_multiple())) namesCtx = ctx.private_named_multiple().var_names();
        else namesCtx = ctx.var_names();
        List<AloftParser.Var_nameContext> namesList = namesCtx.var_name();
        for(AloftParser.Var_nameContext context : namesList) {
            indentifiers.add(context.getText());
        }
        return indentifiers;
    }

    public AloftAccess.AloftAccessType getAccess() {
        return access;
    }

    private static AloftAccess getAccess(AloftParser.VariableContext ctx) {
        boolean isPrivate = __.isset(ctx.private_named_multiple());
        boolean isStatic = __.isset(ctx.var_access()) && __.isset(ctx.var_access().static_field());
        boolean isRequired = __.isset(ctx.var_access()) && __.isset(ctx.var_access().required_field());
        if(!isPrivate && !isRequired && !isStatic) return new AloftAccess(AloftAccess.AloftAccessType.PUBLIC);
        else if(isPrivate && !isRequired && !isStatic) return new AloftAccess(AloftAccess.AloftAccessType.PRIVATE);
        else if(isPrivate && isRequired && !isStatic) return new AloftAccess(AloftAccess.AloftAccessType.PRIVATE_REQUIRED);
        else if(isPrivate && !isRequired) return new AloftAccess(AloftAccess.AloftAccessType.PRIVATE_STATIC);
        else if(!isPrivate && isRequired && !isStatic) return new AloftAccess(AloftAccess.AloftAccessType.PUBLIC_REQUIRED);
        else if(!isPrivate && !isRequired) return new AloftAccess(AloftAccess.AloftAccessType.PUBLIC_STATIC);
        return new AloftAccess(AloftAccess.AloftAccessType.PUBLIC); //FIXME (compiler error)
    }

}
