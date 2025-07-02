import java.util.Scanner;

public class UppercaseComparison {

    // Convert lowercase to uppercase using charAt and ASCII logic
    public static String manualToUpperCase(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);  // Convert to uppercase
            }
            result += ch;
        }
        return result;
    }

    // Compare two strings using charAt() method
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter your text: ");
        String input = sc.nextLine();

        // Step 2: Built-in method
        String builtInUpper = input.toUpperCase();

        // Step 3: User-defined method
        String manualUpper = manualToUpperCase(input);

        // Step 4: Compare and display
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Manual Uppercase: " + manualUpper);

        if (compareStrings(builtInUpper, manualUpper)) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The results are different.");
        }
    }
}
