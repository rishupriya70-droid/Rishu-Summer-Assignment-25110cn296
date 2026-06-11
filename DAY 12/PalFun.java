import java.util.Scanner;
public class PalFun {
    public static void main(String[] args)
    {
        pal();
    }
    public static void pal()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
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
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }     
    } 
    
}
