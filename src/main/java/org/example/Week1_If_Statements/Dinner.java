package org.example.Week1_If_Statements;

import static input.InputUtils.stringInput;

public class Dinner {
    public static void main(String[] args) {
        String dinnerSuggestion = stringInput("What should we have for dinner?");


        if (dinnerSuggestion.equalsIgnoreCase("pizza")) { //if pizza is picked statement run
            System.out.println("Pizza sound good!");
        } else if (dinnerSuggestion.equalsIgnoreCase("tacos")) { //if tacos is picked statement run
            System.out.println("Great! I like tacos");
        } else {
            System.out.println("How about pizza, or tacos?");
        }
    }
}
