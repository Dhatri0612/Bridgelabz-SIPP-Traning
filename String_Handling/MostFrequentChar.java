import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int[] freq = new int[256]; // Frequency array for all ASCII chars

        // Count frequency
        for (char ch : str.toCharArray())
            freq[ch]++;

        int max = 0;
        char result = ' ';

        // Find most frequent character
        for (char ch : str.toCharArray()) {
            if (freq[ch] > max) {
                max = freq[ch];
                result = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + result + "'");
    }
}
