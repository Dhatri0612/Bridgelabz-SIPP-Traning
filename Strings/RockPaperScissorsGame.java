import java.util.*;

public class RockPaperScissorsGame {

    // Method 1: Get computer's random choice
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);  // 0 to 2
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    // Method 2: Determine winner
    public static String getWinner(String user, String comp) {
        if (user.equals(comp)) return "Tie";
        else if (
            (user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))
        ) return "User";
        else return "Computer";
    }

    // Method 3: Display game results in table
    public static void displayResults(String[][] results, int userWins, int compWins, int ties, int totalRounds) {
        System.out.println("\nGame Summary:");
        System.out.println("Round\tUser\tComputer\tWinner");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i+1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        // Calculate percentages
        double userPercent = (userWins * 100.0) / totalRounds;
        double compPercent = (compWins * 100.0) / totalRounds;

        System.out.println("\nUser Wins: " + userWins + " (" + String.format("%.2f", userPercent) + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + String.format("%.2f", compPercent) + "%)");
        System.out.println("Ties: " + ties);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rounds do you want to play? ");
        int rounds = sc.nextInt();
        sc.nextLine();  // consume newline

        String[][] results = new String[rounds][3];
        int userWins = 0, compWins = 0, ties = 0;

        for (int i = 0; i < rounds; i++) {
            System.out.print("\nRound " + (i+1) + " - Enter rock/paper/scissors: ");
            String user = sc.nextLine().toLowerCase();
            String comp = getComputerChoice();
            String winner = getWinner(user, comp);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else ties++;

            results[i][0] = user;
            results[i][1] = comp;
            results[i][2] = winner;
        }

        displayResults(results, userWins, compWins, ties, rounds);
    }
}
