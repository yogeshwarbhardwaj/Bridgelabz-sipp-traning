import java.util.Scanner;

public class ChoclateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of chocolates from the user
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        // Get the number of children from the user
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Call the method to find chocolates per child and remaining chocolates
        int[] results = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display the results
        System.out.println("Each child will get: " + results[0] + " chocolates");
        System.out.println("Remaining chocolates: " + results[1]);
    }

    // Method to find each child's share and remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;      // Number of chocolates per child
        result[1] = number % divisor;      // Remaining chocolates
        return result;
    }
}