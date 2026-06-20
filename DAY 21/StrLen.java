import java.util.Scanner;
public class StrLen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.next();
        int count = 0;
        char array[] = str.toCharArray();
        for (char ch : array)
        {
            count++;
        }
        System.out.println("Lenth of string is = " +count);
        input.close();
    }
    
}
