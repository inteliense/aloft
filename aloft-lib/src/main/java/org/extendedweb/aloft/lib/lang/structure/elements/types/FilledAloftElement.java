package org.extendedweb.aloft.lib.lang.structure.elements.types;

import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.lang.types.base.T;

import java.util.ArrayList;

public class FilledAloftElement extends AloftElement {

    public FilledAloftElement() { super(); init(); }

    public void setScrollbar(boolean x, boolean y) {
        this.vars.replace("scrollbar-x", x);
        this.vars.replace("scrollbar-y", y);
        if(x) addStyle("overflow-x", "scroll");
        if(y) addStyle("overflow-y", "scroll");
    }

    public void useFullSize() {
        this.vars.replace("use-view", false);
        addStyle("width", "100%");
        addStyle("height", "100%");
    }

    public void useViewSize() {
        this.vars.replace("use-view", true);
        addStyle("width", "100vw");
        addStyle("height", "100vh");
    }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        HtmlElement root = createElement("div");
        addAll(root, theme, mapper);
        applyStyle(root, theme);
        return root;
    }

    @Override
    protected String name() {
        return "__filled__";
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
        this.vars.put("scrollbar-y", false);
        this.vars.put("scrollbar-x", false);
        this.vars.put("use-view", false);
    }

    public static AloftObjectProperties properties() {
        AloftObjectProperties props = new AloftObjectProperties();
        props.put("scrollbar-y", T.bool());
        props.put("scrollbar-x", T.bool());
        props.put("use-view", T.bool());
        return props;
    }
    }
