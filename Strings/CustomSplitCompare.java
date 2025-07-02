import java.util.*;

public class CustomSplitCompare {

    // Method 1: Get length without using length()
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // done
        }
        return count;
    }

    // Method 2: Custom split method using charAt()
    public static String[] customSplit(String text) {
        List<String> words = new ArrayList<>();
        String word = "";
        int i = 0;

        while (true) {
            try {
                char ch = text.charAt(i);
                if (ch != ' ') {
                    word += ch;
                } else {
                    if (!word.equals("")) {
                        words.add(word);
                        word = "";
                    }
                }
                i++;
            } catch (Exception e) {
                if (!word.equals("")) {
                    words.add(word);  // add last word
                }
                break;
            }
        }

        return words.toArray(new String[0]);
    }

    // Method 3: Compare two string arrays
    public static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) return false;

        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) return false;
        }
        return true;
    }

    // Method 4: Display string array
    public static void displayArray(String label, String[] arr) {
        System.out.println(label + ":");
        for (String word : arr) {
            System.out.println(" - " + word);
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] customWords = customSplit(input);
        String[] builtInWords = input.trim().split("\\s+");

        displayArray("Custom Split Result", customWords);
        displayArray("Built-in Split Result", builtInWords);

        boolean isSame = compareArrays(customWords, builtInWords);
        System.out.println("\nAre both split arrays equal? " + isSame);
    }
}
