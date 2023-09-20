package com.inteliense.aloft.compiler.lang.keywords;

import com.inteliense.aloft.application.config.AppConfig;
import com.inteliense.aloft.compiler.lang.base.AssertsLanguage;
import com.inteliense.aloft.compiler.lang.base.BuildsHtml;
import com.inteliense.aloft.compiler.lang.base.BuildsJava;
import com.inteliense.aloft.compiler.lang.keywords.components.AloftComponent;
import com.inteliense.aloft.compiler.lang.keywords.components.AloftScreen;
import com.inteliense.aloft.compiler.lang.keywords.elements.types.AloftScreenContainer;
import com.inteliense.aloft.compiler.lang.keywords.elements.types.TextAloftElement;
import com.inteliense.aloft.compiler.lang.keywords.listeners.base.AloftListener;
import com.inteliense.aloft.compiler.lang.supporting.MountableComponent;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.types.Body;
import com.inteliense.aloft.server.html.elements.types.Head;
import com.inteliense.aloft.server.html.elements.types.Page;
import com.inteliense.aloft.server.http.supporting.Endpoint;
import com.inteliense.aloft.server.http.supporting.Route;

import java.util.ArrayList;
import java.util.Arrays;

public class AloftPage extends Endpoint implements BuildsJava, AssertsLanguage, BuildsHtml {

    private String path = null;
    private String favicon = null;
    private String title = null;
    private ArrayList<Meta> meta = new ArrayList<>();
    private MountableComponent root;

    public AloftPage(Route route) {
        this.path = route.getPath();
    }

    public AloftPage(Route route, AppConfig appConfig) {
        this.path = route.getPath();
    }
    
    public AloftPage(String path, String favicon, String title) {
        this.path = path;
        this.favicon = favicon;
        this.title = title;
    }
    
    public void setPath(String path) {
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

    public void testAppend() {
        AloftScreen screen = new AloftScreen();
        AloftScreenContainer container = new AloftScreenContainer() {
            @Override
            protected AloftListener[] listeners() {
                return new AloftListener[0];
            }
        };
        TextAloftElement textElement = new TextAloftElement("Hello World!\n\nSincerely yours,\n- Server.") {
            @Override
            protected AloftListener[] listeners() {
                return new AloftListener[0];
            }
        };
        container.addChild(textElement);
        screen.addChild(container);
        this.root = screen;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public HtmlElement html() {
        return buildPage();
    }

    private Page buildPage() {
        Page page = new Page();
        page.addChild(buildHead("Hello World!", null, new ArrayList<>()));
        page.addChild(buildBody());
        return page;
    }

    private Body buildBody() {
        testAppend();
        Body body = new Body();
        String[] arr = new String[]{"__root__"};
        body.addChild(root.html());
        return body;
    }

    private Head buildHead(String title, String favicon, ArrayList<AloftPage.Meta> meta) {
        Head head = new Head();
        head.addTitle(title);
        return head;
    }

    public class Meta {

    }

}
