import java.util.Scanner;

public class LineEquationDistance {

    // 1. Method to calculate Euclidean distance
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // 2. Method to calculate slope and y-intercept of line
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);           // Slope
        double b = y1 - m * x1;                     // y-intercept
        return new double[]{m, b};                  // Return slope and intercept
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance = %.2f\n", distance);

        // Line equation
        if (x2 != x1) {
            double[] line = calculateLineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of line: y = %.2fx + %.2f\n", line[0], line[1]);
        } else {
            System.out.println("Line is vertical: x = " + x1);
        }

        sc.close();
    }
}
