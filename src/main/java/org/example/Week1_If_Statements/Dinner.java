package org.example.Week1_If_Statements;

import static input.InputUtils.stringInput;

public class Dinner {
    public static void main(String[] args) {
        String dinnerSuggestion = stringInput("What should we have for dinner?");
        //Computers only like pizza and tacos


        if (dinnerSuggestion.equalsIgnoreCase("pizza")) {
            System.out.println("Pizza sound good!");
        } else if (dinnerSuggestion.equalsIgnoreCase("tacos")) {
            System.out.println("Great! I like tacos");
        } else {
            System.out.println("How about pizza, or tacos?");
        }
    }
}
