package com.sipriano.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamCreationDemo {

    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        Stream<String> departmentStream = departmentList.stream();
        departmentStream.forEach(System.out::println);
        //departmentStream.parallel(); //Convert to parallel, any collection

        Stream<String> inStream = Stream.of("Anderson", "Sipriano");
        inStream.forEach(System.out::println);

        Stream<String> departmentStreamP = departmentList.parallelStream();
        departmentStreamP.forEach(System.out::println);

        String[] arrayOfWords = {"Anderson", "Sipriano"};
        Stream<String> arrayStream = Arrays.stream(arrayOfWords);
        arrayStream.forEach(System.out::println);

        //Can be any type element
        Stream<String> emptyStream = Stream.empty();

        //This is loop infinity
        Stream.generate(new Random()::nextInt).forEach(System.out::println);
        Stream.iterate(1, n -> n+1).forEach(System.out::println);
        Stream.iterate(1, new Random()::nextInt).forEach(System.out::println);

    }

}
