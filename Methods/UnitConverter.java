import java.util.Scanner;

public class UnitConverter {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Unit Conversion Menu ---");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Enter your choice (1-6): ");
        int choice = sc.nextInt();

        double input, result;
        switch (choice) {
            case 1:
                System.out.print("Enter Fahrenheit: ");
                input = sc.nextDouble();
                result = convertFahrenheitToCelsius(input);
                System.out.println("Celsius: " + result);
                break;
            case 2:
                System.out.print("Enter Celsius: ");
                input = sc.nextDouble();
                result = convertCelsiusToFahrenheit(input);
                System.out.println("Fahrenheit: " + result);
                break;
            case 3:
                System.out.print("Enter Pounds: ");
                input = sc.nextDouble();
                result = convertPoundsToKilograms(input);
                System.out.println("Kilograms: " + result);
                break;
            case 4:
                System.out.print("Enter Kilograms: ");
                input = sc.nextDouble();
                result = convertKilogramsToPounds(input);
                System.out.println("Pounds: " + result);
                break;
            case 5:
                System.out.print("Enter Gallons: ");
                input = sc.nextDouble();
                result = convertGallonsToLiters(input);
                System.out.println("Liters: " + result);
                break;
            case 6:
                System.out.print("Enter Liters: ");
                input = sc.nextDouble();
                result = convertLitersToGallons(input);
                System.out.println("Gallons: " + result);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
