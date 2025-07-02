import java.util.*;

public class WordLengthTable {

    // Method 1: Find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // end of string
        }
        return count;
    }

    // Method 2: Split sentence into words using charAt()
    public static String[] splitWords(String text) {
        List<String> wordList = new ArrayList<>();
        String word = "";
        int i = 0;
        while (true) {
            try {
                char ch = text.charAt(i);
                if (ch != ' ') {
                    word += ch;
                } else {
                    if (!word.equals("")) {
                        wordList.add(word);
                        word = "";
                    }
                }
                i++;
            } catch (Exception e) {
                if (!word.equals("")) {
                    wordList.add(word);  // add last word
                }
                break;
            }
        }
        return wordList.toArray(new String[0]);
    }

    // Method 3: Create 2D array with words and their lengths
    public static String[][] generateWordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method 4: Display table
    public static void displayTable(String[][] data) {
        System.out.println("\nWord\t\tLength");
        System.out.println("----------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + Integer.parseInt(data[i][1]));
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] table = generateWordLengthTable(words);
        displayTable(table);
    }
}
