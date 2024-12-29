package org.extendedweb.aloft.lib.lang.base;

import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public interface BuildsHtml {
    HtmlElement html(AloftTheme theme, ElementMapper mapper) ;
    HtmlElement html(AloftTheme theme, ElementMapper mapper, HashMap<String, Object> properties);
    HtmlElement create(AloftTheme theme, ElementMapper mapper);
}
