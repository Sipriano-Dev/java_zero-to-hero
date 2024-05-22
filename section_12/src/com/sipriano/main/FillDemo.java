package com.sipriano.main;

import java.util.Arrays;

public class FillDemo {

    public static void main(String[] args) {

        int[] nums = new int[10];
        Arrays.fill(nums, 12);
        System.out.println(Arrays.toString(nums));

        int[] nums2 = new int[5];
        Arrays.setAll(nums2, i -> i+1);
        System.out.println(Arrays.toString(nums2));

    }

}
