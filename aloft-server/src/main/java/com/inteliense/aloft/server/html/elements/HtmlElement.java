package com.inteliense.aloft.server.html.elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public abstract class HtmlElement {

    private ArrayList<HtmlElement> children = new ArrayList<HtmlElement>();
    private ArrayList<String[]> styles = new ArrayList<String[]>();
    private HashMap<String, String> attributes = new HashMap<String, String>();
    private String id;

    protected abstract String getKey();

    public HtmlElement() { this.id = null; }

    public HtmlElement(String id) {
        this.id = id;
    }

    public String getId() {
        return id == null ? "" : id;
    }

    public void addChild(HtmlElement element) {
        this.children.add(element);
    }
    
    public void addAttribute(String key, String value) {
        if(this.attributes.containsKey(key)) {
            String v = this.attributes.get(key);
            this.attributes.replace(key, v + " " + value);
        } else {
            this.attributes.put(key, value);
        }
    }

    public void addAttribute(String key, String value, String delimiter) {
        if(this.attributes.containsKey(key)) {
            String v = this.attributes.get(key);
            this.attributes.replace(key, v + delimiter + value);
        } else {
            this.attributes.put(key, value);
        }
    }
    
    public void addStyle(String key, String value) {
        this.styles.add(new String[]{key, value});
    }
    
    public void addStyle(String[][] styles) {
        for(int i=0; i<styles.length; i++) {
            this.styles.add(styles[i]);
        }
    }

    public String getHtml() {
        if(this.children.isEmpty()) return this.buildTag();
        else {
            String html = this.buildTag(false);
            for(int i=0; i<this.children.size(); i++) {
                html += this.children.get(i).getHtml();
            }
            return html + this.buildTag(true);
        }
    }

    private String buildTag(boolean close) {
        if(this.getKey() == null) return "";
        if(close) return "</" + this.getKey() + ">";
        else {
            String tag = "<" + this.getKey();
            tag += " " + this.buildAttributes();
            tag += ">";
            return tag;
        }
    }

    private String buildTag() {
        if(this.getKey() == null) return "";
        String tag = "<" + this.getKey();
        tag += " " + this.buildAttributes();
        tag += "/>";
        return tag;
    }

    private String buildAttributes() {
        String style = buildStyles();
        String attrs = (style.isEmpty()) ? "" : "style=\"" + style + "\" ";
        Set<String> keys = this.attributes.keySet();
        for ( String key : keys ) {
            String value = this.attributes.get(key);
            attrs += key + "=\"" + value + "\" ";
        }
        attrs += "id=\"" + this.id + "\"";
        return attrs;
    }

    private String buildStyles() {
        String styles = "";
        for(int i=0; i<this.styles.size(); i++) {
            String[] arr = this.styles.get(i);
            String key = arr[0];
            String value = arr[1];
            styles += key + ":" + value + ";";
        }
        return styles;
    }

}
