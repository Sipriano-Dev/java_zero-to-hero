package com.sipriano.exception;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        System.out.println("You typed the number " + num);

        scan.close();

    }

}
