package com.sipriano.lambda;

public class LambdaExpressionDemo {

    public static void main(String[] args) {

        //Functional interface have only 1 method, that way, it will create an object and guess
        //everything behind the scenes
        Hello hello = () -> System.out.println("Hello There");
        process(hello); //Approach 1

        process(() -> System.out.println("Hello There again")); //Approach 2 - Direct

//        ArithmeticOperation addition = (a, b) -> {
//            int result = a + b;
//            return result;
//        };
        ArithmeticOperation addition = (a, b)->a+b;
        ArithmeticOperation subtraction = (a, b)->a-b;
        ArithmeticOperation product = (a, b)->a*b;
        ArithmeticOperation division = (a, b)->a/b;

        System.out.println(addition.operation(5, 3));
        System.out.println(subtraction.operation(5, 3));
        System.out.println(product.operation(5, 3));
        System.out.println(division.operation(5, 3));
    }

    public static void process(Hello h) {
        h.sayHello();
    }

}
