package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.ModuleElementAttributes;
import org.extendedweb.aloft.lib.html.Html;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperty;
import org.extendedweb.aloft.lib.lang.structure.elements.types.TextAloftElement;
import org.extendedweb.aloft.lib.lang.types.base.A;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.AloftComponentT;
import org.extendedweb.aloft.lib.lang.types.t.ArrayT;
import org.extendedweb.aloft.lib.lang.types.t.DynamicT;
import org.extendedweb.aloft.lib.lang.types.v.AloftComponentV;
import org.extendedweb.aloft.lib.lang.types.v.UndefinedV;
import org.extendedweb.aloft.server.compiler.compile.base.TypeCompiler;
import org.extendedweb.aloft.server.compiler.compile.base.objects.ComponentAloftObject;
import org.extendedweb.aloft.server.compiler.compile.base.objects.PageAloftObject;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.base.register.ComponentObjectRegister;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.extendedweb.aloft.utils.encryption.A32;
import org.extendedweb.aloft.utils.encryption.Rand;
import org.extendedweb.aloft.utils.encryption.SHA;
import org.extendedweb.aloft.utils.global.__;

import javax.naming.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class AloftComponentNode {

    private String name;
    private String id;
    private ArrayList<AloftComponentProperty> properties = new ArrayList<>();
    private ArrayList<AloftComponentNode> children = new ArrayList<>();
    private AloftRenderConditions conditions;
    private AloftComponentClass thisComponent;

    public AloftComponentNode(ContextContainer container, CompiledObjectsRegister register, AtomicReference<ArrayList<AloftVariable>> variables) throws CompilerException {
        AloftParser.Component_treeContext ctx = (AloftParser.Component_treeContext) container.context();
        AloftParser.Var_nameContext varCtx = ctx.var_name();
        name = varCtx.getText();
        if(!register.getComponentsRegister().exists(name)) new ContextContainer(varCtx, container.getFile()).e("Component '" + name + "' not found within scope.", CompilerException.ExceptionType.FATAL);
        thisComponent = register.getComponentsRegister().get(name);
        ArrayList<AloftVariable> vars = register.getComponentsRegister().get(name).getVariables().get();
        System.out.println("vars.size()=" + vars.size());
        List<AloftParser.PropertyContext> properties = ctx.property();
        int requiredSize = 0;
        int requiredCompiled = 0;
        for(AloftVariable variable : vars) if(variable.isRequired()) requiredSize++;
        for(AloftParser.PropertyContext property : properties) {
            AloftParser.Var_nameContext nameCtx = property.var_name();
            String name = nameCtx.getText();
            AloftVariable variable = null;

            for(AloftVariable v : vars) {
                if(v.isCurrent(this.name, name)) {
                    if(v.isRequired()) requiredCompiled++;
                    variable = v;
                    break;
                }
            }

            if(!__.isset(variable)) {
                System.out.println("this.name=" + this.name);
                System.out.println(register.getComponentsRegister().get(this.name).getVariables());
                new ContextContainer(varCtx, container.getFile()).e("Component property '" + name + "' not found within the component.", CompilerException.ExceptionType.CRITICAL);
                continue;
            }

            ArrayList<AloftVariable> ___v = variables.get() == null ? new ArrayList<>() : variables.get();
            ArrayList<AloftVariable> __v = new ArrayList<>(___v);

            AloftParser.Property_valueContext valueCtx = property.property_value();
            if(__.isset(valueCtx.component_tree())) {
                ContextContainer ctxContainer = new ContextContainer(valueCtx.component_tree(), container.getFile());
                AloftComponentNode node = new AloftComponentNode(ctxContainer, register, variables);
                AloftComponent component = node.build(register, variables);
                AloftComponentV componentV = new AloftComponentV(component);
                AloftComponentProperty prop = new AloftComponentProperty(name, componentV);
                this.properties.add(prop);
                children.add(node);
            } else {
                AloftComponentProperty prop = new AloftComponentProperty(name, TypeCompiler.compile(variable.getType(), new ContextContainer(valueCtx, container.getFile()), register, variables));
                this.properties.add(prop);
                if(prop.getName().equals("text")) {
                    System.out.println(this.name);
                    System.out.println(name);
                }
                for(int i=0; i<__v.size(); i++) {
                    __v.get(i).next(this.name);
                    System.out.println(__v.get(i).getXpath());
                }
                variables.set(__v);
            }
            if(variable.isRequired()) requiredCompiled++;
        }

    }

    public AloftComponent build(CompiledObjectsRegister register, AtomicReference<ArrayList<AloftVariable>> variables) {
        System.out.println("BUILD");
        AloftComponent c;
        if (__.isset(register.getComponentsRegister().getComponent(name))) {
            c = register.getComponentsRegister().getComponent(name);
            if (name.equals("__text__")) {
                System.exit(77);
            }
            c.setVars(getComponentVars());
        } else {
            c = new AloftComponent() {
                @Override
                public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
                    AloftComponent c = thisComponent.getComponent();
                    c.setVars(getComponentVars());
                    return c.create(theme, mapper);
                }

                @Override
                public String getName() {
                    return name;
                }

//                @Override
//                public AloftObjectProperties getProperties() {
//                    AloftObjectProperties props = new AloftObjectProperties();
//                    for (AloftVariable variable : variables.get()) {
//                        if (variable.isRequired()) {
//                            props.put(variable.getIdentifier(), variable.getType(), true);
//                            if (variable.isset()) {
//                                props.get(variable.getIdentifier()).replace(variable.value());
//                            }
//                        } else if (!variable.isRequired()) {
//                            props.put(variable.getIdentifier(), variable.getType(), false);
//                            if (variable.isset()) {
//                                props.get(variable.getIdentifier()).replace(variable.value());
//                            }
//                        }
//                    }
//                    return props;
//                }
            };
        }
//        ArrayList<AloftObjectProperty> objectProps = new ArrayList<>();
//        for(AloftComponentProperty prop : properties) {
//              objectProps.add(new AloftObjectProperty(prop.getName(), prop.getValue()));
//        }
//        c.setVars(objectProps);
        return c;
    }

    public AloftComponent build(CompiledObjectsRegister register) {
        System.out.println(name);
        System.out.println("BUILD 2");
        AloftComponent c;
        if(__.isset(register.getComponentsRegister().getComponent(name))) {
            c = register.getComponentsRegister().getComponent(name);
            c.setVars(getComponentVars());
        } else {
            c = new AloftComponent() {
                @Override
                public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
                    AloftComponent c = thisComponent.getComponent();
                    c.setVars(getComponentVars());
                    return c.create(theme, mapper);
                }

                @Override
                public String getName() {
                    return name;
                }
            };
        }
