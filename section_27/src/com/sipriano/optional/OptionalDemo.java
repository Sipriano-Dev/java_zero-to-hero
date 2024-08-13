package com.sipriano.optional;

import java.util.Optional;
import java.util.Random;

public class OptionalDemo {

    public static void main(String[] args) throws Exception {

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

        optionalMsg.ifPresentOrElse(x -> System.out.println(x.toUpperCase()),
                () -> System.out.println("Value is absent"));

        String msg = optionalMsg.orElse("Value is absent too");
        System.out.println(msg);

        String msg2 = optionalMsg.orElseGet(() -> "Value is absent too 2");
        System.out.println(msg2);

//        String msg3 = optionalMsg.orElseThrow();
//        String msg3 = optionalMsg.orElseThrow(() -> new IllegalArgumentException("Value is absent"));
//        System.out.println(msg3);

        Optional<String> mapOptionalStr = optionalMsg.map(String::toUpperCase);
        System.out.println(mapOptionalStr);//if is not present, will be an empty object

        Optional<String> filterOptionalStr = optionalMsg.filter(input -> input.length() > 5);
        System.out.println(filterOptionalStr);//if is not present, will be an empty object


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
