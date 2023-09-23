package com.inteliense.aloft.compiler.lang.keywords.listeners.base;

import com.inteliense.aloft.compiler.lang.base.BuildsJavascript;
import com.inteliense.aloft.server.html.elements.js.JavaScriptObject;
import com.inteliense.aloft.server.html.elements.js.JSOV;
import com.inteliense.aloft.server.html.elements.js.types.ElementRef;
import com.inteliense.aloft.server.html.elements.js.types.FunctionObject;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class AloftListener implements BuildsJavascript {

    protected ArrayList<String> required = new ArrayList<>();
    protected ArrayList<JSOV> vars;

    protected abstract JavaScriptObject create();

    @Override
    public JavaScriptObject getObject() {
        int required = this.required.size();
        int listed = 0;
        for (JSOV variable : vars)
            if (this.required.contains(variable.key())) listed++;
        assert listed == required : "Required variables for listener are not present.";
        return create();
    }

    protected abstract ArrayList<String> required(ArrayList<String> vars);

    public AloftListener(JSOV...variables) {
        this.required = required(new ArrayList<>());
        this.vars = new ArrayList<>(Arrays.asList(variables));
    }

    protected JavaScriptObject buildBase(String method) {
        JavaScriptObject base = new JavaScriptObject() {
            @Override
            public void create() {
                this.placeRef(FunctionArg.var("sticky"));
                this.var(FunctionArg.var("sticky"));
                this.chain("addEventListener", FunctionArg.preset(method), FunctionArg.var("function"));
                this.end();
                this.slot();
            }
        };
        base.setVars(new String[]{"sticky", "function"});
        base.setVars(vars);
        base.build();
        FunctionObject func = new FunctionObject();
        func.setVars(new String[]{"function", "function-slot"});
        func.setVars(vars);
        JavaScriptObject funcSlot = func.getVar("function-slot").get();
        funcSlot.build();
        func.build();
        func.setSlot(funcSlot);
        base.setSlot(func);
        return base;
    }

    public void setRef(String key, ElementRef ref) {
        this.vars.add(JSOV.v(key, ref));
    }

}
