package org.example.Week1_If_Statements;

import static input.InputUtils.stringInput;

public class PasswordCheck {
    public static void main(String[] args) {
        String userPassword = stringInput("Enter the password");
        if ( userPassword.equals("qwerty")) {
            System.out.println("Welcome, authorized user");
        } else {
            System.out.println("Access denied!");
        }
    }
}
