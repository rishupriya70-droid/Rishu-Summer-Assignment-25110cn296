//A number that remains when their digits are reversed
import java.util.Scanner;
public class Palindrome 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        int org = n;
        int rev = 0;
        while (n != 0)
        {
            int a = n % 10;
            rev = rev*10 + a;
            n = n / 10;
        }
        input.close();
        if (rev == org)
        {
            System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }     
    } 
}