import java.util.Random;

public class FootballTeamHeights {

    // 1. Generate random heights between 150 and 250 for 11 players
    public static int[] generateHeights() {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 to 250
        }
        return heights;
    }

    // 2. Calculate sum
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // 3. Calculate mean height
    public static double calculateMean(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }

    // 4. Find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) min = h;
        }
        return min;
    }

    // 5. Find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) max = h;
        }
        return max;
    }

    // 6. Display everything
    public static void displayResults(int[] heights) {
        System.out.println("Player Heights (in cm):");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\n\nShortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + String.format("%.2f", calculateMean(heights)) + " cm");
    }

    public static void main(String[] args) {
        int[] playerHeights = generateHeights();
        displayResults(playerHeights);
    }
}
