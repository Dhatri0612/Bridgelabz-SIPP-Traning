import java.util.Scanner;

public class SubstringComparison {

    // Method 1: Create substring manually using charAt()
    public static String manualSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method 2: Compare two strings using charAt()
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

        // Step 1: Input string
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Step 2: Input start and end index
        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Step 3: Manual substring
        String manual = manualSubstring(input, start, end);

        // Step 4: Built-in substring
        String builtin = input.substring(start, end);

        // Step 5: Display both
        System.out.println("Manual Substring: " + manual);
        System.out.println("Built-in Substring: " + builtin);

        // Step 6: Compare
        boolean areSame = compareStrings(manual, builtin);
        System.out.println("\nComparison Result: " + (areSame ? "✅ Substrings match" : "❌ Substrings differ"));
    }
}
