import java.util.Scanner;

public class SmallestAndLargestFinder {

    // Method to find smallest and largest numbers among three
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        // Check for smallest
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        // Check for largest
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        return new int[] {smallest, largest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Input three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Find smallest and largest
        int[] results = findSmallestAndLargest(num1, num2, num3);

        // Display results
        System.out.println("Smallest number: " + results[0]);
        System.out.println("Largest number: " + results[1]);

        scanner.close(); // Close scanner
    }
}