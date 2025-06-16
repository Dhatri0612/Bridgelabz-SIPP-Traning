import java.util.Scanner;

public class Q27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number < 100: ");
        int number = sc.nextInt();

        int counter = 100;
        while (counter > 1) {
            if (counter % number == 0) {
                System.out.println(counter);
            }
            counter--;
        }
    }
}
