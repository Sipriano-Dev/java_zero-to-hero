package com.sipriano.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scan.nextInt();
            System.out.println("You typed the number " + num);
            scan.close();
        } catch (InputMismatchException e) {
            System.out.println("Provide a numerical and try again");
            e.
        }

    }

}
