package org.extendedweb.aloft.lib.http.supporting;

import org.extendedweb.aloft.lib.lang.types.base.A;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;

public class RoutePath {

    private ArrayList<RouteSegment> segments = new ArrayList<>();
    private boolean hasWildcard = false;
    private VariableTree vars = new VariableTree();

    public RoutePath(String path) {
        this.segments.addAll(getList(path));
    }

    public RoutePath(String path, VariableTree vars) {
        this.segments.addAll(getList(path));
        this.vars = vars;
    }

    public boolean matches(String path) {
        ArrayList<RouteSegment> segments = getList(path);
        if(segments.size() != this.segments.size()) return false;
        for(int i=0; i<segments.size(); i++) {
            RouteSegment segment = this.segments.get(i);
            if(segment.isWildcard()) continue;
            if(!__.same(segments.get(i).getValue(), this.segments.get(i).getValue())) return false;
        }
        return true;
    }

    public VariableTree getVariables(String path) {
        ArrayList<RouteSegment> segments = getList(path);
        int varIndex = 0;
        for(int i=0; i<segments.size(); i++) {
            RouteSegment segment = this.segments.get(i);
            if(segment.isWildcard()) {
                vars.getByIndex(varIndex).setValue(segments.get(i).getValue());
                varIndex++;
            }
        }
        return vars;
    }

    public boolean hasWildcard() {
        return hasWildcard;
    }

    public String getPathString() {
        String path = "";
        for(int i=0; i<segments.size(); i++) {
            path += "/";
            if(segments.get(i).isWildcard()) path += "*";
            else path += segments.get(i).getValue();
        }
        return path;
    }

    public String getPathWithVars() {
        return "";
    }

    public ArrayList<RouteSegment> getList(String path) {
        if(path.equals("/")) {
            ArrayList<RouteSegment> index = new ArrayList<>();
            index.add(new RouteSegment("/", false));
            return index;
        }
        path = (path.charAt(0) == '/') ? path.substring(1) : path;
        String[] arr = path.split("/");
        ArrayList<RouteSegment> segments = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            String segment = arr[i];
            boolean isWildcard = __.same(segment, "*");
            if(isWildcard) this.hasWildcard = true;
            if(isWildcard) segments.add(new RouteSegment(true));
            else segments.add(new RouteSegment(segment));
        }
        return segments;
    }

    public static class RouteSegment {

        private boolean wildcard = false;
        private String value;

        public RouteSegment() { }

        public RouteSegment(String value) {
            this.value = value;
        }

        public RouteSegment(String value, boolean isWildcard) {
            this.value = value;
            this.wildcard = isWildcard;
        }

        public RouteSegment(boolean isWildcard) {
            this.wildcard = isWildcard;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setAsWildcard() {
            this.wildcard = true;
        }

        public String getValue() {
            return value;
        }

        private boolean isWildcard() {
            return wildcard;
        }

        public boolean hasValue() {
            return __.isset(value);
        }

    }

}
