package org.example.Week1_If_Statements;

import static input.InputUtils.*;

public class InputUtils {
    public static void main(String[] args) {
        String name = stringInput("What is your name?");
        int candyBars = intInput("How many candy bars?");
        // As above, but checks number is positive
        int people = positiveIntInput("How many people?");
        double price = doubleInput("What is the price of the item?");
        // As above but checks number is positive
        double length = positiveDoubleInput("How long is the string?");
// User can type "y" or "n" or "yes" or "no" or any of these in uppercase
        boolean ok = yesNoInput("OK to continue?");
//The question is optional, so you can also write code like this,
        System.out.println("What is your name?");
        String data = stringInput();
    }
}


