import java.util.Scanner;
import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take the input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Initialize variables for storing factors
        int maxFactor = 10; // Initial size of the factors array
        int[] factors = new int[maxFactor]; // Array to store factors
        int index = 0; // To keep track of the current position in the array

        // Step 3: Find factors by looping through 1 to the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if i is a factor
                // If array is full, resize it
                if (index == maxFactor) {
                    // Step 4: Resize the array when is full
                    maxFactor = 2 * maxFactor; // Double the size
                    int[] temp = new int[maxFactor]; // Create a temp array
                    // Copy existing factors to temp
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; // Assign temp array back to factors
                }
                // Store the factor in the array and increment index
                factors[index] = i;
                index++;
            }
        }

        // Step 5: Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}