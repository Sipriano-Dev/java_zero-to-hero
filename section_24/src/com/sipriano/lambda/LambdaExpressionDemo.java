package com.sipriano.lambda;

public class LambdaExpressionDemo {

    public static void main(String[] args) {

        //Functional interface have only 1 method, that way, it will create an object and guess
        //everything behind the scenes
        Hello hello = () -> System.out.println("Hello There");
        process(hello);

        process(() -> System.out.println("Hello There again"));
    }

    public static void process(Hello h) {
        h.sayHello();
    }

}
