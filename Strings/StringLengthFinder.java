import java.util.Scanner;

public class StringLengthFinder {

    // Method to calculate string length without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Will throw exception when index out of bounds
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception is expected to stop the loop
        }
        return count;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Using custom method
        int customLength = getLength(input);

        // Using built-in length()
        int actualLength = input.length();

        // Display
        System.out.println("Length (manual): " + customLength);
        System.out.println("Length (built-in): " + actualLength);
    }
}
