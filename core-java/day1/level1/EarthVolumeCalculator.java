public class EarthVolumeCalculator {
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKm = 6378;

        // Conversion factor from kilometers to miles
        double kmToMiles = 0.621371;

        // Calculate volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert radius to miles
        double radiusMiles = radiusKm * kmToMiles;

        // Calculate volume in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        // Print the results with a single print statement
        System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3
        );
    }
}