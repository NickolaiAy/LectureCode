package org.example.Week6_Exceptions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class todoList {
    public static void main(String[] args) throws IOException {
        String filename = "to_do_list.txt";
        List<String> todo = new ArrayList<>();
        todo.add("Water plants");
        todo.add("Pay electricity bill");
        todo.add("Grocery shopping");

        // Writing to a file
        BufferedWriter bufWriter = new BufferedWriter(new FileWriter(filename));
        int listNumber = 1;
        for (String item : todo) {
            bufWriter.write("To do item " + listNumber + " is: " + item + "\n");
            listNumber++;
        }
        bufWriter.close();
        System.out.println("Created sample to-do list and wrote to " + filename);

        // Reading from a file
        BufferedReader bReader = new BufferedReader(new FileReader(filename));
        List<String> numberedTodoList = new ArrayList<>();
        String line = bReader.readLine(); // corrected here
        while (line != null) {
            numberedTodoList.add(line);
            line = bReader.readLine();
        }
        bReader.close(); // Always good practice to close streams

        System.out.println("Here is your to do list, read from the file");
        System.out.println(numberedTodoList);
    }
}