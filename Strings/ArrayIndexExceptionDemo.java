import java.util.Scanner;

public class ArrayIndexExceptionDemo {

    // Method to generate ArrayIndexOutOfBoundsException (without handling)
    public static void generateException(String[] names) {
        // Accessing an index that is out of bounds
        System.out.println("Accessing invalid index: " + names[names.length]); // Invalid index
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            // Trying to access an invalid index
            System.out.println("Accessing invalid index: " + names[names.length]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user for array
        System.out.print("Enter number of names: ");
        int size = scanner.nextInt();
        String[] names = new String[size];

        System.out.println("Enter the names:");
        for (int i = 0; i < size; i++) {
            names[i] = scanner.next();
        }

        // Calling method without exception handling
        System.out.println("\nCalling method without exception handling:");
        try {
            generateException(names); // This will crash the program if not wrapped in try-catch
        } catch (Exception e) {
            System.out.println("Exception caught in main (optional safety): " + e.getMessage());
        }

        // Calling method with exception handling
        System.out.println("\nCalling method with exception handling:");
        handleException(names);
    }
}
