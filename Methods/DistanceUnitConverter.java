import java.util.Scanner;

public class DistanceUnitConverter {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Distance Unit Converter ---");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Enter your choice (1–4): ");
        int choice = sc.nextInt();

        double input, result;
        switch (choice) {
            case 1:
                System.out.print("Enter kilometers: ");
                input = sc.nextDouble();
                result = convertKmToMiles(input);
                System.out.println("Miles: " + result);
                break;
            case 2:
                System.out.print("Enter miles: ");
                input = sc.nextDouble();
                result = convertMilesToKm(input);
                System.out.println("Kilometers: " + result);
                break;
            case 3:
                System.out.print("Enter meters: ");
                input = sc.nextDouble();
                result = convertMetersToFeet(input);
                System.out.println("Feet: " + result);
                break;
            case 4:
                System.out.print("Enter feet: ");
                input = sc.nextDouble();
                result = convertFeetToMeters(input);
                System.out.println("Meters: " + result);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
