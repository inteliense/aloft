package org.extendedweb.aloft.server.compiler.compile.base.register;

import org.extendedweb.aloft.lib._AloftObjects;
import org.extendedweb.aloft.lib._AloftProject;
import org.extendedweb.aloft.lib.application.cache.RouteCache;
import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.http.middleware.types.HasHeaders;
import org.extendedweb.aloft.lib.http.supporting.Route;
import org.extendedweb.aloft.lib.lang.types.base.A;
import org.extendedweb.aloft.server.compiler.compile.base.AloftFunction;
import org.extendedweb.aloft.server.compiler.compile.base.AloftFunctionContainer;
import org.extendedweb.aloft.server.compiler.compile.base.objects.*;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftObject;
import org.extendedweb.aloft.server.compiler.compile.supporting.AloftVariable;
import org.extendedweb.aloft.server.compiler.compile.supporting.ContextContainer;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.utils.global.__;

import javax.management.Query;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CompletionService;

public class CompiledObjectsRegister {

    private String childName = null;
    private HashMap<Class<?>, HashMap<String, CompiledObjectsRegister>> register = new HashMap<>();
    private ArrayList<Object> objects = new ArrayList<>();
    private ComponentObjectRegister components = null;

    public CompiledObjectsRegister(String name) {
        this.childName = name;
    }

    public CompiledObjectsRegister(ComponentObjectRegister components) {
        this.components = components;
        this.components.registerBuiltin(this);
    }

    public ComponentObjectRegister getComponentsRegister() {
        return components;
    }

    public void register(Class<? extends AloftObject> parent, AloftObject instance, Object childInstance, ContextContainer ctx) throws CompilerException {
        HashMap<String, CompiledObjectsRegister> child = this.register.containsKey(parent) ? this.register.get(parent) : new HashMap<>();
        if(this.register.containsKey(parent)) {
            if(child.containsKey(instance.getName())) {
                CompiledObjectsRegister childRegister = child.get(instance.getName());
                this.register.get(parent).replace(instance.getName(), childRegister);
                childRegister.register(getExtendedInstanceType(instance), instance, childInstance, ctx);
                childRegister.appendObjects(childInstance);
            } else {
                CompiledObjectsRegister childRegister = new CompiledObjectsRegister(instance.getName());
                this.register.get(parent).put(instance.getName(), childRegister);
                childRegister.register(getExtendedInstanceType(instance), instance, childInstance, ctx, true);
                childRegister.appendObjects(childInstance);
            }
        } else {
            CompiledObjectsRegister childRegister = new CompiledObjectsRegister(instance.getName());
            this.register.put(parent, new HashMap<>());
            this.register.get(parent).put(instance.getName(), childRegister);
            childRegister.register(getExtendedInstanceType(instance), instance, childInstance, ctx, true);
            childRegister.appendObjects(childInstance);
        }
    }

    public void register(Class<? extends AloftObject> parent, AloftObject instance, ContextContainer ctx) throws CompilerException {
        HashMap<String, CompiledObjectsRegister> child = this.register.containsKey(parent) ? this.register.get(parent) : new HashMap<>();
        if(this.register.containsKey(parent)) {
            if(child.containsKey(instance.getName())) {
                CompiledObjectsRegister childRegister = child.get(instance.getName());
                childRegister.register(getExtendedInstanceType(instance), instance, ctx);
                childRegister.appendObjects(instance);
                this.register.get(parent).replace(instance.getName(), childRegister);
            } else {
                CompiledObjectsRegister childRegister = new CompiledObjectsRegister(instance.getName());
                this.register.get(parent).put(instance.getName(), childRegister);
                childRegister.register(getExtendedInstanceType(instance), instance, ctx, true);
                childRegister.appendObjects(instance);
            }
        } else {
            CompiledObjectsRegister childRegister = new CompiledObjectsRegister(instance.getName());
            this.register.put(parent, new HashMap<>());
            this.register.get(parent).put(instance.getName(), childRegister);
            childRegister.register(getExtendedInstanceType(instance), instance, ctx, true);
            childRegister.appendObjects(instance);
        }
    }

    public void register(Class<? extends AloftObject> parent, AloftObject instance, Object childInstance, ContextContainer ctx, boolean init) throws CompilerException {
        HashMap<String, CompiledObjectsRegister> child = this.register.containsKey(parent) ? this.register.get(parent) : new HashMap<>();
        if(this.register.containsKey(parent)) {
            if(child.containsKey(instance.getName())) {
                CompiledObjectsRegister childRegister = child.get(instance.getName());
                childRegister.register(getExtendedInstanceType(instance), instance, childInstance, ctx, false);
                childRegister.appendObjects(childInstance);
                this.register.get(parent).replace(instance.getName(), childRegister);
            }
        }
    }

    public void register(Class<? extends AloftObject> parent, AloftObject instance, ContextContainer ctx, boolean init) throws CompilerException {
        HashMap<String, CompiledObjectsRegister> child = this.register.containsKey(parent) ? this.register.get(parent) : new HashMap<>();
        if(this.register.containsKey(parent)) {
            if(child.containsKey(instance.getName())) {
                CompiledObjectsRegister childRegister = child.get(instance.getName());
                childRegister.register(getExtendedInstanceType(instance), instance, ctx);
                childRegister.appendObjects(instance);
                this.register.get(parent).replace(instance.getName(), childRegister);
            }
        }
    }

