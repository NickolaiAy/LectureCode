package org.example.Week6_Exceptions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class numbers {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("numbers.txt");
        BufferedWriter bufWriter = new BufferedWriter(writer);
        int data1 = 67;
        int data2 = 65;
        int data3 = 84;
        bufWriter.write(data1);
        bufWriter.write(data2);
        bufWriter.write(data3);
        bufWriter.close();
    }
}
