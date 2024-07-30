package com.sipriano.lambda.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Exercise2 {

    public static void main(String[] args) {

        System.out.println(transformStringLengths(Arrays.asList("Anderson", "Gabrielle")));

    }

    public static List<Integer> transformStringLengths(List<String> strings) {

        Function<String, Integer> sizeOfElements = e -> e.length();

        List<Integer> sizes = new ArrayList<>();
        for (String e : strings) {
            sizes.add(sizeOfElements.apply(e));
        }
        return sizes;
    }

}
