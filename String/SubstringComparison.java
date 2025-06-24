import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring manually using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder sub = new StringBuilder();

        // Loop from start to end index - 1 and append characters
        for (int i = start; i < end; i++) {
            if (i >= 0 && i < str.length()) {
                sub.append(str.charAt(i));
            } else {
                // Handle invalid indices
                System.out.println("Invalid indices. Please enter valid start and end indices.");
                return "";
            }
        }
        return sub.toString();
    }

    // Method to compare two strings character by character
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

        // Take user input for the string
        System.out.println("Enter the text:");
        String text = scanner.next();

        // Take start and end indices
        System.out.println("Enter the start index:");
        int startIndex = scanner.nextInt();
        System.out.println("Enter the end index:");
        int endIndex = scanner.nextInt();

        // Create substring manually
        String manualSubstring = createSubstring(text, startIndex, endIndex);

        // Create substring using built-in method
        String builtInSubstring = "";
        try {
            builtInSubstring = text.substring(startIndex, endIndex);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid indices for substring operation.");
        }

        // Compare both substrings
        boolean areEqual = compareStrings(manualSubstring, builtInSubstring);

        // Display results
        System.out.println("Substring using createSubstring(): " + manualSubstring);
        System.out.println("Substring using built-in substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + areEqual);

        scanner.close();
    }
}