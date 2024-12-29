package org.extendedweb.aloft.lib;

import org.extendedweb.aloft.lib.colors.Colors;

public class DefaultModule extends StyleModule {

    public DefaultModule() { super(); }

    @Override
    protected void registerFonts() {
        vars.put("font-family", "\"Aileron\", sans-serif");
    }

    @Override
    protected void registerVariables() { }

    @Override
    public void registerColors(Colors colors) {
        vars.put("primary", colors.get("primary").getHex());
        vars.put("primary-dark", colors.get("primary", Colors.Shade.DARK).getHex());
        vars.put("primary-light", colors.get("primary", Colors.Shade.LIGHT).getHex());
        vars.put("accent", colors.get("azure").getHex());
        vars.put("accent-dark", colors.get("azure", Colors.Shade.DARK).getHex());
        vars.put("accent-light", colors.get("azure", Colors.Shade.LIGHT).getHex());
        vars.put("success", colors.get("green").getHex());
        vars.put("success-dark", colors.get("green", Colors.Shade.DARK).getHex());
        vars.put("success-light", colors.get("green", Colors.Shade.LIGHT).getHex());
        vars.put("secondary", colors.get("secondary").getHex());
        vars.put("secondary-dark", colors.get("secondary",  Colors.Shade.DARK).getHex());
        vars.put("secondary-light", colors.get("secondary", Colors.Shade.LIGHT).getHex());
        vars.put("info", colors.get("cyan").getHex());
        vars.put("info-dark", colors.get("cyan", Colors.Shade.DARK).getHex());
        vars.put("info-light", colors.get("cyan", Colors.Shade.LIGHT).getHex());
        vars.put("caution", colors.get("yellow").getHex());
        vars.put("caution-dark", colors.get("yellow", Colors.Shade.DARK).getHex());
        vars.put("caution-light", colors.get("yellow", Colors.Shade.LIGHT).getHex());
        vars.put("error", colors.get("red").getHex());
        vars.put("error-dark", colors.get("red", Colors.Shade.DARK).getHex());
        vars.put("error-light", colors.get("red", Colors.Shade.LIGHT).getHex());
    }

    @Override
    protected ModuleElement buttonAloftElement(ModuleElement element) {
        element.addClasses("button","btn");
        element.addAttributes("button","type", "button");

        //COLORS
        element.addSubclasses("button","primary", "btn-primary");
        element.addSubclasses("button","secondary", "btn-secondary");

        //SIZE
        element.addSubclasses("button","lg", "btn-lg");
        element.addSubclasses("button","sm", "btn-sm");
        element.addSubclasses("button", "full-width", "btn-block");

        element.addSubclasses("button","disabled", "disabled");
        return element;
    }

    @Override
    protected ModuleElement alertAloftElement(ModuleElement element) {
        element.addClasses("root", "modal", "fade");
        element.addAttributes("root",
            "data-bs-backdrop", "static",
                "data-bs-keyboard", "false",
                "tabindex", "-1",
                "aria-labeledby", "staticBackdropLabel",
                "aria-hidden", "true"
        );
        element.addClasses("dialog", "modal-dialog");
        element.addClasses("content", "modal-content");
        element.addClasses("header", "modal-header");
        element.addClasses("title", "modal-title");
        element.addAttributes("title" , "id", "staticBackdropLabel");
        return element;
    }

    @Override
    protected ModuleElement centeredAloftElement(ModuleElement element) {
        element.addClasses("root","flex", "w-100", "h-100", "p-3");
        element.addClasses("child","mx-auto", "my-auto", "w-100");
        return element;
    }

    @Override
    protected ModuleElement columnAloftElement(ModuleElement element) {
        element.addClasses("col","flex", "flex-col");
        element.addClasses("col-reverse","flex", "flex-col-reverse");
        return element;
    }

    @Override
    protected ModuleElement inputAloftElement(ModuleElement element) {
        element.addClasses("root", "d-flex", "flex-column", "mb-4");
        element.addClasses("text-group", "form-group");
        element.addClasses("text-input", "form-control");
        element.addAttributes("text-input", "type", "text");
        element.addClasses("password-input", "form-control");
        element.addAttributes("password-input", "type", "password");
        element.addClasses("help-text", "form-text", "text-muted", "mt-2", "mx-1", "d-block");
        element.addStyles("help-text", "text-align", "left", "font-size", "12px");
        element.addStyles("label", "font-weight", "bold", "color", "rgba(0,0,0,0.85)", "font-size", "14px", "text-align", "left");
        element.addClasses("label", "mb-2", "d-block", "mx-1");
        return element;
    }
}
