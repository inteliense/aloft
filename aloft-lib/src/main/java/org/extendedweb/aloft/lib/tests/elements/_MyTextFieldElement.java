package org.extendedweb.aloft.lib.tests.elements;

import org.extendedweb.aloft.lib.AloftElementActions;
import org.extendedweb.aloft.lib.AloftElementImpl;
import org.extendedweb.aloft.lib.AloftElementListeners;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.lang.structure.elements.types.InputAloftElement;
import org.extendedweb.aloft.lib._AloftElement;

import java.util.HashMap;

public class _MyTextFieldElement extends _AloftElement implements AloftElementImpl {

    private HashMap<String, Object> data = new HashMap<>();

    @Override
    public AloftElement build(HashMap<String, Object> vars) {
        this.data = vars;
        InputAloftElement input = new InputAloftElement();
        input.setLabel("Email");
        input.setPlaceholder("Enter your email...");
        input.setHelpText("Please enter a valid email.");
        return input;
    }

    @Override
    public AloftElementActions[] elementActions() {
        return new AloftElementActions[0];
    }

    @Override
    public AloftElementListeners[] elementListeners() {
        return null;
    }

    @Override
    public String valueUid() {
        return null;
    }
}
