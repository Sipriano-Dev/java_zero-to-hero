package com.sipriano.set;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("India");
        treeSet.add("USA");
        treeSet.add("Germany");

        System.out.println(treeSet);

        treeSet.remove("Germany");

        System.out.println("TreeSet after remove");
        System.out.println(treeSet);

        System.out.println("Size of TreeSet");
        System.out.println(treeSet.size());

        System.out.println("Is India present in TreeSet");
        System.out.println(treeSet.contains("India"));

        System.out.println("First element of TreeSet");
        System.out.println(treeSet.first());

        System.out.println("Last element of TreeSet");
        System.out.println(treeSet.last());




    }

}
