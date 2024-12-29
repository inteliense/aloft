package org.extendedweb.aloft.server.tests;

import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.server.base.http.debug.DebugServer;
import org.extendedweb.aloft.server.compiler.compile.base.AloftCompiler;

import java.io.IOException;

public class CompiledObjectsTest {

    public static void main(String[] args) throws IOException, InterruptedException {
        AppConfig config = new AppConfig("C:\\Users\\ryanfitzgerald\\Development\\aloft\\aloft-server\\fake-project\\my-project.json");
        AloftCompiler compiler = new AloftCompiler(config, false);
        new DebugServer(compiler, 8181, false, true);
        while(true) {
            Thread.sleep(5000);
        }
    }

}
