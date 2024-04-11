package org.example.Week6_Exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class variables {
    public static void main(String[] args) throws Exception{
        FileWriter writer = new FileWriter("variables.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        int intData = 42;
        double dblData = 987.654;
        String strData = "Java";
        bufferedWriter.write(intData + "\n");
        bufferedWriter.write(dblData + "\n");
        bufferedWriter.write(strData + "\n");
        bufferedWriter.close();
    }
}
