package com.sipriano.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

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
    }

}
