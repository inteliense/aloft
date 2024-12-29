package org.extendedweb.aloft.server.compiler.compile.supporting;

import org.antlr.v4.runtime.ParserRuleContext;
import org.extendedweb.aloft.server.compiler.exceptions.CompilerException;

import java.io.File;

public class ContextContainer {

    private File file;
    private ParserRuleContext ctx;

    public ContextContainer(File file) {
        this.file = file;
    }

    public ContextContainer(ParserRuleContext ctx, File file) {
        this.ctx = ctx;
        this.file = file;
    }


    public File getFile() {
        return file;
    }

    public void e(ParserRuleContext ctx, String message, CompilerException.ExceptionType type) throws CompilerException {
        throw new CompilerException(ctx.start.getLine(), file, message, ctx.getText(), type);
    }

    public void e(String message, CompilerException.ExceptionType type) throws CompilerException {
        throw new CompilerException(ctx.start.getLine(), file, message, ctx.getText(), type);
    }

    public ParserRuleContext context() {
        return ctx;
    }
}
