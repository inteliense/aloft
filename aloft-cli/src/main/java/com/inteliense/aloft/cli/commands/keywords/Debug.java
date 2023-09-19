package com.inteliense.aloft.cli.commands.keywords;

import com.inteliense.aloft.cli.Help;
import com.inteliense.aloft.cli.commands.base.Command;
import com.inteliense.aloft.cli.commands.base.HandlesCommands;
import com.inteliense.aloft.cli.config.AppConfig;
import com.inteliense.aloft.utils.global.__;
import com.inteliense.aloft.utils.sys.shell.Run;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Debug extends HandlesCommands {

    public Debug(Command command, AppConfig config) {
        super(command, config);
    }

    @Override
    public void run(AppConfig config) {
        File dot = new File(".aconf");
        if (!dot.exists()) {
            File cwd = new File("");
            String fullPath = cwd.getAbsolutePath();
            if (fullPath.contains("/src/")) {
                int index = fullPath.indexOf("/src/") + 5;
                String _dot = fullPath.substring(0, index) + ".aconf";
                dot = new File(_dot);
                if (!dot.exists()) command.exit("Could not find the aloft project from this directory.", 1);
            } else {
                command.exit("Could not find the aloft project from this directory.", 1);
            }
        }
        try {
            Scanner scnr = new Scanner(dot);
            String src = "";
            String project = "";
            for (int i = 0; i < 3; i++) {
                if (!scnr.hasNextLine()) break;
                String line = scnr.nextLine();
                if (i == 1) project = line;
                if (i == 2) src = line;
            }
            if (!__.empty(src) && !__.empty(project)) {
                try {
                    Run cmd = new Run("aloft-server debug --src " + src + " --config " + project) {
                        @Override
                        public void lineRead(byte[] bytes, String line) {
                            System.out.println(line);
                        }
                    };
                    __.printPrettyLn(cmd.getStatusString(), __.ANSI_YELLOW);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                command.exit("Corrupt .aconf file.", 1);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Help help() {
        return null;
    }

}