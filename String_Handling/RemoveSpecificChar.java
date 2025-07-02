import java.util.Scanner;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);
        
        String result = "";

        // Add all characters except the one to remove
        for (char c : str.toCharArray()) {
            if (c != ch)
                result += c;
        }

        System.out.println("Modified String: " + result);
    }
}
