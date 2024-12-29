package org.extendedweb.aloft.lib.lang.supporting;

import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;

public class MountPoint extends AloftComponent {

    public MountPoint() {
        super();
    }

    @Override
    public String getName() {
        return "__mount_point__";
    }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        return null;
    }
}
