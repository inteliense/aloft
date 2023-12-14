package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.extendedweb.aloft.lib.lang.types.base.V;
import org.extendedweb.aloft.lib.lang.types.v.ComparisonV;
import org.extendedweb.aloft.server.compiler.compile.base.AloftFunction;

import java.util.ArrayList;

public class AloftRenderConditionGroup {

    private ArrayList<AloftRenderCondition> conditions;

    public AloftRenderConditionGroup() { }

    public AloftRenderConditionGroup subgroup() {
        return new AloftRenderConditionGroup();
    }

    public AloftRenderConditionGroup add(AloftFunction left, ComparisonV operator, V right) {
        return this;
    }

    public AloftRenderConditionGroup or(AloftFunction left, ComparisonV operator, V right) {
        return this;
    }

    public AloftRenderConditionGroup and(AloftFunction left, ComparisonV operator, V right) {
        return this;
    }

    public V get() {
        if(!test()) return V.nothing();
        return V.nothing();
    }

    public boolean test() {
        return true;
    }

    public boolean exit() {
        return false;
    }

    private static class AloftRenderCondition {

    }

}
