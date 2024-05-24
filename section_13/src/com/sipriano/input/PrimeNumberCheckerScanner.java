package com.sipriano.input;

import java.util.Scanner;

public class PrimeNumberCheckerScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to evaluate if it's a prime number: ");
        int num = sc.nextInt();

        System.out.println(isPrime(num));

        sc.close();

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
