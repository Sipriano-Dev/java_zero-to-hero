package com.sipriano.main;

import java.util.Arrays;

public class AddMatricesDemo {

    public static void main(String[] args) {

        int[][] array1 = {
                {3, 7, 9},
                {5, 12, 3}
        };

        int[][] array2 = {
                {2, 34, 12},
                {6, 3, 66}
        };

        int[][] sumArray = new int[2][3];

        for (int i=0; i<array1.length; i++){
            for (int j=0; j<array1[i].length; j++){
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(sumArray));

    }

}
