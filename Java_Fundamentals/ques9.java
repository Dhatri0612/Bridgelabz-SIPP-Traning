import java.util.Scanner;

public class ques9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightCm=sc.nextDouble();
        double totalInches = heightCm / 2.54;
        int feet=(int)(totalInches/12);
        double inch=totalInches%12;
        System.out.println("Your Height in cm is "+heightCm+" while in feet is "+feet+" and inches is "+inch);
        sc.close();
    }
}
