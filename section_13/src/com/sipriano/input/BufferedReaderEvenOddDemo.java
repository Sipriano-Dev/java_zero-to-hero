package com.sipriano.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEvenOddDemo {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.println("Please enter a numeric value...");
        String input = bf.readLine();

        int num = Integer.parseInt(input);

        if (num % 2 == 0) {
            System.out.println("The num " + num + " is even");
        } else {
            System.out.println("The num " + num + " is odd");
        }

        bf.close();

    }

}
