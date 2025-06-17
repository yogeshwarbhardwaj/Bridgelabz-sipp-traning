import java.util.Scanner;

public class TriangularParkRun {

       public static double calculateRounds(double side1, double side2, double side3) {
        // Check for valid triangle sides (sum of any two sides must be greater than the third)
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 ||
            (side1 + side2 <= side3) ||
            (side1 + side3 <= side2) ||
            (side2 + side3 <= side1)) {
            System.out.println("Error: The provided sides do not form a valid triangle. Please ensure all sides are positive and satisfy the triangle inequality theorem.");
            return -1; // Indicate an error
        }

        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3; // Perimeter in meters

        // Total distance to be covered in kilometers
        double totalDistanceKm = 5.0;

        // Convert total distance to meters
        double totalDistanceMeters = totalDistanceKm * 1000; // 5 km = 5000 meters

        // Calculate the number of rounds
        // Using Math.ceil to ensure the athlete completes the full 5km, even if it means a partial last round
        double numberOfRounds = totalDistanceMeters / perimeter;

        return numberOfRounds;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of side 1 of the triangular park (in meters):");
        double s1 = scanner.nextDouble();

        System.out.println("Enter the length of side 2 of the triangular park (in meters):");
        double s2 = scanner.nextDouble();

        System.out.println("Enter the length of side 3 of the triangular park (in meters):");
        double s3 = scanner.nextDouble();

        double rounds = calculateRounds(s1, s2, s3);

        if (rounds != -1) {
            System.out.printf("The athlete needs to complete %.2f rounds to cover 5 km.%n", rounds);
        }

        scanner.close();
    }
}