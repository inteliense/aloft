package org.extendedweb.aloft.lib.lang.structure.elements.types;

import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftObjectProperties;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.utils.global.__;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class VectorAloftElement extends AloftElement {

    public VectorAloftElement() { super(); init(); }

    public void setViewBox(String v) {
        this.vars.replace("view-box", v);
    }

    public void setSize(String height, String width) {
        this.vars.replace("height", height);
        this.vars.replace("width", width);
    }

    public void setElement(HtmlElement element) {
        this.vars.replace("element", element);
    }

    public String getEncodedUrl(AloftTheme theme) {
        String html = create(theme, null).getHtml();
        String b64 = __.b64(html.getBytes());
        String data = "data:image/svg+xml;base64," + b64;
        return "url('" + data + "')";
    }

    public static VectorAloftElement fromFile(File file) throws Exception {
        Scanner scnr = new Scanner(file);
        StringBuilder builder = new StringBuilder();
        while(scnr.hasNextLine()) {
            builder.append(scnr.nextLine());
        }
        String svgStr = builder.toString();

        VectorAloftElement element = new VectorAloftElement() {
            @Override
            public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
                HtmlElement svg = var("element");
                svg.addAttribute("xmlns", "http://www.w3.org/2000/svg");
                svg.addAttribute("xmlns:xlink", "http://www.w3.org/1999/xlink");
                svg.addAttribute("version", "1.1");
                svg.addAttribute("viewBox", String.valueOf(this.vars.get("view-box")));
                svg.addAttribute("width", String.valueOf(this.vars.get("width")));
                svg.addAttribute("height", String.valueOf(this.vars.get("height")));
                return svg;
            }
        };

        Parser p = Parser.htmlParser();
        p.settings(new ParseSettings(true, true));
        Document _svg = p.parseInput(svgStr, "/");
        Element svg = _svg.selectFirst("svg");
        Attributes attrs = svg.attributes();
        element.setSize(attrs.get("height"), attrs.get("width"));
        element.setViewBox(attrs.getIgnoreCase("viewBox"));
        HtmlElement el = createElement("svg", element.id(), "__vector__");
        iterate(svg, el);
        element.setElement(el);
        return element;
    }

    public static VectorAloftElement fromFile(File file, HashMap<String, String> dynamicVars) throws Exception {
        Scanner scnr = new Scanner(file);
        StringBuilder builder = new StringBuilder();
        while(scnr.hasNextLine()) {
            builder.append(scnr.nextLine());
        }
        String svgStr = builder.toString();

        VectorAloftElement element = new VectorAloftElement() {
            @Override
            public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
                HtmlElement svg = var("element");
                svg.addAttribute("xmlns", "http://www.w3.org/2000/svg");
                svg.addAttribute("xmlns:xlink", "http://www.w3.org/1999/xlink");
                svg.addAttribute("version", "1.1");
                svg.addAttribute("viewBox", String.valueOf(this.vars.get("view-box")));
                svg.addAttribute("width", String.valueOf(this.vars.get("width")));
                svg.addAttribute("height", String.valueOf(this.vars.get("height")));
                return svg;
            }
        };

        Parser p = Parser.htmlParser();
        p.settings(new ParseSettings(true, true));
        Document _svg = p.parseInput(svgStr, "/");
        Element svg = _svg.selectFirst("svg");
        Attributes attrs = svg.attributes();
        element.setSize(attrs.get("height"), attrs.get("width"));
        element.setViewBox(attrs.getIgnoreCase("viewBox"));
        HtmlElement el = createElement("svg", element.id(), "__vector__");
        iterate(svg, el, dynamicVars);
        element.setElement(el);
        return element;
    }

    private static void iterate(Element el, HtmlElement element) {
        Elements children = el.children();
        for(int i=0; i< children.size(); i++) {
            Element child = children.get(i);
            HtmlElement childEl = createElement(child.tagName(), "", "__vector__");
            Attributes attrs = child.attributes();
            for(Attribute attr: attrs) {
                childEl.addAttribute(attr.getKey(), attr.getValue());
            }
            iterate(child, childEl);
            element.addChild(childEl);
        }
    }

    private static void iterate(Element el, HtmlElement element, HashMap<String, String> vars) {
        Elements children = el.children();
        for(int i=0; i< children.size(); i++) {
            Element child = children.get(i);
            HtmlElement childEl = createElement(child.tagName(), "", "__vector__");
            Attributes attrs = child.attributes();
            for(Attribute attr: attrs) {
                if(attr.getKey().indexOf("d-") == 0) {
                    String val = vars.getOrDefault(attr.getValue(), "");
                    if(__.empty(val)) continue;
                    childEl.addAttribute(attr.getKey().replace("d-", ""), val);
                } else { childEl.addAttribute(attr.getKey(), attr.getValue()); }
            }
            iterate(child, childEl, vars);
            element.addChild(childEl);
        }
    }

    @Override
    protected String name() {
        return "__vector__";
    }

    @Override
    protected boolean acceptsIterator() {
        return false;
    }

    @Override
    protected boolean acceptsBuilder() {
        return false;
    }

    @Override
    protected boolean requiresBuilder() {
        return false;
    }

    @Override
    protected boolean isExtensible() {
        return false;
    }

    @Override
    protected boolean acceptsChild() {
        return false;
    }

    @Override
    protected void setupProperties(AloftObjectProperties vars) {
//        this.vars.put("view-box", null);
//        this.vars.put("width", null);
//        this.vars.put("height", null);
//        this.vars.put("element", null);
    }

    public static AloftObjectProperties properties() {
        AloftObjectProperties props = new AloftObjectProperties();
        props.put("view-box", T.instance("title", T.string()), true);
        props.put("width", T.instance("message", T.number()), true);
        props.put("height", T.instance("message", T.number()), true);
        return props;
    }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        return null;
    }
}
