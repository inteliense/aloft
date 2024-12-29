package org.extendedweb.aloft.lib.lang.structure.elements.types;

import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;

public class ColumnAloftElement extends AloftElement {

    public ColumnAloftElement() { super(); init(); }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        HtmlElement root = createElement("div");
        addAll(root, theme, mapper);
        applyStyle("col", ColumnAloftElement.class, root, theme);
        return root;
    }

    @Override
    protected String name() {
        return "__centered__";
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
        return true;
    }

    @Override
    protected void setupProperties(AloftObjectProperties vars) { }

}
