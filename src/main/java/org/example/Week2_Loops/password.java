package org.example.Week2_Loops;

import static input.InputUtils.stringInput;

public class password {
    public static void main(String[] args) {
        String secretPassword = "kittens";
        System.out.println();
        String userPassword = stringInput("Enter the password");
        while (! userPassword.equals(secretPassword)) {
            System.out.println("Password incorrect, acess denied!");
            System.out.println("Try again");
            userPassword = stringInput("Enter the password");
        }
      System.out.println("Correct password - access granted");
    }
}
