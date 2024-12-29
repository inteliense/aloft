package org.extendedweb.aloft.lib.lang.structure.elements.types;

import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftBuilder;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.ModuleElement;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.lang.types.base.T;

import java.util.ArrayList;

public class AlertAloftElement extends AloftElement {

    public AlertAloftElement() { super(); init();  }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        ModuleElement m = theme.getStyleModule().get(this.getClass());
        HtmlElement root = createElement("dialog", m.fromKey("root"));
        HtmlElement dialog = createElement("div", m.fromKey("dialog"));
        root.addChild(dialog);
        HtmlElement content = createElement("div", m.fromKey("content"));
        dialog.addChild(content);
        HtmlElement header = createElement("div", m.fromKey("header"));
//        HtmlElement title = createElement("h5", m.fromKey("title"));
        HtmlElement title = builder.get("title").html(theme, mapper);
        header.addChild(title);
        content.addChild(header);
        return root;
    }

    @Override
    protected void registerBuilder(AloftBuilder builder) {
        builder.addRequirement("title", TextAloftElement.class, "text");
        builder.addRequirement("body", TextAloftElement.class, "text");
        builder.addArrayRequirement("actions", ButtonAloftElement.class);
    }

    @Override
    protected String name() {
        return "__alert__";
    }

    @Override
    protected boolean acceptsIterator() {
        return false;
    }

    @Override
    protected boolean acceptsBuilder() {
        return true;
    }

    @Override
    protected boolean requiresBuilder() {
        return true;
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
        vars = properties();
    }

    public static AloftObjectProperties properties() {
        AloftObjectProperties props = new AloftObjectProperties();
        props.put("title", T.instance("title", T.string()), true);
        props.put("message", T.instance("message", T.instance(T.string())), true);
        return props;
    }

}
