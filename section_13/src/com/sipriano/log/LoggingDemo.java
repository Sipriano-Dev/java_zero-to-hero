package com.sipriano.log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingDemo {

    private static Logger logger = Logger.getLogger(LoggingDemo.class.getName());

    public static void main(String[] args) {

        logger.info("This is info level logging");
        logger.log(Level.INFO, "This is info level logging");

    }

}
