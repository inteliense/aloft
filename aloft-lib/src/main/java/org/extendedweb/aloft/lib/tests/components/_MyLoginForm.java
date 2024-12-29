package org.extendedweb.aloft.lib.tests.components;

import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.lang.structure.elements.base.validation.EmailValidator;
import org.extendedweb.aloft.lib.lang.structure.elements.base.validation.conditionals.base.ConditionalValueSet;
import org.extendedweb.aloft.lib.lang.structure.elements.base.validation.conditionals.base.ConditionalValueType;
import org.extendedweb.aloft.lib.lang.structure.elements.base.validation.conditionals.base.ConditionalValues;
import org.extendedweb.aloft.lib.lang.structure.elements.types.*;
import org.extendedweb.aloft.lib.lang.structure.listeners.types.AloftOnInputListener;
import org.extendedweb.aloft.lib._AloftComponent;
import org.extendedweb.aloft.lib.tests.elements._MyPasswordFieldElement;
import org.extendedweb.aloft.lib.tests.elements._MyTextFieldElement;
import org.extendedweb.aloft.lib.html.elements.js.JSOV;

import java.util.HashMap;

public class _MyLoginForm extends _AloftComponent {

    public _MyLoginForm() {
        super("my_login_form");
        addChild(a());
    }

    @Override
    public String getName() {
        return "__my_login_form__";
    }

    private AloftElement a() {
        CenteredAloftElement centered = new CenteredAloftElement();
        ColumnAloftElement column = new ColumnAloftElement();
        ButtonAloftElement btn = new ButtonAloftElement();
  //      TextAloftElement txt = new TextAloftElement("LOG IN");
        HeaderAloftElement txt = new HeaderAloftElement("LOG IN");
        btn.setText("Sign in");
        btn.addSubclass("primary");
        btn.addSubclass("sm");
        column.addChild(txt);
        AloftElement b = b(new HashMap<>());
        ConditionalValues conditionalValues = new ConditionalValues();
        ConditionalValueSet set1 = ConditionalValueSet.create("The email address you entered is valid.", "The email address you entered is not valid.");
        ConditionalValueSet set2 = ConditionalValueSet.create("input-success", "input-error");
        conditionalValues.add("input", "text-input-validation", ConditionalValueType.INNER_HTML, set1, "help-text");
        conditionalValues.add("input", "text-input-validation", ConditionalValueType.CLASS, set2);
        b.addListener("input", new AloftOnInputListener(new EmailValidator("value", conditionalValues), JSOV.v("function", "v")));
        column.addChild(b);
        column.addChild(c(new HashMap<>()));
        column.addChild(btn);
        centered.addChild(column);
        return centered;
    }

    private AloftElement b(HashMap<String, Object> vars) {
        return new _MyTextFieldElement().build(vars);
    }

    private AloftElement c(HashMap<String, Object> vars) {
        return new _MyPasswordFieldElement().build(vars);
    }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        return null;
    }
}
