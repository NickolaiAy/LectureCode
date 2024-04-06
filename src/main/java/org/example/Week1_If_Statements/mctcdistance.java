package org.example.Week1_If_Statements;
import java.util.Scanner;
public class mctcdistance {
/* Resources
* https://www.w3schools.com/java/java_methods.asp
* https://www.geeksforgeeks.org/java-do-while-loop-with-examples/
*https://www.baeldung.com/java-using-not-in-if-conditions
* */
public static void main(String[] args) {
    // Create a Scanner object to read input
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter the distance from MCTC in miles
    System.out.println("Enter the distance in miles you live from MCTC: ");
    // Read the entered distance as a double value
    double distanceMiles = scanner.nextDouble();

    // Check if the distance is greater than 10 miles
    if (distanceMiles > 10) {
        System.out.println("You live more than 10 miles from MCTC");
    }
    // Check if the distance is exactly 10 miles
    else if (distanceMiles == 10) {
        System.out.println("You live exactly 10 miles from MCTC");
    }
    // If the distance is neither greater than nor exactly 10 miles, it must be less
    else {
        System.out.println("You live less than 10 miles from MCTC");
    }

    // Convert the distance from miles to kilometers using the conversion factor
    double distanceKilometers = distanceMiles * 1.6;
    // Print the converted distance, formatted to two decimal places
    System.out.printf("Your distance in kilometers: %.2f km\n", distanceKilometers);
}

    // Method to ensure the user inputs a positive double value
    static double positiveDoubleInput(Scanner scanner, String prompt) {
        double distance;
        do {
            // Display the prompt to the user
            System.out.println(prompt);
            // Loop until a valid double is entered
            while (!scanner.hasNextDouble()) {
                // Inform the user of invalid input and prompt again
                System.out.println("Invalid input please try again");
                scanner.next(); // Move scanner past the invalid input
            }
            // Read the double value entered by the user
            distance = scanner.nextDouble();
            // Check if the entered value is negative
            if (distance < 0) {
                // Prompt the user to enter a positive value
                System.out.println("Enter a positive whole number.");
            }
            // Repeat the loop if the value is negative
        } while (distance < 0);
        // Return the positive double value
        return distance;
    }
}