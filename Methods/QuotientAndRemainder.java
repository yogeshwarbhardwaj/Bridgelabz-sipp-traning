import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor; // Calculate quotient
        int remainder = number % divisor; // Calculate remainder
        return new int[] {quotient, remainder}; // Return as array
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        // Input first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Input second number (divisor)
        System.out.print("Enter the second number (divisor): ");
        int number2 = scanner.nextInt();

        // Call method to find quotient and remainder
        int[] result = findRemainderAndQuotient(number1, number2);

        // Output the results
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        scanner.close(); // Close scanner
    }
}