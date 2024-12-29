package org.extendedweb.aloft.lib.lang.structure.components;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

public class AloftObjectProperties {

    private HashMap<String, ArrayList<AtomicReference<AloftObjectProperty>>> collection = new HashMap<>();

    public AloftObjectProperties() { }

    public ArrayList<AtomicReference<AloftObjectProperty>> base() {
        if(!collection.containsKey("*")) return new ArrayList<>();
        return collection.get("*");
    }

    public ArrayList<AtomicReference<AloftObjectProperty>> all() {
        ArrayList<AtomicReference<AloftObjectProperty>> all = new ArrayList<>();
        for(String key : collection.keySet()) all.addAll(collection.get(key));
        return all;
    }

    public ArrayList<AtomicReference<AloftObjectProperty>> get() {
        return base();
    }

    public AtomicReference<AloftObjectProperty> get(String property) {
        ArrayList<AtomicReference<AloftObjectProperty>> list = get();
        for(AtomicReference<AloftObjectProperty> prop: list) {
            if(__.same(prop.get().getName(), property)) return prop;
        }
        return null;
    }

    public void replace(String name, Object v) {
        ArrayList<String> occurrences = containedIn(name);
          for(String key : occurrences) {
              ArrayList<AtomicReference<AloftObjectProperty>> c = collection.get(key);
              for(AtomicReference<AloftObjectProperty> prop : c) {
                  if(prop.get().getName().equals(name)) {
                      AloftObjectProperty property = prop.get();
                      property.replace(v);
                      prop.set(property);
                  }
              }
        }
    }

    public void put(String name, Object v) {
        ArrayList<AtomicReference<AloftObjectProperty>> c = collection.get("*");
        for(AtomicReference<AloftObjectProperty> prop : c) {
            if(prop.get().getName().equals(name)) {
                AloftObjectProperty p = prop.get();
                p.replace(v);
                prop.set(p);
            }
        }
    }

    public void put(String name, T type) {
        put(name, type, false);
    }

    public void put(String name, T type, boolean required) {
        AtomicReference<AloftObjectProperty> prop = new AtomicReference<>(new AloftObjectProperty(name, type, required));
        if(!collection.containsKey("*")) collection.put("*", new ArrayList<>());
        put(collection.get("*"), prop);
    }

    public void put(ArrayList<AtomicReference<AloftObjectProperty>> current, AtomicReference<AloftObjectProperty> prop) {
        current.add(prop);
    }

//    private boolean put(ArrayList<AtomicReference<AloftObjectProperty>> current, AloftObjectProperty property) {
//        for(AtomicReference<AloftObjectProperty> prop : current) {
//            if(__.same(prop.get().getName(), property.getName())) {
//                prop.set(property);
//                current.add(prop);
//                break;
//            }
//        }
//        return true;
//    }

    private ArrayList<String> containedIn(String name) {
        ArrayList<String> list = new ArrayList<>();
        for(String key : collection.keySet()) {
            if(containedIn(name, key)) list.add(key);
        }
        return list;
    }

    private boolean containedIn(String name, String subtype) {
        if(!collection.containsKey(subtype)) return false;
        ArrayList<AtomicReference<AloftObjectProperty>> current = collection.get(subtype);
        for(AtomicReference<AloftObjectProperty> prop: current) {
            if(__.same(prop.get().getName(), name)) return true;
        }
        return false;
    }

    public AloftObjectProperty get(String name, String key) {
        ArrayList<AtomicReference<AloftObjectProperty>> c = collection.get(name);
        for(AtomicReference<AloftObjectProperty> ref : c) {
            if(ref.get().getName().equals(key)) return ref.get();
        }
        return null;
    }
}
