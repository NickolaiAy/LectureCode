package org.example.Week6_Exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesWriter {
    public static void main(String[] args) {
        String filename = "myfile.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename))) {
            bufferedWriter.write("Some example data\n");
            bufferedWriter.write("Some more example data\n");
        } catch (IOException ioe){
            System.out.println("Could not open or write to " + filename);
            System.out.println(ioe.toString());
            System.out.println("This code automatically closed the BufferedWriter and FileWriter" + " in the event of an IOException");
            System.out.println("Can do more error handling here, if needed");
        }
    }
}
