import java.util.Scanner;

public class CollinearCheck {

    // Method 1: Check collinearity using slope
    public static boolean isCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int slope1 = (y2 - y1) * (x3 - x1);
        int slope2 = (y3 - y1) * (x2 - x1);
        return slope1 == slope2;
    }

    // Method 2: Check collinearity using area of triangle
    public static boolean isCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for 3 points A(x1, y1), B(x2, y2), C(x3, y3)
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Slope method
        boolean slopeResult = isCollinearBySlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by Slope Method: " + slopeResult);

        // Area method
        boolean areaResult = isCollinearByArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Collinear by Area Method: " + areaResult);
    }
}
