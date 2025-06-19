import java.util.Scanner;

public class NumberSignChecker {
    public static int checkNumberSign(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int result = checkNumberSign(num);
        if (result == 1) System.out.println("Positive Number");
        else if (result == -1) System.out.println("Negative Number");
        else System.out.println("Number is Zero");
    }
}
