package org.extendedweb.aloft.server.compiler.compile.base;

import org.extendedweb.aloft.lib._AloftProject;
import org.extendedweb.aloft.lib.application.cache.RouteCache;
import org.extendedweb.aloft.lib.application.config.AppConfig;
import org.extendedweb.aloft.server.compiler.compile.base.objects.*;
import org.extendedweb.aloft.server.compiler.compile.base.register.CompiledObjectsRegister;
import org.extendedweb.aloft.server.compiler.compile.supporting.ContextContainer;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;
import org.extendedweb.aloft.server.grammar.antlr.AloftLexer;
import org.extendedweb.aloft.server.grammar.antlr.AloftParser;
import org.antlr.v4.runtime.*;
import org.extendedweb.aloft.server.base.debug.FileWatcher;
import org.extendedweb.aloft.server.compiler.compile.base.register.ComponentObjectRegister;
import org.extendedweb.aloft.utils.global.__;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class AloftCompiler {

    private File dir = null;
    private boolean debug = false;
    private FileWatcher watcher = null;
    private CompiledObjectsRegister compiledObjects = null;
    AppConfig config;

    //debugging constructor
    public AloftCompiler(String dir, boolean debug) {
        this.dir = new File(dir);
        this.debug = debug;
        ComponentObjectRegister components = new ComponentObjectRegister();
        this.compiledObjects = new CompiledObjectsRegister(components);
        compileAll();
        if(this.debug) {
            watcher = new FileWatcher(this.dir) {
                @Override
                protected void compile(FileContains file) {
                    compileFile(file.getFile());
                }
            };
        }
    }

    public AloftCompiler(AppConfig config, boolean debug) {
        this.dir = new File(config.getProjectRootPath());
        this.config = config;
        this.debug = debug;
        this.compiledObjects = new CompiledObjectsRegister(new ComponentObjectRegister());
        compileFile(config.getEntryPoint());
        this.config.buildCache(compiledObjects.getRouteCache());
        System.out.println(compiledObjects.getRouteCache().getRouteList().getAllRoutes().size());
        System.out.println("-----");
        compiledObjects.getRouteCache().printCache();
        System.exit(1);
        if(this.debug) {
            watcher = new FileWatcher(this.dir) {
                @Override
                protected void compile(FileContains file) {
                    compileFile(file.getFile());
                }
            };
        }
    }

    public AppConfig getConfig() {
        return config;
    }

    private void compileAll() {
        iterate(this.dir.listFiles());
    }

    private void compileFile(File file) {
        try {
            System.out.println(file.getAbsoluteFile().getPath());
            InputStream stream = new FileInputStream(file);
            Lexer lexer = new AloftLexer(CharStreams.fromStream(stream));
            TokenStream tokenStream = new CommonTokenStream(lexer);
            AloftParser parser = new AloftParser(tokenStream);
            AloftParser.RContext r = parser.r();
            List<AloftParser.SyntaxContext> root = r.syntax();
            boolean importing = false;
            for(int i=0; i<root.size(); i++) {

                importing = compileImport(root, i, file, false);
                if (importing) continue;

                System.out.println(root.get(i).getText());

                ComponentAloftObject component = ComponentAloftObject.createIf(root, compiledObjects, i, file);
                if (isset(component)) {
                    compiledObjects.register(ComponentAloftObject.class, component, new ContextContainer(root.get(i).component().var_name(), file));
                    continue;
                }
                PageAloftObject page = PageAloftObject.createIf(root, compiledObjects, i, file);
                if (isset(page)) {
                    compiledObjects.register(PageAloftObject.class, page, new ContextContainer(root.get(i).page().var_name(), file));
                    continue;
                }
                RouteGroupAloftObject routeGroup = RouteGroupAloftObject.createIf(root, compiledObjects, i, file);
                if (isset(routeGroup)) {
                    compiledObjects.register(RouteGroupAloftObject.class, routeGroup, new ContextContainer(root.get(i).routes().var_name(), file));
                    continue;
                }
//                ModelAloftObject model = ModelAloftObject.createIf(root, compiledObjects, i, file);
//                if(isset(model)) {
//                    DbObject.linkIf(model, compiledObjects, compiledObjects.getConfig());
//                    compiledObjects.register(ModelAloftObject.class, model, new ContextContainer(root.get(i).model().var_name(), file));
//                    continue;
//                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (CompilerException e) {
            e.handle();
        }
    }

    private boolean compileImport(List<AloftParser.SyntaxContext> root, int index, File file, boolean importing) {

        AloftParser.SourceContext ctx = root.get(index).source();
        if(!__.isset(ctx) && importing) {
            compileFile(file);
            return false;
        } else if(__.isset(ctx)) {
            String path = getFullPathString(ctx.path().getText(), file);
            compileFile(new File(path));
            return true;
        }
        return false;

    }

    private String getFullPathString(String path, File file) {
        path = path.replaceAll("\"", "");
        if(path.charAt(0) == '/') return path;
        if(path.charAt(0) == '.' && path.charAt(1) == '/') return file.getParent() + "/" + path.substring(2);
        if(path.charAt(0) == '^') return (config.getProjectRootPath() + "/" + path).replaceAll("//", "/");
        return (config.getProjectRootPath() + "/" + path).replaceAll("//", "/");
    }

    private boolean isset(Object o) {
        return o != null;
    }

    private void iterate(File[] files) {
        for (File file : files) {
            if (file.isDirectory()) {
                iterate(file.listFiles());
            } else {
                if(file.getName().contains(".aloft")) compileFile(file);
            }
        }
    }

}
