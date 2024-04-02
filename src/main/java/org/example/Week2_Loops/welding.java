package org.example.Week2_Loops;

import java.util.Scanner;

public class welding {
    // Main method - the entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object to read input from the standard input stream (console)
        Scanner scanner = new Scanner(System.in);

        // Prompt the user and get a boolean response for wearing cotton clothes
        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?", scanner);
        // Prompt the user and get a boolean response for wearing wool clothes
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?", scanner);
        // Prompt the user and get a boolean response for wearing closed toe shoes
        boolean closedToeShoes = yesNoInput("Are you wearing closed toe shoes?", scanner);

        // Check if the user is wearing cotton or wool clothes and closed toe shoes
        if (cottonClothes || woolClothes && closedToeShoes) {
            // If the condition is true, print a message indicating safe dressing for welding
            System.out.println("You are dressed safely for welding.");
        } else {
            // If the condition is false, print a message indicating the safety requirements
            System.out.println("You must wear wool or cotton clothes, and closed toe shoes.");
        }
    }

    // Define a private static method to prompt the user and return a boolean based on their response
    private static boolean yesNoInput(String prompt, Scanner scanner) {
        // Display the prompt to the user, asking for a yes or no response
        System.out.println(prompt + " (yes/no)");
        // Read the user's input, trim whitespace, and convert to lowercase
        String input = scanner.nextLine().trim().toLowerCase();
        // Return true if the user's response is "yes", otherwise false
        return input.equals("yes");
    }
}