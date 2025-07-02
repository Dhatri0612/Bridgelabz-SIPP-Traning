import java.util.Scanner;

public class Q32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);

        System.out.printf("BMI: %.2f\n", bmi);

        if (bmi <= 18.4)
            System.out.println("Status: Underweight");
        else if (bmi <= 24.9)
            System.out.println("Status: Normal");
        else if (bmi <= 39.9)
            System.out.println("Status: Overweight");
        else
            System.out.println("Status: Obese");
    }
}