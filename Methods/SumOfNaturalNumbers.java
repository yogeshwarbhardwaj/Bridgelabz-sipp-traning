import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of first n natural numbers using a loop
    public static int findSum(int n) {
        int sum = 0; // Initialize sum to zero

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i; // Add current number to sum
        }

        return sum; // Return the final sum
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for user input

        System.out.print("Enter the number of natural numbers to sum: ");
        int n = scanner.nextInt(); // Read integer input from user

        // Call the method to find the sum
        int result = findSum(n);

        // Display the result
        System.out.println("Sum of first " + n + " natural numbers is: " + result);

        scanner.close(); // Close scanner to free resources
    }
}