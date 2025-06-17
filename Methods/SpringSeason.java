public class SpringSeason {

        public static boolean isSpringSeason(int month, int day) {
        // Validate month and day for basic sanity, though the problem description implies valid dates.
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid month or day provided.");
            return false;
        }

      
        // Condition 1: Check if the month is March
        if (month == 3) {
            return day >= 20; // Spring starts on March 20
        }
        // Condition 2: Check if the month is April or May
        else if (month == 4 || month == 5) {
            return true; // All days in April and May are part of Spring
        }
        // Condition 3: Check if the month is June
        else if (month == 6) {
            return day <= 20; // Spring ends on June 20
        }
        // Condition 4: Any other month is not Spring
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Ensure that two command-line arguments (month and day) are provided
        if (args.length != 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            System.out.println("Example: java SpringSeason 3 25 (for March 25)");
            return; // Exit the program if arguments are incorrect
        }

        int month = 0;
        int day = 0;

        try {
            // Parse the command-line arguments to integers
            month = Integer.parseInt(args[0]);
            day = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Month and Day must be integer values.");
            System.out.println("Usage: java SpringSeason <month> <day>");
            return; // Exit the program if parsing fails
        }

        // Call the isSpringSeason method with the parsed month and day
        boolean isSpring = isSpringSeason(month, day);

        // Print the result based on the boolean returned
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
