import java.util.Scanner;

public class CharArrayComparison {

    // Method to get characters from a string without using toCharArray()
    public static char[] getCharsManually(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter the text:");
        String inputText = scanner.next();

        // Obtain character array manually
        char[] manualChars = getCharsManually(inputText);

        // Obtain character array using built-in method
        char[] builtInChars = inputText.toCharArray();

        // Compare both arrays
        boolean areEqual = compareCharArrays(manualChars, builtInChars);

        // Display the results
        System.out.println("Characters from manual method: " + new String(manualChars));
        System.out.println("Characters from toCharArray(): " + new String(builtInChars));
        System.out.println("Are both character arrays equal? " + areEqual);

        scanner.close();
    }
}