package org.example.Week1;

public class pvsm {
    public static void main(String[] args) {
        String productName = "Packet of spaghetti";
        double price = 1.49;
        int quantity = 2;

        double totalPrice = price * quantity;

        System.out.println(quantity + " " + productName + " " + "at $ " + price + " each costs a total of $ " + totalPrice);
    }
}
