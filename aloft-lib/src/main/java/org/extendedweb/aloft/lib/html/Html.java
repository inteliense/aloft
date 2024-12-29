package org.extendedweb.aloft.lib.html;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftPage;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.components.AloftComponent;
import org.extendedweb.aloft.lib.lang.structure.elements.base.AloftElement;
import org.extendedweb.aloft.lib._AloftComponent;
import org.extendedweb.aloft.lib._AloftElement;
import org.extendedweb.aloft.lib._AloftPage;
import org.extendedweb.aloft.lib.http.supporting.Response;
import com.sun.net.httpserver.HttpExchange;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;

public class Html {

    private RenderType type;
    private Object object;
    private AloftTheme theme;
    private AppConfig config;

    public Html(RenderType type, Object object, AloftTheme theme, AppConfig config) {
        this.type = type;
        this.object = object;
        this.theme = theme;
        this.config = config;
    }

    public Response get(HttpExchange t) {
        System.out.println("buildResponse");
        Response resp = buildResponse(t);
        System.out.println("buildResponse COMPLETE");
        return resp;
    }

    private Response buildResponse(HttpExchange t) {
        Response response = new Response(t, string(), 200);
        ArrayList<String> values = new ArrayList<>();
        values.add("text/html");
        values.add("charset=utf-8");
        response.addHeader("Content-Type", values);
        response.addHeader("X-Content-Type-Options", Collections.singletonList("nosniff"));
        return response;
    }

    public String string() {
        System.out.println(type.name());
        System.out.println(object.getClass().getSimpleName());
        if(type == RenderType.PAGE && object.getClass() == _AloftPage.class)
            return renderPage((_AloftPage) object);
        if(type == RenderType.PAGE && object.getClass() == AloftPage.class)
            return renderPage((AloftPage) object);
        if(type == RenderType.COMPONENT && object.getClass() == AloftComponent.class)
            return renderComponent((AloftComponent) object);
        if(type == RenderType.COMPONENT && object.getClass() == _AloftComponent.class)
            return renderComponent((_AloftComponent) object);
        if(type == RenderType.ELEMENT && object.getClass() == _AloftElement.class)
            return renderElement((_AloftElement) object);
        if(type == RenderType.ELEMENT)
            return renderElement((AloftElement) object);
        return "hi";
    }

    public String string(String[] path) {
        if(type == RenderType.PAGE && object.getClass() == AloftPage.class)
            return renderPage((AloftPage) object);
        if(type == RenderType.PAGE && object.getClass() == _AloftPage.class)
            return renderPage((_AloftPage) object);
        if(type == RenderType.COMPONENT && object.getClass() == AloftComponent.class)
            return renderComponent((AloftComponent) object);
        if(type == RenderType.COMPONENT && object.getClass() == _AloftComponent.class)
            return renderComponent((_AloftComponent) object);
        if(type == RenderType.ELEMENT && object.getClass() == _AloftElement.class)
            return renderElement((_AloftElement) object);
        if(type == RenderType.ELEMENT)
            return renderElement((AloftElement) object);
        return "";
    }

    private String renderPage(AloftPage page) {
        System.out.println("RENDER PAGE");
        return page.html(theme, new ElementMapper(false, this.config)).getHtml();
    }

    private String renderComponent(AloftComponent component) {
        return "";
    }

    private String renderElement(AloftElement element) {
        return element.html(theme, null).getHtml();
    }

    private String renderPage(_AloftPage page) {
        return page.getFromPath().html(theme, null).getHtml();
    }

    private String renderComponent(_AloftComponent page) {
        return "";
    }

    private String renderComponent(_AloftPage page, String[] ids) {
        return page.getFromPath(ids).html(theme, null).getHtml();
    }

    private String renderElement(_AloftElement page) {
        return "";
    }

}
