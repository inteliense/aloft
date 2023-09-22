package com.inteliense.aloft.server.html.elements.js;

import com.inteliense.aloft.utils.global.__;

public class JavaScript {

    private JavaScriptWriterType type;
    private JavaScriptBuilder js;

    public JavaScript(JavaScriptWriterType type, JavaScriptBuilder js) {
        this.type = type;
        this.js = js;
    }

    public JavaScriptWriterType getType() {
        return type;
    }

    public String getTag() {
        if(type == JavaScriptWriterType.ELEMENT && __.isset(getElement())) return getElement().getHtml();
        else if(type == JavaScriptWriterType.FILE && __.isset(getFile())) return getFile().getHtml();
        return "";
    }

    public String getValue() {
        if(type == JavaScriptWriterType.ELEMENT && __.isset(getElement())) return getElement().getValue();
        else if(type == JavaScriptWriterType.FILE && __.isset(getFile())) return getFile().getValue();
        return "";
    }

    private JavaScriptElement getElement() {
        if(type == JavaScriptWriterType.ELEMENT)
            return js.getElement();
        return null;
    }

    public JavaScriptFile getFile() {
        if(type == JavaScriptWriterType.FILE)
            return js.getFile();
        return null;
    }

}
