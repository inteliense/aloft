package com.inteliense.aloft.compiler.tests;

import com.inteliense.aloft.compiler.lang.lib._AloftProject;

public class _TestProject extends _AloftProject {

    public _TestProject(String[] args) {
        super(args);
    }

    public static _AloftProject launch(String[] args) throws Exception {
        _TestProject project = new _TestProject(args);
        project.launch();
        return project;
    }

    public void launch() throws Exception {
        buildObjects();
    }

}
