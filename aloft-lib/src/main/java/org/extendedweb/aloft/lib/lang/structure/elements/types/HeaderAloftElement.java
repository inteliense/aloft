package org.extendedweb.aloft.lib.lang.structure.elements.types;

import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.html.elements.types.Content;
import org.extendedweb.aloft.lib.lang.structure.elements.base.styles.AloftHeaderInstance;
import org.extendedweb.aloft.lib.lang.types.base.T;

import java.util.ArrayList;

public class HeaderAloftElement extends AloftElement {

    public HeaderAloftElement() { super(); init(); }

    public HeaderAloftElement(String text) {
        super();
        init();
        vars.replace("text", text);
    }

    public HeaderAloftElement(String text, String constant) {
        super();
        init();
        vars.replace("text", text);
        vars.replace("constant", new AloftHeaderInstance());
    }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        HtmlElement root = createElement(var("tag"), this.uniqueId, this.getName());
        Content rootContent = new Content(var("text"));
        root.addChild(rootContent);
        this.addAll(root, theme, mapper);
        this.applyStyle(root, theme);
        this.applyListeners("text", root);
        return root;
    }

    @Override
    protected String name() {
        return "__header__";
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
        return true;
    }

    @Override
    protected boolean acceptsChild() {
        return true;
    }

    @Override
    protected void setupProperties(AloftObjectProperties vars) {
        vars.replace("tag", "h1");
    }

    @Override
    public AloftObjectProperties getProperties() {
        return properties();
    }

    public static AloftObjectProperties properties() {
        AloftObjectProperties props = new AloftObjectProperties();
        props.put("text", T.string(), true);
//        props.put("constant", T.instance(AloftHeaderInstance.class));
        props.put("tag", T.string());

        props.put("style", T.style());
        return props;
    }

}
