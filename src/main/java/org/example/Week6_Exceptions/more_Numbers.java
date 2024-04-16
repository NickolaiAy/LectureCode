package org.example.Week6_Exceptions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class more_Numbers {
    public static void main(String[] args) throws IOException {

    FileWriter writer = new FileWriter("more_numbers.txt");
    BufferedWriter bufferedWriter = new BufferedWriter(writer);
    int data1 = 67;
    int data2 = 65;
    int data3 = 84;
    bufferedWriter.write(data1 + "\n");
    bufferedWriter.write(Integer.toString(data2) + "\n");
    bufferedWriter.write(Integer.toString(data3));
    bufferedWriter.newLine();
    double dblData1 = 234.56;
    double dblData2 = 999.99;
    bufferedWriter.write(dblData1 + "\n");
    bufferedWriter.write(Double.toString(dblData2) + "\n");
    bufferedWriter.close();
}
}