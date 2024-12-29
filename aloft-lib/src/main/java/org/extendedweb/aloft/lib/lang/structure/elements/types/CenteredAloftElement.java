package org.extendedweb.aloft.lib.lang.structure.elements.types;

import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.lang.types.base.T;

public class CenteredAloftElement extends AloftElement {

    public CenteredAloftElement() { super(); init(); }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        HtmlElement root = createElement("div");
        HtmlElement container = createElement("div");
        addAll(container, theme, mapper);
        container.addChild(((AloftComponent) var("child")).html(theme, mapper));
        container.addStyle("text-align", "center");
        applyStyle("root", CenteredAloftElement.class, root, theme);
        applyStyle("child", CenteredAloftElement.class, container, theme);
        root.addChild(container);
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
    protected void setupProperties(AloftObjectProperties vars) {

    }

    @Override
    public AloftObjectProperties getProperties() {
        return properties();
    }

    public static AloftObjectProperties properties() {
        AloftObjectProperties props = new AloftObjectProperties();
        props.put("child", T.child(), true);
        System.out.println("PROPS SET");
        return props;
    }

}
