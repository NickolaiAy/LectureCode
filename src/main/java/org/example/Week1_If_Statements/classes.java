package org.example.Week1_If_Statements;

import static input.InputUtils.positiveIntInput;
import static input.InputUtils.stringInput;

public class classes {
        public static void main(String[] args) {
            String name = stringInput("Please enter your name");
            System.out.println("Hello, " + name + "!"); // Prints a greeting
            int numberOfClasses = positiveIntInput("How many classes are you taking this semester?");
            System.out.println("You are taking " + numberOfClasses + " class(es)"); //tells user how many classes they are taking
            String units = "classes"; //
            if (numberOfClasses == 1) { //checks to see if user is taking a class
                units = "class";
            }
            System.out.println("You are taking " + numberOfClasses + " " + units + " this semester." );
        }
}
