package org.example.Week6_Exceptions;

import static input.InputUtils.stringInput;

public class exceptions {
    public static void main(String[] args) {
        String userNumberString = stringInput("Enter an integer number");
        try {
            int userNumber = Integer.parseInt(userNumberString);
            System.out.println("You entered a valid integer. Your data is " + userNumber);
        } catch (NumberFormatException e) {
            System.out.println("Error -" + userNumberString + " can't be turned into an integer");
        }
    }
}
