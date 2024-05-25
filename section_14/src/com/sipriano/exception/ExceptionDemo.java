package com.sipriano.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {

        Scanner scan = null;

        try {
            scan = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scan.nextInt();
            System.out.println("You typed the number " + num);
        } catch (Exception e) {
            System.out.println("Provide a numerical and try again");

        }

        finally {
            System.out.println("finally block is being executed");
            if(scan != null) {
                scan.close();
            }
        }

    }

}
