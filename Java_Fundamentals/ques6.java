import java.util.Scanner;

public class ques6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter fee");
        double fee= sc.nextDouble();;
        System.out.println("Enter discount percentage");
        double discountPercent= sc.nextDouble();
        double discount=(fee * discountPercent)/100;
        double finalFee= fee-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+finalFee);
        sc.close();
    }
}
