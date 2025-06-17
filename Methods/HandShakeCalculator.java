import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum handshakes using combination formula
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        // Get number of students from user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Calculate maximum handshakes
        int maxHandshakes = calculateHandshakes(numberOfStudents);

        // Display the result
        System.out.println("The maximum number of possible handshakes is: " + maxHandshakes);

        scanner.close(); // Close scanner
    }
}