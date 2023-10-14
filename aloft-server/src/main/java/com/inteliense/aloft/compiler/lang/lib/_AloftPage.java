package com.inteliense.aloft.compiler.lang.lib;

import com.inteliense.aloft.compiler.lang.keywords.AloftPage;
import com.inteliense.aloft.compiler.lang.keywords.components.AloftComponent;
import com.inteliense.aloft.compiler.lang.supporting.DynamicMountableComponent;
import com.inteliense.aloft.compiler.lang.supporting.MountPoint;
import com.inteliense.aloft.compiler.lang.supporting.MountableComponent;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public abstract class _AloftPage {

    //MountableComponent: a component that belongs to a slot (acts like vue router for every component in DOM)
    //DynamicMountableComponent: alternative components / multiple conditional slot values
    //_AloftPage houses the tree of components, on component update, the tree path is given and updated accordingly

    private AloftPage page;
    private String favicon = null;
    private String title = null;
    private MountableComponent root;

    public _AloftPage(String favicon, String title) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        this.favicon = favicon;
        this.title = title;
        this.root = buildTree();
    }

    protected abstract MountableComponent buildTree() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException;

    public MountableComponent getFromPath(String...ids) {
        return this.root;
    }

    protected MountableComponent[] cx(Class<?>... comp) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        ArrayList<AloftComponent> c = new ArrayList<>();
        MountableComponent mc = new MountableComponent() {
            @Override
            protected ArrayList<AloftComponent> build() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
                for(int i=0; i<comp.length; i++) {
                    Constructor<?> construct = comp[i].getConstructor();
                    c.add((AloftComponent) construct.newInstance());
                }
                return c;
            }
        };
        MountableComponent[] arr = new MountableComponent[c.size()];
        c.toArray(arr);
        return arr;
    }

    protected MountableComponent mountable(Object... comp) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return new MountableComponent() {
            @Override
            protected ArrayList<AloftComponent> build() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
                ArrayList<AloftComponent> components = new ArrayList<>();
                Class<?>[] classes = new Class[comp.length];
                for(int i=0; i<comp.length; i++) {
                    if(comp[i] instanceof DynamicMountableComponent) {
                        classes[i] = MountPoint.class;
                    } else if(comp[i] instanceof Class<?>) {
                        classes[i] = (Class<?>) comp[i];
                    }
                }
                MountableComponent[] mountableComponents = cx(classes);
                components.addAll(Arrays.asList(mountableComponents));
                return components;
            };
        };
    }

    protected DynamicMountableComponent group(Class<?>... m) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        DynamicMountableComponent dmc = new DynamicMountableComponent() {
            @Override
            protected void mountables(HashMap<String, MountableComponent> map) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
                MountableComponent[] mountables = cx(m);
                for(int i=0; i<mountables.length; i++) {
                    map.put(mountables[i].getId(), mountables[i]);
                }
            }
        };
        return dmc;
    }

}
