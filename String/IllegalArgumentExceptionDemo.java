import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException by calling substring() with invalid indices
    public static void generateException(String str, int start, int end) {
        // This will throw StringIndexOutOfBoundsException internally, which is a subclass of RuntimeException
        // Note: Java's substring() throws StringIndexOutOfBoundsException, which extends IndexOutOfBoundsException
        System.out.println("Attempting to create a substring with start > end...");
        String sub = str.substring(start, end);
        System.out.println("Substring: " + sub); // This line won't execute if exception occurs
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();

        // Take start and end indices
        System.out.println("Enter the start index:");
        int startIndex = scanner.nextInt();

        System.out.println("Enter the end index:");
        int endIndex = scanner.nextInt();

        try {
            // Call the method to generate exception
            generateException(userInput, startIndex, endIndex);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e);
        }

        scanner.close();
    }
}