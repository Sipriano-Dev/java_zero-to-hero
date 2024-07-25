package com.sipriano.lambda;

public class AnonymousClassDemo {

    public static void main(String[] args) {

        Hello hello = new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Anonymous");
            }
        };

        //You can pass direct too
        process(hello);

    }

    public static void process(Hello h) {
        h.sayHello();
    }

}