//        ArrayList<AloftObjectProperty> objectProps = new ArrayList<>();
//        for(AloftComponentProperty prop : properties) {
//            objectProps.add(new AloftObjectProperty(prop.getName(), prop.getValue()));
//        }
//        c.setVars(objectProps);
        return c;
    }

    public AloftComponent component() {
        return new AloftComponent() {
            @Override
            public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
                AloftComponent c = thisComponent.getComponent();
                c.setVars(getComponentVars());
                return c.create(theme, mapper);
            }

            @Override
            public String getName() {
                return name;
            }
        };
    }

    private ArrayList<AtomicReference<AloftObjectProperty>> getComponentVars() {
        ArrayList<AtomicReference<AloftObjectProperty>> vars = new ArrayList<>();
        for(AloftComponentProperty prop : properties) {
            vars.add(prop.getSupportingClass());
        }
        return vars;
    }

    public static class AloftComponentProperty {
        private String name;
        private V value;
        private boolean hasConditions = false;
        private AloftRenderConditions conditions = null;

        public AloftComponentProperty(String name, AloftRenderConditions conditions) {
            this.name = name;
            this.conditions = conditions;
            this.hasConditions = true;
        }

        public AloftComponentProperty(String name, V value) {
            this.name = name;
            this.value = value;
        }

        public V getValue() {
            if(hasConditions) return conditions.val();
            return value;
        }

        public String getName() {
            return name;
        }

        public AtomicReference<AloftObjectProperty> getSupportingClass() {
            return new AtomicReference<AloftObjectProperty>(new AloftObjectProperty(name, value));
        }

    }

}
