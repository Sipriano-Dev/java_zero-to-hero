package com.sipriano.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIterationDemo {

    public static void main(String[] args) {

        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "Delhi");
        countryMap.put("USA","Washington, DC");
        countryMap.put("France","Paris");
        approach2(countryMap);

    }

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

    public static void approach2(Map<String, String> countryMap) {

        Set<Map.Entry<String, String>> entries = countryMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String capital = entry.getValue();
            System.out.println(key + ":" + capital);
        }

        /*
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String capital = entry.getValue();
            System.out.println(key + ":" + capital);
        }
        */
    }

}
