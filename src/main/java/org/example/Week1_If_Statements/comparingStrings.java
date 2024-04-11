package org.example.Week1_If_Statements;
import static input.InputUtils.stringInput; // Import for getting user input
public class comparingStrings {
    public static void main(String[] args) {
        // Print a fun message to start the quiz
        System.out.println("Quiz time! Finish the quote:");
        System.out.println("Java is to JavaScript as Car is to...?");

        // Get the user's answer as a string
        String answer = stringInput();

        // Check if the answer is "carpet"
        if (answer.equalsIgnoreCase("carpet")) {
            // Print "carpet" if the answer is correct
            System.out.println("carpet");
        } else {
            // Print a sorry message if the answer is wrong
            System.out.println("Sorry, the answer is 'Carpet'.");
        }
    }
}
