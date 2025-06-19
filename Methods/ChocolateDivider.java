import java.util.Scanner;

public class ChocolateDivider {

    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int quotient = chocolates / children;
        int remainder = chocolates % children;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        if (children <= 0) {
            System.out.println("Number of children must be greater than 0.");
        } else {
            int[] result = findRemainderAndQuotient(chocolates, children);
            System.out.println("Each child gets " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }
    }
}
