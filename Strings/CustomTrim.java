import java.util.*;

public class CustomTrim {

    // Method 1: Find start and end index after trimming
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = 0;
        int len = 0;

        try {
            while (true) {
                str.charAt(len); // count total length
                len++;
            }
        } catch (Exception e) {
            // done
        }

        // Find first non-space
        while (start < len) {
            if (str.charAt(start) != ' ') break;
            start++;
        }

        // Find last non-space
        end = len - 1;
        while (end >= 0) {
            if (str.charAt(end) != ' ') break;
            end--;
        }

        return new int[]{start, end};
    }

    // Method 2: Create substring using charAt(), start to end (inclusive)
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method 3: Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        int i = 0;
        try {
            while (true) {
                if (s1.charAt(i) != s2.charAt(i)) return false;
                i++;
            }
        } catch (Exception e) {
            try {
                s2.charAt(i);
                return false;
            } catch (Exception ex) {
                return true; // both ended at same time
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        int[] indices = findTrimIndices(input);
        String trimmedCustom = customSubstring(input, indices[0], indices[1]);
        String trimmedBuiltIn = input.trim();

        System.out.println("Custom Trimmed: [" + trimmedCustom + "]");
        System.out.println("Built-in Trimmed: [" + trimmedBuiltIn + "]");

        boolean isEqual = compareStrings(trimmedCustom, trimmedBuiltIn);
        System.out.println("Are both equal? " + isEqual);
    }
}
