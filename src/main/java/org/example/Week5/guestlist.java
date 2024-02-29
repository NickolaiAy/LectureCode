package org.example.Week5;

import java.util.ArrayList;
import java.util.Scanner;

public class guestlist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> guestList = new ArrayList<>();

        // Get and add guest names without duplicates
        guestList = getGuestNames(scanner);

        // Sort the list
        sortGuestList(guestList);

        // Print all names
        printGuestList(guestList, "Guest List:");

        // Delete names (optional)
        deleteGuests(scanner, guestList);

        // Print final list and total guests
        printGuestList(guestList, "\nFinal Guest List:");
        System.out.println("\nTotal guests: " + guestList.size());
    }

    // Method to get guest names and add them to the list
    public static ArrayList<String> getGuestNames(Scanner scanner) {
        ArrayList<String> guests = new ArrayList<>();
        while (true) {
            System.out.print("Enter a guest name (press Enter to finish): ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            if (!guests.contains(name)) {
                guests.add(name);
                System.out.println("Guest added: " + name);
            } else {
                System.out.println("Error: Duplicate name. Please enter a unique name.");
            }
        }
        return guests;
    }

    // Method to sort the list
    public static void sortGuestList(ArrayList<String> guestList) {
        guestList.sort(null);
    }

    // Method to print the list with a title
    public static void printGuestList(ArrayList<String> guestList, String title) {
        System.out.println(title);
        for (String guest : guestList) {
            System.out.println(guest);
        }
    }

    // Method to delete guests (optional)
    public static void deleteGuests(Scanner scanner, ArrayList<String> guestList) {
        while (true) {
            System.out.print("\nDo you want to delete any names? (y/n): ");
            String choice = scanner.nextLine().toLowerCase();

            if (choice.equals("n")) {
                break;
            }

            System.out.print("Enter the name to delete: ");
            String deleteName = scanner.nextLine();

            if (guestList.remove(deleteName)) {
                System.out.println("Guest removed: " + deleteName);
            } else {
                System.out.println("Error: Guest not found.");
            }
        }
    }
}
