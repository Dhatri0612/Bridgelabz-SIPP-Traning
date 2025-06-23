import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String result = "";

        // Loop through characters
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch); // Convert to lowercase
            else if (Character.isLowerCase(ch))
                result += Character.toUpperCase(ch); // Convert to uppercase
            else
                result += ch; // Keep other characters same
        }

        System.out.println("Toggled String: " + result);
    }
}
