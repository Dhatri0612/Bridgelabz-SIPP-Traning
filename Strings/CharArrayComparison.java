import java.util.Scanner;

public class CharArrayComparison {

    // Method 1: User-defined way to get char array
    public static char[] getCharsFromString(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    // Method 2: Compare two char arrays using charAt()
    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    // Method to print char array
    public static void printCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Step 2: User-defined char array
        char[] userChars = getCharsFromString(input);

        // Step 3: Built-in method toCharArray()
        char[] builtinChars = input.toCharArray();

        // Step 4: Display both
        System.out.print("User-defined char array: ");
        printCharArray(userChars);

        System.out.print("Built-in char array: ");
        printCharArray(builtinChars);

        // Step 5: Compare
        boolean areSame = compareCharArrays(userChars, builtinChars);
        System.out.println("\nComparison Result: " + (areSame ? "Arrays are the same" : "Arrays are different"));
    }
}
