package com.sipriano.input;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderWithBFR {

    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("D:\\_workspace\\files\\story.txt");
        BufferedReader reader = new BufferedReader(file);

        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close(); //Always close connection

    }

}
