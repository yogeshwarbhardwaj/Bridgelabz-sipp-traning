import java.util.Scanner;

class Circle1 {
    double radius;

    // Constructor 
    Circle1(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display area and circumference
    void displayDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take radius input from user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Create Circle object and display results
        Circle1 circle = new Circle1(radius);
        circle.displayDetails();

        
    }
}