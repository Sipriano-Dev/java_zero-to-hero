package com.sipriano.generics;

public class GenericMethodDemo {

    public static void main(String[] args) {

        String[] stringArray = {"Hello", "World"};
        Integer[] intArray = {1, 2, 3};
        printArray(intArray);

    }

    public static <T> void printArray(T[] array) {

        for (T e : array) {
            System.out.println(e);
        }

    }

}
