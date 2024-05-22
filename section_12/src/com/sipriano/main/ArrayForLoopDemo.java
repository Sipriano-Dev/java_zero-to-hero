package com.sipriano.main;

public class ArrayForLoopDemo {

    public static void main(String[] args) {

        int[] mobileNumbers = new int[20];
        mobileNumbers[3] = 2456;
        mobileNumbers[7] = 63;
        mobileNumbers[12] = 744;

        for (int i=0; i < mobileNumbers.length; i++) {
            System.out.println("The element inside the index " + i + " is " + mobileNumbers[i]);
        }

    }

}
