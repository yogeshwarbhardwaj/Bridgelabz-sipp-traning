import java.util.Scanner;

public class StringComparison {
    
    // Method to compare two strings character by character using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false; // Different lengths means strings are not equal
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false; // Mismatch found
            }
        }
        return true; // All characters match
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for two strings
        System.out.println("Enter first string:");
        String str1 = scanner.next();
        System.out.println("Enter second string:");
        String str2 = scanner.next();

        // Compare using custom method
        boolean resultCharAt = compareUsingCharAt(str1, str2);

        // Compare using built-in equals() method
        boolean resultEquals = str1.equals(str2);

        // Display the results
        System.out.println("Comparison using charAt(): " + resultCharAt);
        System.out.println("Comparison using equals(): " + resultEquals);
        
        // Optional: Check if both results are the same
        if (resultCharAt == resultEquals) {
            System.out.println("Both methods agree on the comparison result.");
        } else {
            System.out.println("Methods disagree on the comparison result.");
        }

        scanner.close();
    }
}