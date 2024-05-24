package com.sipriano.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberChecker {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.println("Please enter a numeric value to identify is it is a prime number...");
        String input = bf.readLine();
        int num = Integer.parseInt(input);

        System.out.println(isPrime(num));

        bf.close();

    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i=2; i <= Math.sqrt(num); i++) { //Test only until half of the number, more is note necessary
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }


}
