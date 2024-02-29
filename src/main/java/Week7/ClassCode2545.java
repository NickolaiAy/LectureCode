package Week7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ClassCode2545 {

    public static void main(String[] args) {
        // File name to store the to-do list
        String filename = "to_do_list.txt";

        // List to hold to-do items
        List<String> todo = new ArrayList<>();
        todo.add("Water plants");
        todo.add("Pay electricity bill");
        todo.add("Grocery shopping");

        // Writer object to write to the file
        BufferedWriter writer = null;

        // Try to create a new file writer and buffered writer
        try {
            writer = new BufferedWriter(new FileWriter(filename));
        } catch (IOException e) {
            System.err.println("Error creating file writer: " + e.getMessage());  // Print error message
            return;  // Exit the program if file creation fails
        }

        // Variable to keep track of the list item number
        int listNumber = 1;

        // Write each to-do item to the file with its number
        for (String item : todo) {
            try {
                writer.write("To do item " + listNumber + " is " + item + "\n");
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
                return;  // Exit the program if writing fails
            }
            listNumber++;
        }

        // Try to close the writer properly
        try {
            writer.close();
        } catch (IOException e) {
            System.err.println("Error closing writer: " + e.getMessage());
        }

        System.out.println("Created sample to-do list and wrote to " + filename);

        // Reader object to read from the file
        BufferedReader reader = null;  // Changed to BufferedReader for reading lines

        // Try to create a new file reader and buffered reader
        try {
            reader = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            System.err.println("Error opening file: " + e.getMessage());
            return;  // Exit the program if file opening fails
        }

        // List to store the read to-do items
        List<String> numberedTodoList = new ArrayList<>();

        // Read lines from the file and add them to the list
        String line;
        while (true) {
            try {
                if (!((line = reader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }  // Using line = to assign and check in one step
            numberedTodoList.add(line);
        }

        // Print the to-do list header
        System.out.println("Here is your to do list, read from the file:");

        // Print each item in the list on a new line
        for (String item : numberedTodoList) {
            System.out.println(item);
        }

        // Try to close the reader properly
        try {
            reader.close();
        } catch (IOException e) {
            System.err.println("Error closing reader: " + e.getMessage());
        }
    }
}
