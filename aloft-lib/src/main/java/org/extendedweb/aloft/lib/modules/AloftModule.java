package org.extendedweb.aloft.lib.modules;

import org.extendedweb.aloft.lib.lang.structure.style.AloftStyleClass;

public abstract class AloftModule {

    protected abstract AloftModuleClass[] getModuleClasses();
    protected abstract void initialize(String[] args);

    public void invoke(AloftModuleClass moduleClass, String function, String[] args) {

    }

}
