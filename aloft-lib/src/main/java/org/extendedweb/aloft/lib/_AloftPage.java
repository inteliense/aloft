package org.extendedweb.aloft.lib;

import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.structure.components.AloftRoot;
import org.extendedweb.aloft.lib.lang.supporting.DynamicMountableComponent;
import org.extendedweb.aloft.lib.lang.supporting.MountPoint;
import org.extendedweb.aloft.lib.lang.supporting.MountableComponent;
import org.extendedweb.aloft.utils.global.__;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public abstract class _AloftPage implements AloftPageImpl {

    //MountableComponent: a component that belongs to a slot (acts like vue router for every component in DOM)
    //DynamicMountableComponent: alternative components / multiple conditional slot values
    //_AloftPage houses the tree of components, on component update, the tree path is given and updated accordingly

    private String path = "/";
    private String favicon = null;
    private String title = null;
    private MountableComponent root;

    public _AloftPage(String favicon, String title, String path)  {
        this.favicon = favicon;
        this.title = title;
        this.path = path;
        try {
            this.root = buildTree();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected abstract MountableComponent buildTree() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException;

    public AloftComponent getFromPath(String...ids) {
        return this.root;
    }

    public MountableComponent getRoot() {
        if(!__.isset(root))  System.exit(97);
        return this.root;
    }

    public String getPath() {
        return path;
    }

    protected AloftComponent[] cy(Class<?>... comp) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        ArrayList<AloftComponent> c = new ArrayList<>();
        for(int i=0; i<comp.length; i++) {
            Constructor<?> construct = comp[i].getConstructor();
            c.add((AloftComponent) construct.newInstance());
        }
        AloftComponent[] arr = new AloftComponent[c.size()];
        c.toArray(arr);
        return arr;
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

    protected MountableComponent page(Object... comp) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return (mountable(comp));
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
                        AloftComponent[] mountableComponents = cy(classes);
                        components.addAll(Arrays.asList(mountableComponents));
                    } else if(comp[i] instanceof AloftComponent) {
                        components.add((AloftComponent) comp[i]);
                    } else if(comp[i] instanceof Class<?>) {
                        classes[i] = (Class<?>) comp[i];
                        AloftComponent[] mountableComponents = cy(classes);
                        components.addAll(Arrays.asList(mountableComponents));
                    }
                }
                return components;
            };
        };
    }

    protected MountableComponent mountable(AloftComponent... comp) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        return new MountableComponent() {

            @Override
            protected ArrayList<AloftComponent> build() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
                ArrayList<AloftComponent> components = new ArrayList<>();
                for(AloftComponent component : comp) {
                    components.add(component);
                }
                return components;
            };
        };
    }

    protected DynamicMountableComponent slot(Class<?> i, Class<?>... m) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        DynamicMountableComponent dmc = new DynamicMountableComponent() {
            @Override
            public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
                return null;
            }

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
