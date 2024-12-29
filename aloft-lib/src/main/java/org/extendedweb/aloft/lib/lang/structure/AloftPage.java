package org.extendedweb.aloft.lib.lang.structure;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.client.ClientInfo;
import org.extendedweb.aloft.lib.client.ClientSession;
import org.extendedweb.aloft.lib.html.elements.js.JavaScriptBuilder;
import org.extendedweb.aloft.lib.html.elements.types.Content;
import org.extendedweb.aloft.lib.lang.base.AssertsLanguage;
import org.extendedweb.aloft.lib.lang.base.BuildsHtml;
import org.extendedweb.aloft.lib.lang.base.BuildsJava;
import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.structure.components.AloftRoot;
import org.extendedweb.aloft.lib.lang.structure.elements.types.*;
import org.extendedweb.aloft.lib.lang.structure.style.AloftStyleCss;
import org.extendedweb.aloft.lib.colors.Colors;
import org.extendedweb.aloft.lib.emojis.Emoji;
import org.extendedweb.aloft.lib.lang.supporting.MountableComponent;
import org.extendedweb.aloft.lib.lang.structure.elements.types.*;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.html.elements.js.types.AlertObject;
import org.extendedweb.aloft.lib.html.elements.types.Body;
import org.extendedweb.aloft.lib.html.elements.types.Head;
import org.extendedweb.aloft.lib.html.elements.types.Page;
import org.extendedweb.aloft.lib.http.supporting.*;
import org.extendedweb.aloft.utils.global.__;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class AloftPage extends Endpoint implements BuildsJava, AssertsLanguage, BuildsHtml {

    private String favicon = null;
    private String title = null;
    private ArrayList<Meta> meta = new ArrayList<>();
    private MountableComponent root = null;
    private AloftStyleCss css = new AloftStyleCss();

//    public AloftPage(Route route, RequestType type, AloftRequestType internalType, VariableTree vars) {
//        super(route, type, internalType, vars);
//    }

    public AloftPage(RequestParams params, AppConfig config, MountableComponent root) {
        super(params, config);
        this.root = root;
    }

//    public AloftPage(Route route) {
//        this.path = route.getPath();
//    }
//
//    public AloftPage(Route route, AppConfig appConfig) {
//        this.path = route.getPath();
//    }
//
//    public AloftPage(Route route, VariableTree vars) {
//        this.path = route.getPath();
//    }
//
//    public AloftPage(Route route, AppConfig appConfig, VariableTree vars) {
//        this.path = route.getPath();
//    }
//
//    public AloftPage(String path, String favicon, String title) {
//        this.path = path;
//        this.favicon = favicon;
//        this.title = title;
//    }
    
    public void setPath(RoutePath path) {
        this.path = path;
    }
    
    public void setFavicon(String favicon) {
        this.favicon = favicon;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void appendMeta(Meta meta) {
        this.meta.add(meta);
    }

    public void testAppend() throws Exception {
        try {
            File file = Paths.get(this.getClass().getResource("/images/default-error-bg.dvg").toURI()).toFile();
            HashMap<String, String> svgVars = new HashMap<>();
            svgVars.put("bg-color", theme.color("primary", Colors.Shade.LIGHT).getHex());
            svgVars.put("color1", theme.color("primary", Colors.Shade.DARK).getHex());
            svgVars.put("color2", theme.color("primary", Colors.Shade.DARK).getHex(0.66F));
            svgVars.put("color3", theme.color("primary", Colors.Shade.DARK).getHex(0.33F));
            svgVars.put("color4", theme.color("primary").getHex());
            svgVars.put("color5", theme.color("primary").getHex(0.8F));
            svgVars.put("color6", theme.color("primary").getHex(0.35F));
            svgVars.put("color7", theme.color("primary", Colors.Shade.LIGHT).getHex());
            svgVars.put("color8", theme.color("primary", Colors.Shade.LIGHT).getHex(0.66F));
            VectorAloftElement bg = VectorAloftElement.fromFile(file, svgVars);
    //        screen.appendState("__root__.test", new StringT(), "value");
            FilledAloftElement container = new FilledAloftElement();
//            container.addStyle("background-image", bg.getEncodedUrl(theme));
            container.addStyle("background-repeat", "no-repeat");
            container.addStyle("background-size", "cover");
            container.useViewSize();
            CenteredAloftElement centered = new CenteredAloftElement();
            IconAloftElement icon = new IconAloftElement();
            icon.setIcon("PERSON_RAISED_HAND");
            icon.setSize(48);
            icon.setColor(theme.color("primary", Colors.Shade.DARK).getHex());
////            centered.addChild(icon);
            TextAloftElement textElement = new TextAloftElement();// new TextAloftElement("404");
            TextAloftElement textSpan =  new TextAloftElement(); // new TextAloftElement(Emoji.FACE_WITH_MONOCLE + " PAGE NOT FOUND");
//            TextAloftElement textElement = new TextAloftElement("500");
//            TextAloftElement textSpan = new TextAloftElement(Emoji.BUG + " SERVER ERROR");
            textSpan.addStyle("color", "#ffffff");
            textSpan.addStyle("padding-top", "20px");
            textSpan.addStyle("font-size", "32px");
            textSpan.addStyle("padding-bottom", "20px");
            textElement.addSpan(textSpan);
            textElement.addStyle("line-height", "1.0");
            textElement.addStyle("color", "#ffffff");
            textElement.addStyle("font-size", "256px");
            textElement.addStyle("text-shadow", "-0.04em 0.04em 0px " + theme.color("azure", Colors.Shade.DARK).getHex() + ", calc(-0.04em - 0.025em) calc(0.04em + 0.025em) 0px " + theme.color("azure", Colors.Shade.LIGHT).getHex());
            centered.addChild(textElement);
            ButtonAloftElement btn = new ButtonAloftElement();
            btn.setText("GO HOME");
            btn.addSubclass("primary");
            btn.addSubclass("sm");
            btn.setColors(theme.color("azure").getHex(), theme.color("azure", Colors.Shade.LIGHT).getHex(), theme.color("azure", Colors.Shade.DARK).getHex());
            btn.setRing(theme.color("blue").getHex());
            AlertObject alertObject = new AlertObject();
            alertObject.setTitle("This is a message from the national weather service");
//            btn.addListener(new AloftOnClickListener(
//                    JSOV.v("function", "myAlert"),
//                    JSOV.v("function-slot", alertObject)
//            ));
            centered.addChild(btn);
            AlertAloftElement alert = new AlertAloftElement();
            alert.builder("title", __.arr("text", "Hello World"));
            alert.builder("body", __.arr("text", "This is a message from the national weather service."));
            centered.addChild(alert);
            container.addChild(centered);
            container.setClasses(theme.mergeByHash(container.getStyle().getHashes()), theme);
            this.root = new AloftRoot(centered);
            this.root.appendCss(this.css);
//            this.root.javascript(this.js);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AloftStyleCss getCss() {
        return css;
    }

    public String getTitle() {
        return title;
    }
//
    @Override
    public HtmlElement html(AloftTheme theme, ElementMapper mapper) {
        if(!__.isset(theme)) theme = this.theme;
        return create(theme, mapper);
    }
//
//    //UNUSED OVERRIDE
    @Override
    public HtmlElement html(AloftTheme theme, ElementMapper mapper, HashMap<String, Object> properties) {
        return html(theme, mapper);
    }

    @Override
    public HtmlElement create(AloftTheme theme, ElementMapper mapper) {
        return buildPage(theme, mapper);
    }

    private HtmlElement getRoot(AloftTheme theme, ElementMapper mapper) {
        HtmlElement root = this.root.html(theme, mapper);
        System.out.println(root.getHtml());
        System.out.println("JGHDLHSDF:GKOJHSFKGJHDFSGKLHJ");
        this.root.appendCss(this.css);
        System.out.println("JGHDLHSDF:GKOJHSFKGJHDFSGKLfadsfasdfasdfHJ");
        return root;
    }

    private Page buildPage(AloftTheme theme, ElementMapper mapper) {
        Page page = new Page();
        System.out.println("PRE BUILD BODY");
        try {
            Body body = buildBody(theme, mapper);
            System.out.println("BUILD BODY");
            page.addChild(buildHead());
            page.addChild(body);
            System.out.println("NO BODY");
            System.out.println(page.getHtml());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return page;
    }

    private Body buildBody(AloftTheme theme, ElementMapper mapper) {
        Body body = new Body();
        body.addChild(getRoot(theme, mapper));
//        body.addJs(this.js.get().get());
        System.out.println("NO JS");
        return body;
    }

    private Head buildHead() {
        Head head = new Head();
        head.addTitle("Hello");
//        try { head.addFavicon(Paths.get(this.getClass().getResource("/images/aloft-favicon.png").toURI()).toString()); } catch (Exception e) { e.printStackTrace(); }
        System.out.println("buldHead staticFiles START");
        head.addStatic(this.staticFiles);
        System.out.println("buldHead staticFiles END");
        head.addCss(theme.getStyleModule().rootVars());
        head.addCss(css);
        head.addCss("html, body { margin: 0; height: 100%; }");
//        head.addJs(this.js.get().get());
        System.out.println("RETURN HEAD");
        return head;
    }

    public class Meta {

    }

}
