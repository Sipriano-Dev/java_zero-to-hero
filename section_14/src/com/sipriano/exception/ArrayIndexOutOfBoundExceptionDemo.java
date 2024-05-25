package com.sipriano.exception;

import java.util.logging.Logger;

public class ArrayIndexOutOfBoundExceptionDemo {

    private static Logger logger = Logger.getLogger(ArrayIndexOutOfBoundExceptionDemo.class.getName());

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5};

        try {
            System.out.println(num[5]);
        } catch (Exception e) {
            logger.severe("Try again with a valid index number");
        }

    }

}
