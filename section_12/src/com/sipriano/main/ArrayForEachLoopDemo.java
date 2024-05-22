package com.sipriano.main;

public class ArrayForEachLoopDemo {

    public static void main(String[] args) {

        int[] nums = {34, 24, 62, 67, 19};

        for (int num : nums) {
            System.out.println(num);
        }

        String[] names = {"Anderson", "Gabrielle"};

        for (int i=0; i<names.length; i++) {
            names[i] = names[i].toUpperCase();
        }

    }

}
