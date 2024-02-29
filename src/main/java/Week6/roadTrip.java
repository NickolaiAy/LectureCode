package Week6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner; // Import Scanner for user input

class RoadTrip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create scanner object

        // Create a Map to store city names and distances
        Map<String, Integer> distanceFromMinneapolis = new HashMap<>();

        // Add city names and distances manually (can be replaced with data retrieval)
        distanceFromMinneapolis.put("Duluth", 154);
        distanceFromMinneapolis.put("St Cloud", 65);
        distanceFromMinneapolis.put("Anoka", 26);
        distanceFromMinneapolis.put("St Paul", 14);
        distanceFromMinneapolis.put("International Falls", 296);
        distanceFromMinneapolis.put("Rochester", 86);
        distanceFromMinneapolis.put("Shakopee", 25);

        // Get user input for maximum driving distance
        int maxDrivingDistance = positiveIntInput(scanner, "Enter the maximum driving distance (positive integer): ");

        // Create an empty list to store cities within range
        List<String> citiesInRange = new ArrayList<>();

        // Loop through each city and distance in the map
        for (Map.Entry<String, Integer> cityData : distanceFromMinneapolis.entrySet()) {
            String city = cityData.getKey();
            int drivingDistance = cityData.getValue();

            // Check if the distance is within the user's range
            if (drivingDistance <= maxDrivingDistance) {
                citiesInRange.add(city);
            }
        }

        // Check if any cities were found within the range
        if (citiesInRange.isEmpty()) {
            System.out.println("Sorry, there are no Minnesota cities within your designated driving range.");
        } else {
            System.out.println("Here are some cities you can visit within your selected range:");
            for (String city : citiesInRange) {
                System.out.println(city);
            }
        }
    }

    // Function to get positive integer input from the user
    public static int positiveIntInput(Scanner scanner, String message) {
        int input;
        do {
            System.out.print(message);
            while (!scanner.hasNextInt()) { // Check for valid integer input
                System.out.println("Invalid input. Please enter a positive integer: ");
                scanner.nextLine(); // Clear invalid input from buffer
            }
            input = scanner.nextInt();
            if (input <= 0) {
                System.out.println("Invalid input. Please enter a positive integer: ");
            }
        } while (input <= 0); // Repeat until a positive integer is entered

        return input;
    }
}
