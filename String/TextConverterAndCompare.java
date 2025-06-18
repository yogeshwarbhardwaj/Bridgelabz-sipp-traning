import java.util.Scanner;

public class TextConverterAndCompare {

    // Method to convert a string to uppercase without using built-in toUpperCase()
    public static String convertToUppercase(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if character is lowercase alphabet
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32 from ASCII value
                ch = (char) (ch - 32);
            }
            result.append(ch);
        }

        return result.toString();
    }

    // Method to compare two strings character by character using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the complete text:");
        String userInput = scanner.nextLine();

        // Convert to uppercase using built-in method
        String upperCaseText = userInput.toUpperCase();

        // Convert to uppercase manually using custom method
        String manualUpperCase = convertToUppercase(userInput);

        // Compare the two strings
        boolean isEqual = compareStrings(upperCaseText, manualUpperCase);

        // Display the results
        System.out.println("Uppercase (built-in): " + upperCaseText);
        System.out.println("Uppercase (manual): " + manualUpperCase);
        System.out.println("Are both uppercase texts equal? " + isEqual);
        
        scanner.close();
    }
}