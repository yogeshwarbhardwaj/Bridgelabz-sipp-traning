import java.util.Scanner;

public class ArrayIndexOutOfBounds {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Access an index larger than the array length
        System.out.println("Trying to access an invalid index...");
        System.out.println("Name at invalid index: " + names[names.length + 1]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            // Access an invalid index to trigger exception
            System.out.println("Accessing invalid index inside try-catch...");
            System.out.println("Name at invalid index: " + names[names.length + 2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other unexpected runtime exceptions
            System.out.println("Caught Runtime Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        String[] names = new String[size];

        // Read names from user
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.next();
        }

        // Call method to generate exception
        generateException(names);

        // Call method to handle exception properly
        handleException(names);

        scanner.close();
    }
}