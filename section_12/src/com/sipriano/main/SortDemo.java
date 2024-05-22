package com.sipriano.main;

import java.util.Arrays;
import java.util.Random;

public class SortDemo {

    public static void main(String[] args) {

        int[] smallArray = {5, 2, 8, 1};
        Arrays.sort(smallArray);
        System.out.println(Arrays.toString(smallArray));

        int[] largeArray = new int[1000];
        Random random = new Random();

        for (int i=0; i<largeArray.length; i++) {
            largeArray[i] = random.nextInt(100000);
        }

        Arrays.parallelSort(largeArray);

        System.out.println(Arrays.toString(largeArray));

    }

}
