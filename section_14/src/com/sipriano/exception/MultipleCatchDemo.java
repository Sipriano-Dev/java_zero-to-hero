package com.sipriano.exception;

import java.util.logging.Logger;

public class MultipleCatchDemo {

    private static Logger logger = Logger.getLogger(MultipleCatchDemo.class.getName());

    public static void main(String[] args) {

        String str = null;

        try {
            str = "Anderson";
            str = str.toUpperCase();
            logger.info(str);
            str = str.substring(1, 10);
            logger.info(str);
        } catch (NullPointerException e) {
            logger.severe("An null pointer exception occurred. Please check your data");
        } catch (StringIndexOutOfBoundsException e) {
            logger.severe("IndexOutOfBoundsException exception occurred. Please check your input data");
        } catch (Exception e) {
            logger.severe("Exception exception occurred. Please check your input data");
        }

    }

}
