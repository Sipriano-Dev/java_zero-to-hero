package com.sipriano.lambda;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String, String> convertStr = input -> input.toUpperCase();
        System.out.println(convertStr.apply("Sipriano"));

        Function<String, Integer> getStrLength = input -> input.length();
        System.out.println(getStrLength.apply("Sipriano"));

        Function<String, String> sameValue = Function.identity();
        System.out.println(sameValue.apply("Anderson"));

        Function<Integer, Integer> doubleValue = value -> value*2;
        Function<Integer, Integer> addThree = value -> value+3;
        Function<Integer, Integer> output1 = doubleValue.andThen(addThree);
        Function<Integer, Integer> output2 = doubleValue.compose(addThree);
        System.out.println(output1.apply(5));//13 Left to Right
        System.out.println(output2.apply(5));//16 Right to Left

    }
}
