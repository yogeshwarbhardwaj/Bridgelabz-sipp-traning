public class NullPointerExceptionDemo {

    // Method to intentionally generate NullPointerException
    public static void generateException() {
        String text = null; // Initialize to null
        // Calling a method on null will throw NullPointerException
        System.out.println(text.length()); 
    }

    // Method to demonstrate handling NullPointerException with try-catch
    public static void handleException() {
        String text = null; // Initialize to null
        try {
            // Trying to access a method on null reference
            System.out.println("Attempting to access string length...");
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        // First, call method that generates the exception (and may terminate the program if not caught)
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main (from generateException): " + e);
        }

        // Call method to handle exception gracefully
        handleException();
    }
}