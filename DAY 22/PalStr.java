import java.util.Scanner;
public class PalStr {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the string: "); 
       String str = input.next();
       int len = str.length();
       String rev = "";
       for (int i = len - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        } 
        if (str.equals(rev))
        {
            System.out.println("Palindrome string");
        }
        else {
            System.out.println("NOT a Palindrome string");
        }
        input.close();
    }
    
}
