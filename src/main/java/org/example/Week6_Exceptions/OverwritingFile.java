package org.example.Week6_Exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OverwritingFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufWriter = new BufferedWriter(writer);
        bufWriter.write("Hello \n");
        bufWriter.write("Data here \n");
        bufWriter.write("Goodbye \n");
        writer = new FileWriter("hello.txt");
        bufWriter = new BufferedWriter(writer);
        bufWriter.write("This data \n");
        bufWriter.write("overwrites the first set of data. \n");
        bufWriter.close();
    }
}
