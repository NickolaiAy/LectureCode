package org.example.Week1_If_Statements;

import static input.InputUtils.stringInput;

public class comparingStrings {
    public static void main(String[] args) {
        System.out.println("Quiz time! Finish the quote.");
        System.out.println("Java is to JavaScript as Car is too...?");

        String answer = stringInput();

        if (answer.equalsIgnoreCase("carpet")) {
            System.out.println("carpet");
        } else {
            System.out.println("Sorry, the answer is 'Carpet'.");
        }
    }
}
