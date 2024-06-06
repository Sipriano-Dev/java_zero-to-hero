package com.sipriano.map;

import java.util.*;

public class HashMapIterationDemo {

    public static void main(String[] args) {

        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "Delhi");
        countryMap.put("USA","Washington, DC");
        countryMap.put("France","Paris");
        approach3(countryMap);

    }

    //Approach 1
    public static void approach1(Map<String, String> countryMap) {

        /*
        Set<String> set = countryMap.keySet();
        for (String key : set) {
            String capital = countryMap.get(key);
            System.out.println(key + ":" + capital);
        }

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String capital = countryMap.get(key);
            System.out.println(key + ":" + capital);
        }
        */
    }

    //Approach 2
    public static void approach2(Map<String, String> countryMap) {

        /*
        Set<Map.Entry<String, String>> entries = countryMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String capital = entry.getValue();
            System.out.println(key + ":" + capital);
        }

        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String capital = entry.getValue();
            System.out.println(key + ":" + capital);
        }
        */
    }

    //Approach 3
    public static void approach3(Map<String, String> countryMap) {

        Collection<String> values = countryMap.values();
        for (String value : values) {
            System.out.println(value);
        }

    }

}
