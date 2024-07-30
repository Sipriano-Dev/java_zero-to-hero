package com.sipriano.lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        UnaryOperator<String> convertStr = input -> input.toUpperCase();
        System.out.println(convertStr.apply("Sipriano"));

        UnaryOperator<String> sameValue = UnaryOperator.identity();
        System.out.println(sameValue.apply("Anderson"));

        UnaryOperator<Integer> doubleValue = value -> value*2;
        UnaryOperator<Integer> addThree = value -> value+3;
        Function<Integer, Integer> output1 = doubleValue.andThen(addThree);
        Function<Integer, Integer> output2 = doubleValue.compose(addThree);
        System.out.println(output1.apply(5));//13 Left to Right
        System.out.println(output2.apply(5));//16 Right to Left

    }
}
