import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method 1: Generate IllegalArgumentException (no handling)
    public static void generateException(String text) {
        // Invalid: start index > end index
        String result = text.substring(4, 2);
        System.out.println("Substring is: " + result);
    }

    // Method 2: Handle IllegalArgumentException with try-catch
    public static void handleException(String text) {
        try {
            // Invalid: start index > end index
            String result = text.substring(4, 2);
            System.out.println("Substring is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 2: Call method that throws exception
        System.out.println("\n--- Generating Exception (No Try-Catch) ---");
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        // Step 3: Call method that handles the exception
        System.out.println("\n--- Handling Exception (With Try-Catch) ---");
        handleException(input);
    }
}
