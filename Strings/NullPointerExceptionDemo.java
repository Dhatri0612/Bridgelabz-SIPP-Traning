public class NullPointerExceptionDemo {

    // Method 1: Generate NullPointerException (no handling)
    public static void generateException() {
        String text = null;  // null assigned
        System.out.println("Text length: " + text.length());  // Throws exception
    }

    // Method 2: Handle NullPointerException using try-catch
    public static void handleException() {
        try {
            String text = null;
            System.out.println("Text length: " + text.length());  // Throws exception
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        // Step 1: Call method that throws exception
        System.out.println("\n--- Generating Exception (No Try-Catch) ---");
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        // Step 2: Call method that handles exception
        System.out.println("\n--- Handling Exception (With Try-Catch) ---");
        handleException();
    }
}
