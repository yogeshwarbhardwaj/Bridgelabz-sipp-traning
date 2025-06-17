import java.util.Scanner;

public class SimpleInterestCalculator {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        // Input Principal
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        // Input Rate of interest
        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();

        // Input Time period
        System.out.print("Enter Time in years: ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double interest = calculateSimpleInterest(principal, rate, time);

        // Output the result
        System.out.println("The Simple Interest is " + interest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
        
        scanner.close(); // Close scanner
    }
}