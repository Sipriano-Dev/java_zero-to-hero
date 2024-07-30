package com.sipriano.lambda.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Exercise3 {

    public static void main(String[] args) {
        System.out.println(incrementList(Arrays.asList(2, 6, 2, 7), 1));
    }

    public static List<Integer> incrementList(List<Integer> numbers, int incrementValue) {

        UnaryOperator<Integer> increment = e -> e+incrementValue;

        List<Integer> incrementedList = new ArrayList<>();
        for (Integer num : numbers) {
            incrementedList.add(increment.apply(num));
        }
        return incrementedList;
    }

}
