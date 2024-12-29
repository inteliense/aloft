package org.extendedweb.aloft.server.base.http.debug;

import org.extendedweb.aloft.lib._AloftProject;
import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.lib.lang.structure.elements.types.TextAloftElement;
import org.extendedweb.aloft.lib.html.HtmlRenderer;
import org.extendedweb.aloft.lib.http.supporting.Request;
import org.extendedweb.aloft.lib.http.supporting.Response;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.extendedweb.aloft.server.compiler.compile.base.AloftCompiler;

import java.io.IOException;

public class DebugServerHandler implements HttpHandler {

    private AppConfig config;

    public DebugServerHandler(AloftCompiler compiler) {
        this.config = compiler.getConfig();
    }

    @Override
    public void handle(HttpExchange t) throws IOException {
        try {
            app(t);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void app(HttpExchange t) {
        try {
            Request req = new Request(t, config);
            if (req.validated()) {
                Response resp = req.handle();
                if (resp != null) resp.send();
            } else {
                (new Response(t, "[500] Internal server error.", 500)).send();
            }
        } catch (Exception e) { e.printStackTrace(); (new Response(t, "[500] Internal server error.", 500)).send(); }
    }

}
