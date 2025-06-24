import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Conversion factors
        double feetPerYard = 3.0;
        double yardsPerMile = 1760.0;

        // Calculate the distance in yards
        double distanceInYards = distanceInFeet / feetPerYard;

        // Calculate the distance in miles
        double distanceInMiles = distanceInYards / yardsPerMile;

        // Display the results with descriptive message
        System.out.println("The distance in yards is " + distanceInYards +
                " while the distance in miles is " + distanceInMiles);
        
        // Close the scanner object
        scanner.close();
    }
}