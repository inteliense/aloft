package com.inteliense.aloft.server.http.supporting;

import com.inteliense.aloft.application.config.AppConfig;
import com.inteliense.aloft.compiler.lang.keywords.AloftPage;
import com.inteliense.aloft.compiler.lang.keywords.AloftTheme;
import com.inteliense.aloft.compiler.lang.lib._AloftPage;
import com.inteliense.aloft.compiler.lang.supporting.MountableComponent;
import com.inteliense.aloft.compiler.tests._TestProject;
import com.inteliense.aloft.server.html.elements.HtmlElement;
import com.inteliense.aloft.server.html.elements.css.FontEndpoint;
import com.inteliense.aloft.server.html.elements.css.StylesheetEndpoint;
import com.inteliense.aloft.server.html.elements.files.ImageEndpoint;
import com.inteliense.aloft.server.html.elements.js.AppJavaScript;
import com.inteliense.aloft.server.html.elements.js.JavaScriptBuilder;
import com.inteliense.aloft.server.html.elements.js.ScriptEndpoint;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class Endpoint {

    protected RoutePath path;
    protected RequestType type;
    protected AloftRequestType internalType;
    protected VariableTree vars;
    protected AloftTheme theme;
    protected ArrayList<HtmlElement> staticFiles;
    protected AtomicReference<AppJavaScript> js;

    public Endpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars) {
        this.path = route.getPath();
        this.type = type;
        this.internalType = internalType;
        this.vars = vars;
    }

    public Endpoint(Route route, RequestType type, AloftRequestType internalType, VariableTree vars, AppConfig config) {
        this.path = route.getPath();
        this.type = type;
        this.internalType = internalType;
        this.vars = vars;
        this.theme = config.getTheme();
        this.staticFiles = config.getStaticFiles();
        this.js = config.getAppJs();
    }

    public static Endpoint create(String requestPath, Route route, RequestType type, AloftRequestType internalType, AppConfig config) throws Exception {
        if(internalType == AloftRequestType.JAVASCRIPT_FILE) return new ScriptEndpoint(route, type, internalType, route.getPath().getVariables(requestPath), config.getStaticJavaScript(route.getPath().getPathString()));
        if(internalType == AloftRequestType.STYLESHEET_FILE) return new StylesheetEndpoint(route, type, internalType, route.getPath().getVariables(requestPath), config.getStaticStylesheet(route.getPath().getPathString()));
        if(internalType == AloftRequestType.FONT_FILE) return new FontEndpoint(route, type, internalType, route.getPath().getVariables(requestPath), config.getStaticFont(route.getPath().getPathString()));
        if(internalType == AloftRequestType.SERVER_SIDE_RENDERING) return new AloftPage(route, type, internalType, route.getPath().getVariables(requestPath), config, ((_AloftPage) route.instantiate()).getRoot());
        return new AloftPage(route, type, internalType, route.getPath().getVariables(requestPath), config);
    }

    public static Endpoint create(String requestPath, Route route, RequestType type, AloftRequestType internalType, AppConfig config, String[] componentPath) {
        return new AloftPage(route, type, internalType, route.getPath().getVariables(requestPath), config);
    }

    public RoutePath getPath() {
        return path;
    }
}
