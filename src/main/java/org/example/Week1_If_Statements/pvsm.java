package org.example.Week1_If_Statements;

public class pvsm {
    public static void main(String[] args) {
        // Declare and initialize a String variable to store the name of the product
        String productName = "Packet of spaghetti";
// Declare and initialize a double variable to store the price of a single product
        double price = 1.49;
// Declare and initialize an integer variable to store the quantity of the product being purchased
        int quantity = 2;

// Calculate the total price by multiplying the price of a single product by its quantity
        double totalPrice = price * quantity;

// Print a statement detailing the quantity and name of the product, the price per item, and the total cost
// Note: The output statement is carefully constructed to provide a clear and formatted summary of the purchase.
        System.out.println(quantity + " " + productName + " at $ " + price + " each costs a total of $ " + totalPrice);
    }
}
