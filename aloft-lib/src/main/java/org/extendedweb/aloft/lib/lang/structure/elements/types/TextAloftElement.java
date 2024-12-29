package org.extendedweb.aloft.lib.lang.structure.elements.types;

import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.html.elements.types.Content;
import org.extendedweb.aloft.lib.lang.types.base.T;

public class TextAloftElement extends AloftElement {

    public TextAloftElement() { super(); init(); }

    public void setText(String text) {
        this.vars.replace("text", text);
    }

    public void addSpan(TextAloftElement element) {
        addChild(element);
    }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        HtmlElement root = createElement("p", this.uniqueId, this.getName());
        Content rootContent = new Content(var("text"));
        root.addChild(rootContent);
        this.addAll(root, theme, mapper);
        this.applyStyle(root, theme);
        this.applyListeners("text", root);
        return root;
    }

    @Override
    protected String name() {
        return "__text__";
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
        props.put("text", T.string(), true);
        props.put("style", T.style());
        return props;
    }

}
