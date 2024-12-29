package org.extendedweb.aloft.lib.lang.structure.elements.types;

import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.lang.structure.style.AloftStyle;
import org.extendedweb.aloft.lib.lang.structure.style.AloftStylePair;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.html.elements.types.Content;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;

public class InputAloftElement extends AloftElement {

    public InputAloftElement() { super(); init(); }

    public void setPlaceholder(String placeholder) {
        this.vars.replace("placeholder", placeholder);
    }

    public void setLabel(String label) {
        this.vars.replace("label", label);
    }

    public void setHelpText(String helpText) {
        this.vars.replace("help-text", helpText);
    }

//    @Override
//    protected void subtypes(ArrayList<AloftElementSubtype> subtypes) {
//        this.subtypes.add(new AloftElementSubtype(constructSubtype("__text_input__")) {
//            @Override
//            public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
//                HtmlElement root = createElement("div");
//                HtmlElement group = createElement("div");
//                HtmlElement below = createElement("span");
//
//                if(__.isset(var("label"))) {
//                    HtmlElement label = createElement("span");
//                    Content labelTxt = new Content(var("label"));
//                    label.addChild(labelTxt);
//                    applyStyle("label", InputAloftElement.class, label, theme);
//                    root.addChild("label", label);
//                }
//
//                if(__.isset(var("prepend-text"))) {
//                    HtmlElement prepend = createElement("div");
//                    HtmlElement prependChild = createElement("span");
//                    Content prependText = new Content(var("prepend-text"));
//                    prependChild.addChild(prependText);
//                    applyStyle("prepend-text", InputAloftElement.class, prependChild, theme);
//                    prepend.addChild(prependChild);
//                    applyStyle("prepend-container", InputAloftElement.class, prepend, theme);
//                    group.addChild(prepend);
//                }
//
//                HtmlElement input = createElement("input");
//                applyStyle("text-input", InputAloftElement.class, input, theme);
//                if(__.isset(var("placeholder"))) input.addAttribute("placeholder", var("placeholder"));
//                group.addChild("input", input);
//
//                if(__.isset(var("help-text"))) {
//                    Content helpTxt = new Content(var("help-text"));
//                    below.addChild(helpTxt);
//                }
//
//                applyStyle("help-text", InputAloftElement.class, below, theme);
//                group.addChild("help-text", below);
//                applyStyle("text-group", InputAloftElement.class, group, theme);
//                root.addChild(group);
//                applyStyle("root", InputAloftElement.class, root, theme);
//                applyListeners("input", "input", root);
//                return root;
//            }
//            @Override
//            public String getName() {
//                return "__text_input__";
//            }
//        });
//        this.subtypes.add(new AloftElementSubtype(constructSubtype("__password_input__")) {
//            @Override
//            public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
//                HtmlElement root = createElement("div");
//                HtmlElement group = createElement("div");
//                HtmlElement below = createElement("span");
//
//                if(__.isset(var("label"))) {
//                    HtmlElement label = createElement("span");
//                    Content labelTxt = new Content(var("label"));
//                    label.addChild(labelTxt);
//                    applyStyle("label", InputAloftElement.class, label, theme);
//                    root.addChild("label", label);
//                }
//
//                if(__.isset(var("prepend-text"))) {
//                    HtmlElement prepend = createElement("div");
//                    HtmlElement prependChild = createElement("span");
//                    Content prependText = new Content(var("prepend-text"));
//                    prependChild.addChild(prependText);
//                    applyStyle("prepend-text", InputAloftElement.class, prependChild, theme);
//                    prepend.addChild(prependChild);
//                    applyStyle("prepend-container", InputAloftElement.class, prepend, theme);
//                    group.addChild(prepend);
//                }
//
//                HtmlElement input = createElement("input");
//                applyStyle("password-input", InputAloftElement.class, input, theme);
//                if(__.isset(var("placeholder"))) input.addAttribute("placeholder", var("placeholder"));
//                group.addChild("input", input);
//
//                if(__.isset(var("help-text"))) {
//                    Content helpTxt = new Content(var("help-text"));
//                    below.addChild(helpTxt);
//                }
//
//                applyStyle("help-text", InputAloftElement.class, below, theme);
//                group.addChild("help-text", below);
//                applyStyle("text-group", InputAloftElement.class, group, theme);
//                root.addChild(group);
//                applyStyle("root", InputAloftElement.class, root, theme);
//                applyListeners("input", "input", root);
//                return root;
//            }
//            @Override
//            public String getName() {
//                return "__password_input__";
//            }
//        });
//        this.subtypes.add(new AloftElementSubtype(constructSubtype("__textarea_input__")) {
//            @Override
//            public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
//                HtmlElement root = createElement("div");
//                HtmlElement group = createElement("div");
//                HtmlElement below = createElement("span");
//
//                if(__.isset(var("label"))) {
//                    HtmlElement label = createElement("span");
//                    Content labelTxt = new Content(var("label"));
//                    label.addChild(labelTxt);
//                    applyStyle("label", InputAloftElement.class, label, theme);
//                    root.addChild("label", label);
//                }
//
//                if(__.isset(var("prepend-text"))) {
//                    HtmlElement prepend = createElement("div");
//                    HtmlElement prependChild = createElement("span");
//                    Content prependText = new Content(var("prepend-text"));
//                    prependChild.addChild(prependText);
//                    applyStyle("prepend-text", InputAloftElement.class, prependChild, theme);
//                    prepend.addChild(prependChild);
//                    applyStyle("prepend-container", InputAloftElement.class, prepend, theme);
//                    group.addChild(prepend);
//                }
//
//                HtmlElement input = createElement("input");
//                applyStyle("text-input", InputAloftElement.class, input, theme);
//                if(__.isset(var("placeholder"))) input.addAttribute("placeholder", var("placeholder"));
//                group.addChild("input", input);
//
//                if(__.isset(var("help-text"))) {
//                    Content helpTxt = new Content(var("help-text"));
//                    below.addChild("bottom-text", helpTxt);
//                }
//
//                applyStyle("help-text", InputAloftElement.class, below, theme);
//                group.addChild(below);
//                applyStyle("text-group", InputAloftElement.class, group, theme);
//                root.addChild(group);
//                applyStyle("root", InputAloftElement.class, root, theme);
//                applyListeners("input", "input", root);
//                return root;
//            }
//            @Override
//            public String getName() {
//                return "__text_input__";
//            }
//        });
//        this.subtypes.add(new AloftElementSubtype(constructSubtype("__select_input__")) {
//            @Override
//            public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
//                HtmlElement root = createElement("div");
//                HtmlElement group = createElement("div");
//                HtmlElement below = createElement("span");
//
//                if(__.isset(var("label"))) {
//                    HtmlElement label = createElement("span");
//                    Content labelTxt = new Content(var("label"));
//                    label.addChild(labelTxt);
//                    applyStyle("label", InputAloftElement.class, label, theme);
//                    root.addChild("label", label);
//                }
//
//                if(__.isset(var("prepend-text"))) {
//                    HtmlElement prepend = createElement("div");
//                    HtmlElement prependChild = createElement("span");
//                    Content prependText = new Content(var("prepend-text"));
//                    prependChild.addChild(prependText);
//                    applyStyle("prepend-text", InputAloftElement.class, prependChild, theme);
//                    prepend.addChild(prependChild);
//                    applyStyle("prepend-container", InputAloftElement.class, prepend, theme);
//                    group.addChild(prepend);
//                }
//
//                HtmlElement input = createElement("input");
//                applyStyle("text-input", InputAloftElement.class, input, theme);
//                if(__.isset(var("placeholder"))) input.addAttribute("placeholder", var("placeholder"));
//                group.addChild("input", input);
//
//                if(__.isset(var("help-text"))) {
//                    Content helpTxt = new Content(var("help-text"));
//                    below.addChild("bottom-text", helpTxt);
//                }
//
//                applyStyle("help-text", InputAloftElement.class, below, theme);
//                group.addChild(below);
//                applyStyle("text-group", InputAloftElement.class, group, theme);
//                root.addChild(group);
//                applyStyle("root", InputAloftElement.class, root, theme);
//                applyListeners("input", "input", root);
//                return root;
//            }
//            @Override
//            public String getName() {
//                return "__text_input__";
//            }
//        });
//    }

