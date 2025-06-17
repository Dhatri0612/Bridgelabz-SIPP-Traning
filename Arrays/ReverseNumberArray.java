import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        
        if (number == 0) {
            System.out.println("Reversed number is: 0");
            return;
        }

        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        
        int[] digits = new int[count];
        temp = number;
        int index = 0;
        while (temp != 0) {
            digits[index++] = temp % 10;
            temp /= 10;
        }

        
        System.out.print("Reversed number is: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}
