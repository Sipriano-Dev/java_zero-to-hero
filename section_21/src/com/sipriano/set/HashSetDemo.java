package com.sipriano.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> visitedCountries = new HashSet<>();
        visitedCountries.add("India");
        visitedCountries.add("Brazil");
        visitedCountries.add("France");
        visitedCountries.add("India"); //Will not add

        for (String e : visitedCountries) {
            System.out.println(e);
        }
    }

}
