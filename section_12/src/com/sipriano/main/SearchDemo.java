package com.sipriano.main;

import java.util.Arrays;

public class SearchDemo {

    public static void main(String[] args) {

        int[] num = {42, 63, 2, 9, 10};
        Arrays.sort(num);
        int index = Arrays.binarySearch(num, 2);
        System.out.println(index);

    }

}
