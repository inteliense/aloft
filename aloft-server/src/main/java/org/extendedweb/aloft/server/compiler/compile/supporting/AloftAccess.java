package org.extendedweb.aloft.server.compiler.compile.supporting;

public class AloftAccess {

    public enum AloftAccessType {
        PUBLIC,
        REQUIRED,
        STATIC,
        PRIVATE,
        PUBLIC_REQUIRED,
        PUBLIC_STATIC,
        PRIVATE_REQUIRED,
        PRIVATE_STATIC,
        FUNCTION_ARG
    }

    private AloftAccessType type;

    public AloftAccess(AloftAccessType type) {
        this.type = type;
    }

    public AloftAccessType getType() {
        return this.type;
    }

    public static AloftAccess getFunctionType(boolean isStatic, boolean isPrivate) {
        if(isPrivate && isStatic) return new AloftAccess(AloftAccessType.PRIVATE_STATIC);
        if(isPrivate & !isStatic) return new AloftAccess(AloftAccessType.PRIVATE);
        if(isStatic) return new AloftAccess(AloftAccessType.STATIC);
        return new AloftAccess(AloftAccessType.PUBLIC);
    }

}