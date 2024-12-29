package org.extendedweb.aloft.lib.lang.structure.elements.base;

import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;

public class AloftBuilderElement {

    private String key;
    private AloftElement element;

    public AloftBuilderElement(String key, AloftElement element) {
        this.key = key;
        this.element = element;
    }

    public String getKey() {
        return key;
    }

    public AloftElement getElement() {
        return element;
    }

}
