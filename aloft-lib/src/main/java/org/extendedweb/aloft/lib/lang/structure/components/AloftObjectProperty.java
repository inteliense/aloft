package org.extendedweb.aloft.lib.lang.structure.components;

import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.t.DynamicT;
import org.extendedweb.aloft.lib.lang.types.v.DynamicV;
import org.extendedweb.aloft.lib.lang.types.v.NullV;
import org.extendedweb.aloft.utils.global.__;

import java.util.concurrent.atomic.AtomicReference;

public class AloftObjectProperty {

    private String name;
    private T type = null;
    private AtomicReference<V> value = new AtomicReference<V>();
    private boolean required = false;

    public AloftObjectProperty(String name, boolean required) {
        this.name = name;
        this.required = required;
    }

    public AloftObjectProperty(String name, V v) {
        this.name = name;
        set(v);
    }

    public AloftObjectProperty(String name, T type, boolean required) {
        this.type = type;
        this.name = name;
        this.required = required;
    }

    public AloftObjectProperty(String name, T type, Object value) {
        this.type = type;
        this.name = name;
        set(value);
    }

    public boolean replace(Object v) {
        return set(v);
    }

    public boolean replace(T type, Object v) {
        if(__.isset(this.type) && this.type instanceof DynamicT) return set(v);
        else if(__.isset(this.type) && type.getClass().equals(this.type.getClass())) return set(v);
        else if(!__.isset(this.type)) return set(v);
        else return false;
    }

    private boolean set(T type, Object v) {
        if(__.isset(this.type) && this.type instanceof DynamicT) return set(v);
        else if(__.isset(this.type))
            if (type.getClass().equals(this.type.getClass())) return set(v);
       return false;
    }

    private boolean set(Object v) {
        if(!__.isset(v) || v instanceof NullV) this.value.set(new NullV());
        else if(__.isset(type) && type instanceof DynamicT && v instanceof DynamicV) this.value.set((DynamicV) v);
        else if(__.isset(type) && type instanceof DynamicT) this.value.set(type.value(v));
        else if(__.isset(type) && v instanceof V) {
            if(!__.isset(((V) v).type())) return false;
            if(((V) v).type().getClass().equals(type.getClass())) this.value.set((V) v);
        }
        else if(__.isset(type)) this.value.set(type.value(v));
        else if(v instanceof V) this.value.set((V) v);
        else if(__.isset(T.type(v))) this.value.set(T.type(v).value(v));
        else { this.value.set(new NullV()); return false; }
        return true;
    }

    public boolean isRequired() {
        return required;
    }

    public String getName() {
        return this.name;
    }

    public V value() {
        if(!__.isset(value)) return new NullV();
        return value.get();
    }

    public T type() {
        return type;
    }

}
