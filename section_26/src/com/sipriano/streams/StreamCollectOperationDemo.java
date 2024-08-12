package com.sipriano.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamCollectOperationDemo {

    public static void main(String[] args) {

        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        List<String> newDepartmentList = departmentList.stream()
                .filter(word -> word.startsWith("S"))
                .toList();//Abbreviation of collect(Collectors.toList())
        newDepartmentList.forEach(System.out::println);

        Long newDepartmentList2 = departmentList.stream()
                .filter(word -> word.startsWith("S"))
                .count();//Abbreviation of collect(Collectors.count())
        System.out.println(newDepartmentList2);

        Set<String> newDepartmentList3 = departmentList.stream()
                .filter(word -> word.startsWith("S"))
                .collect(Collectors.toSet());

        Set<String> newDepartmentList4 = departmentList.stream()
                .filter(word -> word.startsWith("S"))
                .collect(Collectors.toCollection(TreeSet::new));

    }

}
