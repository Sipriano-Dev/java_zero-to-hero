package com.sipriano.lambda;

import java.util.function.*;

public class BiFunctionsDemo {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a+b) % 2 == 0;
        System.out.println(isSumEven.test(2, 3));

        BiFunction<Double, Double, Double>  calculatePower = (num1, num2) -> Math.pow(num1, num2);
        System.out.println(calculatePower.apply(5.0, 2.0));

        BiConsumer<String, String> appendAndConvert = (input1, input2) -> System.out.println(input1.concat(input2).toUpperCase());
        appendAndConvert.accept("Anderson", " Sipriano");

        BiConsumer<String, String> appendAndLength = (input1, input2) -> System.out.println(input1.concat(input2).length());
        appendAndLength.accept("Anderson", " Sipriano");

        //BinaryOperator in Bifunction
        BinaryOperator<Double> calculatePowerB = (num1, num2) -> Math.pow(num1, num2);
        System.out.println(calculatePower.apply(5.0, 2.0));

        BinaryOperator<Integer> maxOperator = BinaryOperator.maxBy((a, b) -> Integer.compare(a, b));
        System.out.println(maxOperator.apply(2, 5));

        BinaryOperator<Integer> minOperator = BinaryOperator.minBy((a, b) -> Integer.compare(a, b));
        System.out.println(minOperator.apply(2, 5));

    }

}
