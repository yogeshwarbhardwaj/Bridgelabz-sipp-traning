import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    static String userInputString;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input for the string
        System.out.print("Enter a string: ");
        userInputString = scanner.nextLine();

        // Step 2: Call method to generate the exception
        System.out.println("\nAttempting to generate StringIndexOutOfBoundsException...");
        generateException();

        // Step 3: Call method to handle the exception
        System.out.println("\nHandling StringIndexOutOfBoundsException with try-catch...");
        handleException();

        scanner.close();
    }

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException() {
        // Accessing an index beyond the length of the string intentionally
        int indexBeyond = userInputString.length() + 5; // invalid index
        System.out.println("Accessing character at index " + indexBeyond);
        char ch = userInputString.charAt(indexBeyond); // This will throw exception
        System.out.println("Character at index " + indexBeyond + ": " + ch);
    }

    // Method to handle the exception gracefully
    public static void handleException() {
        try {
            int indexBeyond = userInputString.length() + 5; // invalid index
            System.out.println("Trying to access index " + indexBeyond);
            char ch = userInputString.charAt(indexBeyond);
            System.out.println("Character at index " + indexBeyond + ": " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
            System.out.println("Attempted to access an invalid index of the string.");
        }
    }
}