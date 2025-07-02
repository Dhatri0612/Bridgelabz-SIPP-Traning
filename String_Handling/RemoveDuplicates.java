import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String result = ""; // To store result without duplicates

        // Loop through characters
        for (char ch : str.toCharArray()) {
            if (result.indexOf(ch) == -1) // If not already present
                result += ch;
        }

        System.out.println("String after removing duplicates: " + result);
    }
}
