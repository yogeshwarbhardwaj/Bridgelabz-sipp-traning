import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Take input for the original fee
        System.out.print("Enter the Student Fee: ");
        double fee = scanner.nextDouble();
        
        // Take input for the discount percentage
        System.out.print("Enter the University Discount Percentage: ");
        double discountPercent = scanner.nextDouble();
        
        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;
        
        // Calculate the final fee after discount
        double finalFee = fee - discount;
        
        // Display the results
        System.out.println("The discount amount is INR " + discount);
        System.out.println("Final discounted fee is INR " + finalFee);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}