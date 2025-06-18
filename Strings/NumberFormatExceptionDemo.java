import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method 1: Generate NumberFormatException (no handling)
    public static void generateException(String text) {
        // This will crash if the text is not a number
        int num = Integer.parseInt(text);
        System.out.println("Parsed number is: " + num);
    }

    // Method 2: Handle NumberFormatException using try-catch
    public static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a string (expected number): ");
        String input = sc.nextLine();

        // Step 2: Call method that throws exception
        System.out.println("\n--- Generating Exception (No Try-Catch) ---");
        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Caught in main (optional safety): " + e.getMessage());
        }

        // Step 3: Call method that handles exception
        System.out.println("\n--- Handling Exception (With Try-Catch) ---");
        handleException(input);
    }
}
