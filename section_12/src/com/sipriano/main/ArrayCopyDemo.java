package com.sipriano.main;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopyDemo {

    public static void main(String[] args) {

        int[] oldArray = {1, 2, 3, 4, 5};
        int[] newArray = new int[oldArray.length + 5];

        //copyArrayUsingLoop(oldArray, newArray);
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        int[] targetArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        int[] targetArray1 = Arrays.copyOfRange(oldArray, 1, 4);

        for (int num : targetArray1) {
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
