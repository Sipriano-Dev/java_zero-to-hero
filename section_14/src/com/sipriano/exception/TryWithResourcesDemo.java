package com.sipriano.exception;

import java.util.Scanner;

public class TryWithResourcesDemo {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num = scan.nextInt();
            System.out.println("You typed the number " + num);
        } catch (Exception e) {
            System.out.println("Provide a numerical and try again");

        }

    }

}