    @Override
    protected String name() {
        return "__input__";
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
        this.vars.put("placeholder", null);
        this.vars.put("label", null);
        this.vars.put("prepend-text", null);
        this.vars.put("help-text", null);
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

        this.vars.put("active-color", null);
        addOverride("active-color", "background-color", "focus");

        AloftStyle s1 = new AloftStyle();
        s1.addStyle(new AloftStylePair("box-shadow", "rgba(255, 0, 0, 0.45) 0px 0px 0px 3px", true));
        s1.addStyle(new AloftStylePair("border", "solid 0.5px rgba(255, 0, 0, 0.7)", true));
        addConditionalStyle("text-input-validation", "input-error", "input", s1);

        AloftStyle s2 = new AloftStyle();
        s2.addStyle(new AloftStylePair("box-shadow", "rgba(0, 255, 0, 0.45) 0px 0px 0px 3px", true));
        s2.addStyle(new AloftStylePair("border", "solid 0.5px rgba(0, 255, 0, 0.7)", true));
        addConditionalStyle("text-input-validation","input-success", "input", s2);

        AloftStyle s3 = new AloftStyle();
        s3.addStyle(new AloftStylePair("color", "red", true));
        addConditionalStyle("text-input-validation","input-error", "help-text", s3);

        AloftStyle s4 = new AloftStyle();
        s4.addStyle(new AloftStylePair("color", "green", true));
        addConditionalStyle("text-input-validation","input-success", "help-text", s4);
    }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        return null;
    }
}
