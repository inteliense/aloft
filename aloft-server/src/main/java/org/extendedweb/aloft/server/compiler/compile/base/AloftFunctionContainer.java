package org.extendedweb.aloft.server.compiler.compile.base;

import org.extendedweb.aloft.lib.html.elements.js.JavaScriptObject;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.server.compiler.compile.base.functions.base.AloftFunctionObject;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftAccess;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObject;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftVariable;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;

import java.util.ArrayList;
import java.util.HashMap;

public class AloftFunctionContainer {

    private AloftFunctionType type;
    private boolean isArray = false;
    private String name;
    private ArrayList<String> args;
    private AloftParser.Function_curly_blockContext body;
    private HashMap<String, AloftVariable> variables = new HashMap<>();
    private AloftAccess.AloftAccessType access;
    private AloftFunctionDivider divider;

    public AloftFunctionContainer(AloftFunctionType type, boolean isArray, AloftAccess.AloftAccessType access, String name, ArrayList<String> args, AloftParser.Function_curly_blockContext body, CompiledObjectsRegister register, AloftObject aloftObject) {
        this.type = type;
        this.isArray = isArray;
        this.access = access;
        this.name = name;
        this.args = args;
        this.body = body;
        for(String arg : args) {
            variables.put(arg, new AloftVariable(AloftAccess.AloftAccessType.FUNCTION_ARG, arg, T.dynamic(), V.unset(), false, name));
        }
        this.divider = (type == AloftFunctionType.UPDATE) ? new AloftFunctionDivider(true, body, variables, register, aloftObject) : new AloftFunctionDivider(body, variables, register, aloftObject);
    }

    public String getName() {
        return name;
    }

    public boolean isArray() {
        return isArray;
    }

    public ArrayList<String> getArgs() {
        return args;
    }

    public ArrayList<AloftFunctionObject> objects() {
        return null;
    }

    public JavaScriptObject[] js() {
        return null;
    }

    public AloftServerCode server() {
        return null;
    }

}
