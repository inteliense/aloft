package org.extendedweb.aloft.lib.lang.structure.elements.types;

import org.extendedweb.aloft.lib.colors.ColorUtils;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftIconPlacement;
import org.extendedweb.aloft.lib.lang.types.base.T;

public class IconButtonAloftElement extends AloftElement {

    public IconButtonAloftElement() { super(); init(); }

    public void setText(String text) { this.vars.replace("text", text); }

    public void setIcon(IconAloftElement icon, AloftIconPlacement placement) {
        this.vars.replace("icon", icon);
        this.vars.replace("placement", placement);
    }

    public void setColors(String primary, String hover, String border) {
        this.vars.replace("color", primary);
        this.vars.replace("hover-color", hover);
        this.vars.replace("active-color", hover);
        this.vars.replace("pulse-shadow", "0 0 10px 20px " + primary);
        this.vars.replace("pulse-shadow-active", "0 0 0 0 " + primary);
        this.vars.replace("border-color", "solid 2px " + border);
    }

    public void setColors(String primary, String hover, String border, String active) {
        this.vars.replace("color", primary);
        this.vars.replace("hover-color", hover);
        this.vars.replace("active-color", active);
        this.vars.replace("pulse-color", primary);
        this.vars.replace("border-color", "solid 2px " + border);
    }

    public void setRing(String color) {
        int[] ringColor = ColorUtils.hexToRgb(color);
        this.vars.replace("ring-color", "0 0 0 0.25rem rgba(" + ringColor[0] + ", " + ringColor[1] + ", " + ringColor[2] + ", 0.45)");
    }


    @Override
    protected String name() {
        return "__button__";
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
        this.vars.put("text", null);
        this.vars.put("icon", null);
        this.vars.put("placement", null);

        this.vars.put("color", null);
        addOverride("color", "background-color");

        this.vars.put("pulse-shadow", null);
        this.vars.put("pulse-shadow-active", null);
        addOverride("pulse-shadow", "box-shadow", "after");
        addOverride("pulse-shadow-active", "box-shadow", "active", "after");

        this.vars.put("ring-color", null);
        addOverride("ring-color", "box-shadow", "hover");
        addOverride("ring-color", "box-shadow", "focus");

        this.vars.put("border-color", null);
        addOverride("border-color", "border");

        this.vars.put("hover-color", null);
        addOverride("hover-color", "background-color", "hover");

        this.vars.put("active-color", null);
        addOverride("active-color", "background-color", "focus");

        this.vars.put("animated", true);
        addFlaggedOverride("animated", "position", "relative");
        addFlaggedOverride("animated", "transition-duration", "0.4s");
        addFlaggedOverride("animated", "-webkit-transition-duration", "0.4s");
        addFlaggedOverride("animated", "transition-duration", "0.1s", "hover");
//        addOverride("hover-color", "background-color",  "hover");
        addFlaggedOverride("animated", "content", "\"\"", "after");
        addFlaggedOverride("animated", "display", "block", "after");
        addFlaggedOverride("animated", "position", "absolute", "after");
        addFlaggedOverride("animated", "border-radius", "0.2rem", "after");
        addFlaggedOverride("animated", "left", "0", "after");
        addFlaggedOverride("animated", "top", "0", "after");
        addFlaggedOverride("animated", "width", "100%", "after");
        addFlaggedOverride("animated", "height", "100%", "after");
        addFlaggedOverride("animated", "opacity", "0", "after");
        addFlaggedOverride("animated", "transition", "all 0.5s", "after");
        addFlaggedOverride("animated", "box-shadow", "0 0 10px 40px grey", "after");
        addFlaggedOverride("animated", "box-shadow", "0 0 0 0 grey", "active", "after");
        addFlaggedOverride("animated", "position", "absolute", "active", "after");
        addFlaggedOverride("animated", "border-radius", "0.2rem", "active", "after");
        addFlaggedOverride("animated", "left", "0", "active", "after");
        addFlaggedOverride("animated", "top", "0", "active", "after");
        addFlaggedOverride("animated", "opacity", "1", "active", "after");
        addFlaggedOverride("animated", "transition", "0s", "active", "after");

    }

    public static AloftObjectProperties properties() {
        AloftObjectProperties props = new AloftObjectProperties();
        props.put("text", T.instance("text", T.string()), true);
        props.put("color", T.instance("color", T.instance(T.string())));
        props.put("icon", T.instance());
        return props;
    }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        return null;
    }
}
