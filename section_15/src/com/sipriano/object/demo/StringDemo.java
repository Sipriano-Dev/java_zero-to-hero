package com.sipriano.object.demo;

public class StringDemo {

    public static void main(String[] args) {

        String str1 = new String("Anderson");
        String str2 = new String("Anderson");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println(str1.equals(str2));

    }

}
