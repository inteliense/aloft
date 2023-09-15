package com.inteliense.aloft.run.cli.commands.base;


import com.inteliense.aloft.run.cli.config.AppConfig;

import java.util.Arrays;

@SuppressWarnings("rawtypes")
public class Command {

    private Arg cmd = null;
    private Arg[] args = null;
    private Class cmdClass = null;

    public Command(String[] args, AppConfig config) {
        Arg[] arr = Parser.getArgs(args);
        cmd = arr[0];
        cmdClass = Keywords.getClass(cmd.getName());
        this.args = Arrays.copyOfRange(arr, 1, arr.length);
    }

    public Class<?> getCommandClass() {
        return this.cmdClass;
    }

    public Arg getBase() {
        return cmd;
    }

    public Arg[] getArgs() {
        return this.args;
    }

}