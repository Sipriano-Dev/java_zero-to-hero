package com.sipriano.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterOperationDemo {

    public static void main(String[] args) {

        List<String> departmentList = new ArrayList<>();
        departmentList.add("supply");
        departmentList.add("HR");
        departmentList.add("sales");
        departmentList.add("Marketing");

        departmentList.stream().filter(word -> word.startsWith("S")).map(String::toUpperCase).forEach(System.out::println);

        //My test to capital letter
        departmentList.stream()
                .filter(word -> word.startsWith("s"))
                .map(word -> word.toUpperCase().charAt(0) + word.substring(1))//My gosh, I am good!
                .forEach(System.out::println);

    }

}
