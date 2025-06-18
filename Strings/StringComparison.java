import java.util.Scanner;

public class StringComparison {

    // Method 1: Compare strings using charAt()
    public static boolean manualCompare(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input strings
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Step 2: Compare using charAt()
        boolean manualResult = manualCompare(str1, str2);

        // Step 3: Compare using equals()
        boolean builtInResult = str1.equals(str2);

        // Step 4: Display results
        System.out.println("\nManual Comparison using charAt(): " + manualResult);
        System.out.println("Built-in Comparison using equals(): " + builtInResult);

        // Step 5: Check consistency
        if (manualResult == builtInResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results from the two methods differ.");
        }
    }
}
