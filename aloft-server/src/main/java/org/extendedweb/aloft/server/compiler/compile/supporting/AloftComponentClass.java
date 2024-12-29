package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperty;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.lang.types.base.A;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.jibx.binding.Compile;

import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class AloftComponentClass {

    private Class<?> c;
    private AloftComponent component;
    private AtomicReference<ArrayList<AloftVariable>> variables = new AtomicReference<>();

    public AloftComponentClass(Class<? extends AloftElement> c) {
        try {
            this.c = c;
            Constructor<? extends AloftElement> construct = c.getConstructor();
            AloftElement el = construct.newInstance();
            this.component = el;
            this.variables.set(parseVariables(el.getProperties().all()));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public AloftComponentClass(Class<? extends AloftElement> c, String subtype) {
        try {
            this.c = c;
            Constructor<? extends AloftElement> construct = c.getConstructor(String.class);
            AloftElement el = construct.newInstance(subtype);
            this.component = el;
            this.variables.set(parseVariables(el.getProperties().all()));
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public AloftComponentClass(AloftComponentBuilder component, CompiledObjectsRegister register, AtomicReference<ArrayList<AloftVariable>> variables) {
        this.c = AloftComponent.class;
        this.component = component.get(register);
        this.variables = variables;

    }

    public AloftComponentClass(AloftComponent component, CompiledObjectsRegister register, AtomicReference<ArrayList<AloftVariable>> variables) {
        this.c = AloftComponent.class;
        this.component = component;
        this.variables = variables;
        register.getComponentsRegister().put(component.getName(), this);
    }

    public AtomicReference<ArrayList<AloftVariable>> getVariables() {
        return variables;
    }

    public AloftComponent getComponent() {
        return this.component;
    }

    private ArrayList<AloftVariable> parseVariables(ArrayList<AtomicReference<AloftObjectProperty>> properties) {
        ArrayList<AloftVariable> vars = new ArrayList<>();
        for(AtomicReference<AloftObjectProperty> p : properties) {
            AloftObjectProperty prop = p.get();
            if(prop.isRequired()) {
                AloftVariable var = new AloftVariable(AloftAccess.AloftAccessType.PUBLIC_REQUIRED, prop.getName(), prop.type(), V.unset(), true, this.component.getComponentName());
                vars.add(var);
            } else {
                AloftVariable var = new AloftVariable(AloftAccess.AloftAccessType.PUBLIC, prop.getName(), prop.type(), V.unset(), true, this.component.getComponentName());
                vars.add(var);
            }
        }
        return vars;
    }

}
