//Import Scanner class for reading user input
import java.util.Scanner; 
public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input

        // Prompt the user to enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");

        // Read the perimeter value from the user
        double perimeter = scanner.nextDouble();

        // Calculate the side length of the square
        // Perimeter of a square = 4 * side
        // => side = perimeter / 4
        double side = perimeter / 4;

        // Display the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        // Close the scanner
        scanner.close();
    }
}