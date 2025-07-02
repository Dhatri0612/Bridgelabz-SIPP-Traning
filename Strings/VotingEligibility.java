import java.util.*;

public class VotingEligibility {

    // Method 1: Generate random 2-digit ages
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            // generate random 2-digit age (10 to 99)
            ages[i] = rand.nextInt(90) + 10;
        }
        return ages;
    }

    // Method 2: Check voting eligibility and return 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false"; // Negative age is invalid
            } else if (ages[i] >= 18) {
                result[i][1] = "true"; // Can vote
            } else {
                result[i][1] = "false"; // Cannot vote
            }
        }
        return result;
    }

    // Method 3: Display in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\nStudent\tAge\tCan Vote?");
        System.out.println("----------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + "\t" + data[i][0] + "\t" + data[i][1]);
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] studentAges = generateAges(n);
        String[][] votingData = checkVotingEligibility(studentAges);
        displayTable(votingData);
    }
}