    public void appendObjects(Object o) {
        this.objects.add(o);
    }

    public CompiledObjectsRegister getChildRegister(Class<?> parent, String identifier) {
        return register.get(parent).get(identifier);
    }

    public ArrayList<AloftVariable> getVars(Class<?> parent, String identifier) {
        CompiledObjectsRegister register = this.register.get(parent).get(identifier);
        ArrayList<AloftVariable> list = new ArrayList<>();
        ArrayList<Object> all = register.getObjects();
        for(Object o : all) {
            Class<?> c = getObjectInstanceType(o);
            if(c.equals(AloftVariable.class)) list.add(((AloftVariable) o));
        }
        return list;
    }

    public ArrayList<AloftVariable> getVars() {
        ArrayList<AloftVariable> list = new ArrayList<>();
        ArrayList<Object> all = getObjects();
        for(Object o : all) {
            Class<?> c = getObjectInstanceType(o);
            if(c.equals(AloftVariable.class)) list.add(((AloftVariable) o));
        }
        return list;
    }

    public ArrayList<Object> getObjects() {
        return objects;
    }

    private static Class<? extends AloftObject> getExtendedInstanceType(AloftObject object) {
        if(object instanceof ComponentAloftObject) return ComponentAloftObject.class;
        if(object instanceof PageAloftObject) return PageAloftObject.class;
        if(object instanceof ProjectAloftObject) return ProjectAloftObject.class;
        if(object instanceof QueryAloftObject) return QueryAloftObject.class;
        if(object instanceof ModelAloftObject) return ModelAloftObject.class;
        if(object instanceof RouteGroupAloftObject) return RouteGroupAloftObject.class;
        return null;
    }

    private static Class<?> getObjectInstanceType(Object object) {
        if(object instanceof ComponentAloftObject) return ComponentAloftObject.class;
        if(object instanceof PageAloftObject) return PageAloftObject.class;
        if(object instanceof ProjectAloftObject) return ProjectAloftObject.class;
        if(object instanceof QueryAloftObject) return QueryAloftObject.class;
        if(object instanceof ModelAloftObject) return ModelAloftObject.class;
        if(object instanceof RouteGroupAloftObject) return RouteGroupAloftObject.class;
        if(object instanceof AloftFunctionContainer) return AloftFunctionContainer.class;
        if(object instanceof AloftVariable) return AloftVariable.class;
        return null;
    }

    private String getIdentifier(Object object) {
        if(object instanceof ComponentAloftObject) return ((ComponentAloftObject) object).getName();
        if(object instanceof PageAloftObject) return ((PageAloftObject) object).getName();
        if(object instanceof ProjectAloftObject) return ((ProjectAloftObject) object).getName();
        if(object instanceof QueryAloftObject) return ((QueryAloftObject) object).getName();
        if(object instanceof ModelAloftObject) return ((ModelAloftObject) object).getName();
        if(object instanceof RouteGroupAloftObject) return ((RouteGroupAloftObject) object).getName();
        if(object instanceof AloftFunctionContainer) return ((AloftFunctionContainer) object).getName();
        if(object instanceof AloftVariable) return ((AloftVariable) object).getIdentifier();
        return null;
    }

    public boolean exists(HashMap<String, CompiledObjectsRegister> register, String identifier) {
        if(register.isEmpty() || !register.containsKey(identifier)) return false;
        return true;
    }

    public Object get(Class<?> parent, String parentName, String childName) {
        if(!register.containsKey(parent)) return null;
        HashMap<String, CompiledObjectsRegister> map = register.get(parent);
        if(!exists(map, parentName)) return null;
        CompiledObjectsRegister objects = map.get(parentName);
        ArrayList<Object> list = objects.getObjects();
        for(Object o : list) {
            String identifier = getIdentifier(o);
            if(__.same(childName, identifier)) return o;
        }
        return null;
    }

    public ArrayList<Object> getList(Class<?> parent, String identifier) {
        if(!register.containsKey(parent)) return null;
        HashMap<String, CompiledObjectsRegister> map = register.get(parent);
        if(!exists(map, identifier)) return null;
        return map.get(identifier).getObjects();
    }

    public RouteCache getRouteCache() {
        ArrayList<Route> routes = new ArrayList<>();
        HashMap<String, CompiledObjectsRegister> routeGroups = register.get(RouteGroupAloftObject.class);
        for(String key : routeGroups.keySet()) {
            CompiledObjectsRegister register = routeGroups.get(key);
            ArrayList<Object> list = register.getObjects();
            System.out.println(list.size());
            for(Object o : list) {
                routes.addAll(((RouteGroupAloftObject) o).getRoutes());
            }
        }
        return new RouteCache(routes);
    }

    public _AloftProject buildProject() {
        return null;
    }

    private AppConfig parseConfig(String configPath) {
        return new AppConfig(configPath);
    }

}
