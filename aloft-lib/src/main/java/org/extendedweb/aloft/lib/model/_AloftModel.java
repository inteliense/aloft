package org.extendedweb.aloft.lib.model;

import java.util.ArrayList;

public class _AloftModel {

    private String name;
    private ArrayList<_AloftModelProperty> properties = new ArrayList<>();
    private String connection;

    public _AloftModel(String name) {
        this.name = name;
    }

    public String getName() { return this.name; }

    public void setConnection(String connection) {
        this.connection = connection;
    }
}