import java.util.Scanner;

public class NaturalNumberSumComparison {

    // Recursive method
    public static int sumRecursively(int n) {
        if (n == 1) return 1;
        return n + sumRecursively(n - 1);
    }

    // Formula-based method
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            int sumByRecursion = sumRecursively(n);
            int sumByFormula = sumUsingFormula(n);

            System.out.println("Sum using recursion: " + sumByRecursion);
            System.out.println("Sum using formula: " + sumByFormula);

            if (sumByRecursion == sumByFormula) {
                System.out.println("Both methods give the same result.");
            } else {
                System.out.println("Mismatch in results!");
            }
        }
    }
}
