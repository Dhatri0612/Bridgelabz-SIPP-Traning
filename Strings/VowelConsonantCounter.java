import java.util.*;

public class VowelConsonantCounter {

    // Method 1: Check if character is vowel or consonant
    public static String checkCharType(char ch) {
        // Convert to lowercase if uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);  // ASCII conversion
        }

        // Check if it's a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "NotALetter";
        }
    }

    // Method 2: Count vowels and consonants in a string
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;
        int i = 0;

        while (true) {
            try {
                char ch = text.charAt(i);
                String result = checkCharType(ch);
                if (result.equals("Vowel")) vowels++;
                else if (result.equals("Consonant")) consonants++;
                i++;
            } catch (Exception e) {
                break; // End of string
            }
        }

        return new int[]{vowels, consonants};
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] result = countVowelsConsonants(input);

        System.out.println("Total Vowels: " + result[0]);
        System.out.println("Total Consonants: " + result[1]);
    }
}
