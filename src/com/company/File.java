package com.company;
import java.util.logging.*;
import java.io.IOException;

public class File {
    static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void FileLogger() throws SecurityException, IOException {
        LogManager.getLogManager().reset();
        log.setLevel(Level.ALL);
        log.log(Level.INFO, "Test log");

        try {
            FileHandler fh = new FileHandler("log.txt");
            fh.setFormatter(new SimpleFormatter());
            fh.setLevel(Level.WARNING);
            log.addHandler(fh);
        } catch (Exception e) {
            log.warning("Warning!");
        }
    }

    public static void Warning() {
        log.warning("Log out warning!");
    }

    public static void Severe() {
        log.severe("Log out severe!");
    }
}

class ThrowError1 extends Exception {
    ThrowError1() {
        super("Warning!");
    }

    ThrowError1(String msg) throws SecurityException, IOException {
        super(msg);
        File.FileLogger();
    }
}

class ThrowError2 extends Exception {
    ThrowError2() {
        super("Severe");
    }

    ThrowError2(String msg) throws SecurityException, IOException {
        super(msg);
        File.FileLogger();
    }
}

class globalUse {
    public static void Use() throws SecurityException, IOException {
        File.FileLogger();
        File.Warning();
        File.Severe();
    }
}
