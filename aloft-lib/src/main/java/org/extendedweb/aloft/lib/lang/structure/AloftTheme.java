package org.extendedweb.aloft.lib.lang.structure;

import org.extendedweb.aloft.lib.lang.base.BuildsJava;
import org.extendedweb.aloft.lib.lang.structure.style.AloftStyleClass;
import org.extendedweb.aloft.lib.lang.structure.style.AloftStyleClassBuilder;
import org.extendedweb.aloft.lib.lang.structure.style.AloftStyleHashList;
import org.extendedweb.aloft.lib.DefaultModule;
import org.extendedweb.aloft.lib.IconsModule;
import org.extendedweb.aloft.lib.StyleModule;
import org.extendedweb.aloft.lib.colors.Color;
import org.extendedweb.aloft.lib.colors.Colors;

import java.util.ArrayList;
import java.util.HashMap;

// add 'default MyElement.color: #ff000' to syntax

public class AloftTheme implements BuildsJava {

    private AloftStyleClassBuilder classBuilder = new AloftStyleClassBuilder();
    private ArrayList<AloftStyleClass> classes = new ArrayList<>();

    private Colors colors;

    private StyleModule module;

    private boolean useDefaultTheme = false;
    private boolean useDefaultIcons = false;
    private boolean useDefaultFont = false;

    public AloftTheme() { }

    public AloftTheme(StyleModule module) { this.module = module; }

    public ArrayList<AloftStyleClass> mergeByHash(HashMap<String, ArrayList<AloftStyleHashList>> hashes) {
        ArrayList<AloftStyleClass> v = new ArrayList<AloftStyleClass>();
        for(String key : hashes.keySet()) {
            ArrayList<AloftStyleClass> c = this.classBuilder.merge(this.classes, hashes.get(key));
            v.addAll(c);
            for(AloftStyleClass n : c) {
                if(!this.classBuilder.globalExists(n)) {
                    this.classes.add(n);
                    this.classBuilder.appendGlobalClass(n);
                }
            }
        }
        return v;
    }

    public void setUsesDefaultTheme() {
        useDefaultTheme = true;
        module = new DefaultModule();
    }

    public void setIconModule(IconsModule module) {
        this.module.setIcons(module);
    }

    public void setColors(Colors colors) {
        this.colors = colors;
        this.module.registerColors(colors);
    }

    public Color color(String key) {
        return color(key, Colors.Shade.DEFAULT);
    }

    public Color color(String key, Colors.Shade shade) {
        return colors.get(key, shade);
    }

    public boolean usesDefaultTheme() {
        return useDefaultTheme;
    }

    public void setUsesDefaultIcons() {
        useDefaultIcons = true;
    }

    public boolean usesDefaultIcons() {
        return useDefaultIcons;
    }

    public void setUsesDefaultFont() {
        useDefaultFont = true;
    }

    public boolean usesDefaultFont() {
        return useDefaultFont;
    }

    public StyleModule getStyleModule() {
        return this.module;
    }

}
