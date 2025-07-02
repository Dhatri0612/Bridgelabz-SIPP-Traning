import java.util.Scanner;

public class WordLengthAnalyzer {

    // Method to split string into words manually
    public static String[] splitWords(String text) {
        int wordCount = 0;

        // Count words based on spaces
        for (int i = 0; i < getLength(text); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++; // For last word

        String[] words = new String[wordCount];
        StringBuilder currentWord = new StringBuilder();
        int index = 0;

        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord.append(ch);
            } else {
                words[index++] = currentWord.toString();
                currentWord.setLength(0); // Clear builder
            }
        }
        words[index] = currentWord.toString(); // Last word
        return words;
    }

    // Method to get length of a string without length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        return count;
    }

    // Method to get 2D array of word and its length
    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    // Method to find shortest and longest word
    public static String[] findShortestAndLongest(String[][] words) {
        String shortest = words[0][0];
        String longest = words[0][0];
        int shortLen = Integer.parseInt(words[0][1]);
        int longLen = Integer.parseInt(words[0][1]);

        for (int i = 1; i < words.length; i++) {
            int len = Integer.parseInt(words[i][1]);
            if (len < shortLen) {
                shortLen = len;
                shortest = words[i][0];
            }
            if (len > longLen) {
                longLen = len;
                longest = words[i][0];
            }
        }

        return new String[]{shortest, longest};
    }

    // Display result in table
    public static void displayTable(String[][] data) {
        System.out.println("\nWord\t\tLength");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordLengths = getWordsWithLength(words);

        displayTable(wordLengths);

        String[] shortestLongest = findShortestAndLongest(wordLengths);
        System.out.println("\nShortest word: " + shortestLongest[0]);
        System.out.println("Longest word: " + shortestLongest[1]);
    }
}
