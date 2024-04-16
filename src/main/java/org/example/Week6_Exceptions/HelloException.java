package org.example.Week6_Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HelloException {
    public static void main(String[] args) {
        String filename = "non_existent_file.txt";
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException ioe) {
           System.out.println("Could not open or read " + filename);
           System.out.println(ioe.toString());
        }
        System.out.println("If the code did not work, the program did not crash");
        System.out.println("The program keeps running so could perhaps ask the user " + "to create this file, or specify the file location");
    }
}
