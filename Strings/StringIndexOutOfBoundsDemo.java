import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method 1: Generate StringIndexOutOfBoundsException (without try-catch)
    public static void generateException(String text) {
        // Trying to access index beyond the string length
        System.out.println("Character at index 100: " + text.charAt(100));
    }

    // Method 2: Handle StringIndexOutOfBoundsException using try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Character at index 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
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
