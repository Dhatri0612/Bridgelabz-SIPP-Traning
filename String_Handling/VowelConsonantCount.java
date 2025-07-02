import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase(); // Convert string to lowercase
        
        int vowels = 0, consonants = 0; // Counters

        // Loop through each character
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) { // Check only alphabets
                if ("aeiou".indexOf(ch) != -1)
                    vowels++; // Count vowel
                else
                    consonants++; // Count consonant
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
