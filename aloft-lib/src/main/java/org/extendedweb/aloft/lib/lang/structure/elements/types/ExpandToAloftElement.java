package org.extendedweb.aloft.lib.lang.structure.elements.types;

import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.lang.types.base.T;

import java.util.ArrayList;

public class ExpandToAloftElement extends AloftElement {

    public ExpandToAloftElement() { super(); init(); }

    //vars...
    //width = expandToParent, expandToLimit, expandToConstant, expandToMin, expandToMax, expandToConstantInt, expandToMinInt, expandToMaxInt,

    public void setSize(String width, String height) {
        this.vars.replace("height", height);
        this.vars.replace("width", width);
    }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        HtmlElement root = createElement("div");
        addAll(root, theme, mapper);
        addStyle("width", "60%");
        addStyle("height", var("height"));
        addStyle("margin", "auto 0");
        applyStyle(root, theme);
        return root;
    }

    @Override
    protected String name() {
        return "__expand_to__";
    }

    @Override
    protected boolean acceptsIterator() {
        return false;
    }

    @Override
    protected boolean acceptsBuilder() {
        return false;
    }

    @Override
    protected boolean requiresBuilder() {
        return false;
    }

    @Override
    protected boolean isExtensible() {
        return false;
    }

    @Override
    protected boolean acceptsChild() {
        return false;
    }

    @Override
    protected void setupProperties(AloftObjectProperties vars) {
        this.vars.put("height", "100%");
        this.vars.put("width", "100%");
    }

    public static AloftObjectProperties properties() {
        AloftObjectProperties props = new AloftObjectProperties();
        props.put("height", T.instance("height", T.string()));
        props.put("width", T.instance("width", T.string()));
        return props;
    }

}
