package org.example.Week1_If_Statements;

import static input.InputUtils.*;

public class price {
    public static void main (String[] args) {
        String productName = stringInput("What is the name of the product");
        double price = doubleInput("What does " + productName + " cost?");
        int quantity = intInput("How many " + productName + "to sell?");
        double totalPrice = price * quantity;
        System.out.println(quantity + " of " + productName + " at $ " + price + " each costs $" + totalPrice);
    }
}

