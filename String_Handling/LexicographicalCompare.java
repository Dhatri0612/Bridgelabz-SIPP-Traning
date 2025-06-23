import java.util.Scanner;

public class LexicographicalCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        int minLen = Math.min(str1.length(), str2.length()); 
        boolean equal = true;

        // Compare character by character
        for (int i = 0; i < minLen; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (str1.charAt(i) < str2.charAt(i))
                    System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
                else
                    System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\"");
                equal = false;
                break;
            }
        }

        // If all characters same, compare lengths
        if (equal) {
            if (str1.length() < str2.length())
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
            else if (str1.length() > str2.length())
                System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\"");
            else
                System.out.println("Both strings are equal");
        }
    }
}
