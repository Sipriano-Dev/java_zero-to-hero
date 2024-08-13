package com.sipriano.optional;

import java.util.Random;

public class OptionalDemo {

    public static void main(String[] args) {

        //Without Optional you have to handle possible null exception like this
        String msg = sayHello();
        if (msg != null) {
            System.out.println(msg.toUpperCase());
        }

    }

    public static String sayHello() {
        int num = new Random().nextInt();
        System.out.println(num);
        if (num % 2 == 0) {
            return "Hello World!";
        }
        return null;
    }

}
