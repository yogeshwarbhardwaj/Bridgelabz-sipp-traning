import java.util.Scanner;

public class Problem11A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for variables a, b, and c
        System.out.println("Enter value for a:");
        int a = scanner.nextInt();

        System.out.println("Enter value for b:");
        int b = scanner.nextInt();

        System.out.println("Enter value for c:");
        int c = scanner.nextInt();

        // Performing the specified integer operations
        int result1 = a + b * c;      // a + (b * c) due to operator precedence (multiplication before addition)
        int result2 = a * b + c;      // (a * b) + c
        int result3 = c + a / b;      // (a / b) first, then add c
        int result4 = a % b + c;      // (a % b) first, then add c

        // Printing the results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        
        // Closing the scanner object
        scanner.close();
    }
}