package com.sipriano.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetDemo {

    public static void main(String[] args) {
        //Immutable java 8
        Set<String> stringSet = new HashSet<>(Arrays.asList("a", "b", "c"));
        Collections.unmodifiableSet(stringSet);

        //Immutable java 9
        Set<String> stringSet1 = Set.of("a", "b", "c");
        processSet(stringSet1);
    }

    public static void processSet(Set<String> stringSet) {
        //stringSet.add("d");
        for (String e : stringSet) {
            System.out.println(e.toUpperCase());
        }
    }

}
