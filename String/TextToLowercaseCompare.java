import java.util.Scanner;

public class TextToLowercaseCompare {

    // Method to convert string to lowercase without using toLowerCase()
    public static String convertToLowercase(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if character is uppercase alphabet
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32 to ASCII value
                ch = (char) (ch + 32);
            }
            result.append(ch);
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
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

        // Convert to lowercase using built-in method
        String lowerCaseText = userInput.toLowerCase();

        // Convert to lowercase manually using custom method
        String manualLowerCase = convertToLowercase(userInput);

        // Compare the two strings
        boolean areEqual = compareStrings(lowerCaseText, manualLowerCase);

        // Display the results
        System.out.println("Lowercase (built-in): " + lowerCaseText);
        System.out.println("Lowercase (manual): " + manualLowerCase);
        System.out.println("Are both lowercase texts equal? " + areEqual);
        
        scanner.close();
    }
}