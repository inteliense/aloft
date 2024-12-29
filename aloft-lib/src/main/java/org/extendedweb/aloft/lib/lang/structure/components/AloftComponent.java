package org.extendedweb.aloft.lib.lang.structure.components;

import org.extendedweb.aloft.lib.ModuleElementAttributes;
import org.extendedweb.aloft.lib.lang.base.BuildsAppJavascript;
import org.extendedweb.aloft.lib.lang.base.BuildsHtml;
import org.extendedweb.aloft.lib.lang.base.ElementMapper;
import org.extendedweb.aloft.lib.lang.structure.AloftTheme;
import org.extendedweb.aloft.lib.lang.structure.listeners.base.AloftListener;
import org.extendedweb.aloft.lib.lang.structure.style.*;
import org.extendedweb.aloft.lib.lang.types.base.T;
import org.extendedweb.aloft.lib.html.elements.HtmlElement;
import org.extendedweb.aloft.lib.html.elements.js.*;
import org.extendedweb.aloft.lib.http.supporting.VariableNode;
import org.extendedweb.aloft.lib.http.supporting.VariableTree;
import org.extendedweb.aloft.utils.encryption.A32;
import org.extendedweb.aloft.utils.encryption.Rand;
import org.extendedweb.aloft.utils.encryption.SHA;
import org.extendedweb.aloft.utils.global.__;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AloftComponent implements BuildsHtml, BuildsAppJavascript {

    protected ArrayList<AloftComponent> children = new ArrayList<>();
    private int currentIndex = 0;
    private String name = null;
    private VariableTree state = new VariableTree();

    private String parentComponent = "__root__";
    protected String veryUniqueId = null;
    protected String uniqueId = "";
    protected String friendlyId = "";

    protected ArrayList<String> moduleSubclasses = new ArrayList<>();
    protected ArrayList<AloftStyleClass> classes = new ArrayList<>();
    protected AloftStyle style = new AloftStyle();
    protected ArrayList<AloftListener> listeners = new ArrayList<>();
    protected AloftObjectProperties vars;
    protected JavaScriptBuilder jsBuilder = new JavaScriptBuilder();
    protected JavaScript scripts = null;

    public AloftComponent() {
        this.name = getName();
        setIds(this.name);
        vars = getProperties();
    }

    public AloftComponent(HashMap<String, Object> properties) {
        this.name = getName();
        setIds(this.name);
        vars = getProperties();
        resetProperties(properties);
    }

    public void setVars(ArrayList<AtomicReference<AloftObjectProperty>> properties) {
        ArrayList<AtomicReference<AloftObjectProperty>> defaultProps = this.vars.all();
        for (AtomicReference<AloftObjectProperty> prop : defaultProps) {
            String defName = prop.get().getName();
            for (AtomicReference<AloftObjectProperty> _prop : properties) {
                String name = _prop.get().getName();
                if (__.same(defName, name)) {
                    this.vars.replace(name, _prop.get().value());
                    break;
                }
            }
        }
        System.out.println("SET VARS");
    }

    //TODO get default properties and dynamic building of a component

    public void addChild(AloftComponent component) {
        component.setParentComponent(getName());
        this.children.add(component);
        setIds();
    }

    public String getComponentName() {

        String name = getName();
        String finalName = "";
        Pattern p = Pattern.compile("__([a-z])([a-z]+)__");
        Matcher m = p.matcher(name);
        while(m.find()) {
            finalName += m.group(1).toUpperCase();
            finalName += m.group(2);
        }

        return finalName.replace("_", "");

    }

    public String getParentComponent() {
        return parentComponent;
    }

    public void setParentComponent(String name) {
        this.parentComponent = name;
    }

    public void setIds() {
        for(int i=0; i< children.size(); i++) children.get(i).setIds(this.uniqueId + "_" + i);
    }

    public void setIds(String parent) {
        this.uniqueId = A32.casified(SHA.getHmac256(parent, getName()));
        for(int i=0; i< children.size(); i++) children.get(i).setIds(this.uniqueId + "_" + i);
    }

    public void setState(VariableTree tree) {
        if(!__.isset(tree)) return;
        this.state = tree;
    }

    public AloftStyleCss appendCss(AloftStyleCss css) {
        ArrayList<AloftStyleClass> c = getAloftClasses();
        for(int x=0; x<c.size(); x++) {
            css.append(c.get(x));
        }
        for(int i=0; i< children.size(); i++) {
            AloftComponent component = children.get(i);
            css = component.appendCss(css);
        }
        return css;
    }

    public void appendState(String key, T t, Object v) {
        state.addNode(key, t, v);
    }

    public VariableTree getState() {
        return state;
    }

    public void setClasses(ArrayList<AloftStyleClass> classes, AloftTheme theme) {
//        applyOverrides();
        this.classes = classes;
        for(int i=0; i< children.size(); i++) {
//            children.get(i).applyOverrides();
            children.get(i).setClasses(theme.mergeByHash(children.get(i).getStyle().getHashes()), theme);
        }
    }

    public void applyOverrides() {  }

    public void addConditionalStyle(String groupId, String key, String elementKey, AloftStyle style) {
        this.classes.add(new AloftStyleConditionalClass(A32.casified(SHA.getHmac256(key, elementKey)), style, groupId, key, elementKey));
    }

    public ArrayList<AloftStyleClass> getAloftClasses() {
        return this.classes;
    }

    protected void applyListeners(String key, String ref, HtmlElement element) {
        for (int i = 0; i < listeners.size(); i++) {
            AloftListener listener = listeners.get(i);
            if (listener.match(key)) {
                element.setRef(ref);
                listener.setElement(ref, element);
            }
        }
    }

    protected void applyListeners(String key, HtmlElement element) {
        for (int i = 0; i < listeners.size(); i++) {
            AloftListener listener = listeners.get(i);
            if (listener.match(key)) {
                listener.setElement(null, element);
            }
        }
    }

    public AloftObjectProperties getProperties() {
        return new AloftObjectProperties();
    }

    public void addStyle(String property, String value) {
        this.style.addStyle(new AloftStylePair(property, value));
    }

    public void addStyle(String property, String value, boolean important) {
        AloftStylePair style = new AloftStylePair(property, value, important);
        this.style.addStyle(style);
    }

    public void addStyle(String property, String value, String[] psuedo, boolean important) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i< psuedo.length; i++) builder.append(":").append(psuedo[i]);
        AloftStylePair style = new AloftStylePair(property, value, builder.toString(), important);
        this.style.addStyle(style);
    }

    public void addStyleWithinElement(String property, String value, AloftTheme theme) {
        this.style.addStyle(new AloftStylePair(property, value));
    }

    public AloftStyle getStyle() {
        return this.style;
    }

    public String getId() {
        return this.uniqueId;
    }

    protected String[] getModuleSubclasses() {
        String[] arr = new String[moduleSubclasses.size()];
        moduleSubclasses.toArray(arr);
        return arr;
    }

    public void appendState(String path, String key, T t, Object v) {
        VariableNode node = state.getByPath(path + "." + key);
        boolean create = false;
        if(!__.isset(node)) {
            node = state.getByPath(path);
            if(!__.isset(node)) return;
            create = true;
        }
        if(node.getValue().get().getClass() == VariableTree.class && !create) {
            ((VariableTree) node.getValue().get()).addNode(key, t, v);
        } else {
            node.setValue(v);
        }
    }

    public AloftComponent next() {
        if(currentIndex == children.size()) return null;
        AloftComponent component = children.get(currentIndex);
        currentIndex++;
        return component;
    }

    public void addSubclass(String key) {
        this.moduleSubclasses.add(key);
    }

    public String getName() {
        return this.name;
    }

    public String getFriendlyId() { return this.friendlyId; }

    protected String createId(String seed) {
        String v = this.getClass().getName() + "_" + this.name + "_" + seed + "_" + __.hex(Rand.secure(32));
        String hash = SHA.getSha1(v);
        return A32.casified(hash);
    }

    protected HtmlElement createElement(String key, ModuleElementAttributes attributes) {
        HtmlElement element = createElement(key, createId(String.valueOf(System.currentTimeMillis())), this.getName());
        attributes.apply(element);
        return element;
    }

    protected HtmlElement createElement(String key) {
        return createElement(key, this.uniqueId, this.getName());
    }

    protected static HtmlElement createElement(String key, String id, String name) {
        HtmlElement el = new HtmlElement(id) {
            @Override
            public String getKey() {
                return key;
            }
        };
        el.setParentComponent(name);
        return el;
    }

    private ArrayList<AloftStyleConditionalClass> getConditionalClasses() {
        ArrayList<AloftStyleConditionalClass> conditionalClasses = new ArrayList<>();
        for(AloftStyleClass c : classes) if(c.isConditional()) conditionalClasses.add((AloftStyleConditionalClass) c);
        return conditionalClasses;
    }

    @Override
    public HtmlElement html(AloftTheme theme, ElementMapper mapper) {
        try {
            HtmlElement root = create(theme, mapper);
            System.out.println(getName());
            System.out.println(root.getHtml());
            System.exit(246);
            for (AloftComponent component : children) {
                root.addChild(component.html(theme, mapper));
                System.out.println(component.html(theme, mapper).getHtml());
                System.exit(246);
            }
            return root;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("HTML");
        return null;
    }

    @Override
    public HtmlElement html(AloftTheme theme, ElementMapper mapper, HashMap<String, Object> properties)  {
        resetProperties(properties);
        return html(theme, mapper);
    }

    public void resetProperties(HashMap<String, Object> properties) {
        vars = getProperties();
        for(String key : properties.keySet()) {
            vars.replace(key, properties.get(key));
        }
    }

//    public ElementRef ref(String override) {
//        ElementRef ref = new ElementRef(override);
//        ElementRef.Selector selector = ElementRef.Selector.byId(this.uniqueId);
//        ref.addRef(selector, ElementRef.Type.SINGLE);
//        return ref;
//    }

    public void addListener(String key, AloftListener listener) {
        listener.setElementKey(key);
        this.listeners.add(listener);
    }

    @Override
    public void javascript(AtomicReference<AppJavaScript> js) {
        AppJavaScript appJs = js.get();
        for(int i=0; i<this.listeners.size(); i++) {
            this.listeners.get(i).setRef();
            this.listeners.get(i).setMapper(appJs.getMapper());
//            this.listeners.get(i).inline();
            jsBuilder.addObject(this.listeners.get(i).getObject());
        }
        if(this.jsBuilder.empty()) {
            for(int i=0; i<this.children.size(); i++) this.children.get(i).javascript(js);
            return;
        }
        this.scripts = appJs.apply(new JavaScript(JavaScriptWriterType.ELEMENT, this.jsBuilder));
        js.set(appJs);
        for(int i=0; i<this.children.size(); i++) this.children.get(i).javascript(js);
    }
}
