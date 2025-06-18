import java.util.Scanner;

public class LowercaseComparison {

    // Convert uppercase to lowercase manually using charAt() and ASCII
    public static String manualToLowerCase(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);  // Convert to lowercase
            }
            result += ch;
        }
        return result;
    }

    // Compare two strings using charAt()
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

        // Step 1: Take user input
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // Step 2: Use built-in toLowerCase()
        String builtInLower = input.toLowerCase();

        // Step 3: Use user-defined lowercase conversion
        String manualLower = manualToLowerCase(input);

        // Step 4: Display and compare
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Manual Lowercase: " + manualLower);

        if (compareStrings(builtInLower, manualLower)) {
            System.out.println("Both lowercase conversions are same.");
        } else {
            System.out.println("The conversions differ.");
        }
    }
}
