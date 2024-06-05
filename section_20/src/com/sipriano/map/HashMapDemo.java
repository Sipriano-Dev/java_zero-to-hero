package com.sipriano.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "Delhi");
        countryMap.put("USA","Washington, DC");
        countryMap.put("France","Paris");
        countryMap.put(null,null);

        System.out.println(countryMap.get("USA"));
        countryMap.remove(null);
        System.out.println(countryMap.size());
        System.out.println(countryMap);

    }

}
