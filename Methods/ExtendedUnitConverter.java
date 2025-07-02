import java.util.Scanner;

public class ExtendedUnitConverter {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Extended Unit Converter ---");
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");
        System.out.print("Enter your choice (1–5): ");
        int choice = sc.nextInt();

        double input, result;
        switch (choice) {
            case 1:
                System.out.print("Enter value in Yards: ");
                input = sc.nextDouble();
                result = convertYardsToFeet(input);
                System.out.println("Feet: " + result);
                break;
            case 2:
                System.out.print("Enter value in Feet: ");
                input = sc.nextDouble();
                result = convertFeetToYards(input);
                System.out.println("Yards: " + result);
                break;
            case 3:
                System.out.print("Enter value in Meters: ");
                input = sc.nextDouble();
                result = convertMetersToInches(input);
                System.out.println("Inches: " + result);
                break;
            case 4:
                System.out.print("Enter value in Inches: ");
                input = sc.nextDouble();
                result = convertInchesToMeters(input);
                System.out.println("Meters: " + result);
                break;
            case 5:
                System.out.print("Enter value in Inches: ");
                input = sc.nextDouble();
                result = convertInchesToCentimeters(input);
                System.out.println("Centimeters: " + result);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
