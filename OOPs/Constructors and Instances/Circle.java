public class Circle {
    // Attribute
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // calls the parameterized constructor with default radius 1.0
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }
}