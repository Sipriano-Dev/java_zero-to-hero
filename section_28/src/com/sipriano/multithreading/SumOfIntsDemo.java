package com.sipriano.multithreading;

public class SumOfIntsDemo {

    public static void main(String[] args) {

        long result = 0;
        long start = System.currentTimeMillis();
        for (long i=0; i<=Integer.MAX_VALUE; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("Time normal java class: " + (end - start));

    }

}
