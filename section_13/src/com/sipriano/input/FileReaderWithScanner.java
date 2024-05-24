package com.sipriano.input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWithScanner {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("D:\\_workspace\\files\\story.txt"));

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close(); //Always close connection

    }

}
