package com.sipriano.optional;

import java.util.Optional;
import java.util.Random;

public class OptionalDemo {

    public static void main(String[] args) {

        //Without Optional you have to handle possible null exception like this
        String message = sayHi();
        if (message != null) {
            System.out.println(message.toUpperCase());
        }

        //Using Optional the course way
        Optional<String> optionalMsg = sayHello();
        if (optionalMsg.isPresent()) {
            System.out.println(optionalMsg.get().toUpperCase());
        }

        //Another way
        optionalMsg.ifPresent(x -> System.out.println(x.toUpperCase()));


    }

    public static Optional<String> sayHello() {
        int num = new Random().nextInt();
        System.out.println(num);
        String msg = null;
        if (num % 2 == 0) {
            msg = "Hello World!";
        }
        return Optional.ofNullable(msg);
    }

//    public static Optional<String> sayHello() {
//        int num = new Random().nextInt();
//        System.out.println(num);
//        if (num % 2 == 0) {
//            return Optional.of("Hello World!");
//        }
//        return Optional.empty();
//    }

    public static String sayHi() {
        int num = new Random().nextInt();
        System.out.println(num);
        if (num % 2 == 0) {
            return "Hi World!";
        }
        return null;
    }

}
