import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not a valid number
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle RuntimeException (including NumberFormatException)
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Please enter a valid integer.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First, call the method to generate the exception
        System.out.println("Enter a string to generate NumberFormatException:");
        String userInput = scanner.nextLine();
        try {
            generateException(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in generateException: " + e.getMessage());
        }

        // Then, call the method to handle the exception
        System.out.println("Enter a string to handle with try-catch (NumberFormatException):");
        String userInput2 = scanner.nextLine();
        handleException(userInput2);

        scanner.close();
    }
}