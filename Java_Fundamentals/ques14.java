import java.util.Scanner;

public class ques14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter unit price in INR: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice +" if the quantity is " + quantity + " and the unit price is INR " + unitPrice);
        sc.close();
    }
}
