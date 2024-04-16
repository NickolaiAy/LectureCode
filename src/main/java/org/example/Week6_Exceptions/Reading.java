package org.example.Week6_Exceptions;

import java.io.*;

public class Reading {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("hello.txt");
        BufferedReader bufReader;
        BufferedReader BufferedReader = bufReader = new BufferedReader(reader);
        String line = bufReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufReader.readLine();
        }
        bufReader.close();
    }
}
