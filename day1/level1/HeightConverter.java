import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = scanner.nextDouble();
        
        // Conversion constants
        double cmPerInch = 2.54;
        int inchesPerFoot = 12;
        
        // Convert height from centimeters to total inches
        double totalInches = heightInCm / cmPerInch;
        
        // Calculate feet by dividing total inches by 12
        int feet = (int) (totalInches / inchesPerFoot);
        
        // Calculate remaining inches after extracting feet
        double inches = totalInches - (feet * inchesPerFoot);
        
        // Print the result
        System.out.println("Your Height in cm is " + heightInCm + 
                           " while in feet is " + feet + " and inches is " + String.format("%.2f", inches));
        
        // Close the scanner object
        scanner.close();
    }
}