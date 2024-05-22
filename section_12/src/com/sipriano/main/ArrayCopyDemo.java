package com.sipriano.main;

public class ArrayCopyDemo {

    public static void main(String[] args) {

        int[] oldArray = {1, 2, 3, 4, 5};
        int[] newArray = new int[oldArray.length + 5];

        copyArrayUsingLoop(oldArray, newArray);

        for (int num : newArray) {
            System.out.println(num);
        }

    }

    private static int[] copyArrayUsingLoop(int[] oldArray, int[] newArray) {
        for (int i=0; i<oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        return newArray;
    }

}
