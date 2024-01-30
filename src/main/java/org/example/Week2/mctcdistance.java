package org.example.Week2;
import java.util.Scanner;
public class mctcdistance {
/* Resources
* https://www.w3schools.com/java/java_methods.asp
* https://www.geeksforgeeks.org/java-do-while-loop-with-examples/
*https://www.baeldung.com/java-using-not-in-if-conditions
* */
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance in miles you live from MCTC: ");
        double distanceMiles = scanner.nextDouble();
        if (distanceMiles > 10) {
            System.out.println("You live more than 10 miles from MCTC");
        } else if (distanceMiles == 10) {
            System.out.println("You live exactly 10 miles from MCTC");
        } else {
            System.out.println("You live less than 10 miles from MCTC");
        }
        double distanceKilometers = distanceMiles * 1.6;
        System.out.printf("Your distance in kilometers: %.2f km\n",distanceKilometers);
    }
     static double positiveDoubleInput(Scanner scanner, String prompt) {
         double distance;
         do {
             System.out.println(prompt);
             while (!scanner.hasNextDouble()) {
                 System.out.println("Invalid input please try again");
                 scanner.next();
             }
             distance = scanner.nextDouble();
             if (distance < 0) {
                 System.out.println("Enter a positive whole number.");
             }

         } while (distance < 0) ;
         return distance;
    }

}
