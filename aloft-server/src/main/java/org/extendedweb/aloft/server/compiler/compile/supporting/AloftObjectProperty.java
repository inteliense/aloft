package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.DynamicT;
import org.extendedweb.aloft.lib.lang.types.v.NullV;
import org.extendedweb.aloft.server.compiler.compile.base.TypeCompiler;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class  AloftObjectProperty {

    private String name;
    private boolean required;
    private T type;
    private V value;
    private CompiledObjectsRegister register;

    public AloftObjectProperty(String name, CompiledObjectsRegister register, boolean required) {
        this.name = name;
        this.type = new DynamicT();
        this.required = required;
        this.register = register;
    }

    public AloftObjectProperty(String name, T type, CompiledObjectsRegister register, boolean required) {
        this.name = name;
        this.type = type;
        this.required = required;
        this.register = register;
    }

    public AloftObjectProperty cloneProperty(T type, ContextContainer value, AtomicReference<ArrayList<AloftVariable>> variables) throws CompilerException {
        AloftObjectProperty property = new AloftObjectProperty(this.name, type, register, this.required);
        property.set(type, value, variables);
        return property;
    }

    public void set(T type, ContextContainer value, AtomicReference<ArrayList<AloftVariable>> variables) throws CompilerException {
        this.type = type;
        this.value = compileValue(value, variables);
    }

    private V compileValue(ContextContainer value, AtomicReference<ArrayList<AloftVariable>> variables) throws CompilerException {
        return TypeCompiler.compile(type, value, register, variables);
    }

    public T getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public V getValue() {
        return value;
    }
}
