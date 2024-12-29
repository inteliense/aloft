package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class AloftComponentBuilder extends V {

    private AloftComponentNode root;
    private AtomicReference<ArrayList<AloftVariable>> variables;

    public AloftComponentBuilder(ContextContainer container, CompiledObjectsRegister register, AtomicReference<ArrayList<AloftVariable>> variables) throws CompilerException {
        this.root = new AloftComponentNode(container, register, variables);
    }

    @Override
    public <Any> Any get() {
        return (Any) root.component();
    }

    public <Any> Any get(CompiledObjectsRegister compiledObjectsRegister) {
        return (Any) root.build(compiledObjectsRegister, variables);
    }

    @Override
    public T type() {
        return null;
    }
}
