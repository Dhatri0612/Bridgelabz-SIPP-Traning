import java.util.Scanner;
import java.util.Random;

public class PCMScorecard {

    // Method 1: Generate random 2-digit scores for PCM
    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3]; // 3 subjects: Physics, Chemistry, Math
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 40 + rand.nextInt(61); // generates scores from 40 to 100
            }
        }
        return scores;
    }

    // Method 2: Calculate total, average, percentage (rounded to 2 digits)
    public static double[][] calculateTotalAvgPercent(int[][] scores) {
        int students = scores.length;
        double[][] result = new double[students][3]; // [Total, Average, Percentage]

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    // Method 3: Get Grade
    public static String getGrade(double percent) {
        if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 50) return "D";
        else if (percent >= 40) return "E";
        else return "R";
    }

    // Method 4: Display scorecard
    public static void displayScorecard(int[][] scores, double[][] result) {
        System.out.println("\nS.No\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t\t");
            }
            System.out.print((int) result[i][0] + "\t");
            System.out.print(result[i][1] + "\t");
            System.out.print(result[i][2] + "%\t\t");
            System.out.println(getGrade(result[i][2]));
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        double[][] result = calculateTotalAvgPercent(scores);
        displayScorecard(scores, result);
    }
}
