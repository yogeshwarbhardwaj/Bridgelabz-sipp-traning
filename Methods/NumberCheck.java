import java.util.Scanner; // Import Scanner class for user input

public class NumberCheck {
    // Method to check if the number is positive, negative, or zero
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1; // Number is positive
        } else if (num < 0) {
            return -1; // Number is negative
        } else {
            return 0; // Number is zero
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        System.out.println("Enter an integer: "); // Prompt user for input
        int number = scanner.nextInt(); // Read the input number

        // Call checkNumber method and store the result
        int result = checkNumber(number);

        // Display the result based on the returned value
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close(); // Close the scanner
    }
}