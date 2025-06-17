import java.util.Scanner;

public class WindChillCalculator {

       public double calculateWindChill(double temperature, double windSpeed) {
        // According to the National Weather Service (NWS) criteria for wind chill:
        // The formula is only valid for temperatures <= 50°F and wind speeds > 3 mph.

        if (temperature > 50.0 || windSpeed <= 3.0) {
            // If the temperature is above 50°F or wind speed is 3 mph or less,
            // wind chill is not a factor or is considered to be the same as the air temperature.
            System.out.println("Note: Wind chill is not calculated under these conditions (temperature > 50°F or wind speed <= 3 mph).");
            System.out.println("Returning the air temperature as the effective temperature.");
            return temperature;
        }

        // Calculate V raised to the power of 0.16
        double windSpeedPower = Math.pow(windSpeed, 0.16);

        // Apply the wind chill formula
        double windChill = 35.74 + (0.6215 * temperature) - (35.75 * windSpeedPower) + (0.4275 * temperature * windSpeedPower);

        return windChill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WindChillCalculator calculator = new WindChillCalculator();

        System.out.println("--- Wind Chill Temperature Calculator ---");

        // Get temperature input from the user
        System.out.print("Enter the air temperature in degrees Fahrenheit (°F): ");
        double temp = scanner.nextDouble();

        // Get wind speed input from the user
        System.out.print("Enter the wind speed in miles per hour (mph): ");
        double speed = scanner.nextDouble();

        // Calculate and display the wind chill temperature
        double windChillResult = calculator.calculateWindChill(temp, speed);

        // Print the result, formatted to two decimal places
        System.out.printf("Given Temperature: %.2f°F%n", temp);
        System.out.printf("Given Wind Speed: %.2f mph%n", speed);
        System.out.printf("The calculated Wind Chill Temperature is: %.2f°F%n", windChillResult);

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}