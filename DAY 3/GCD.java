import java.util.Scanner;
public class GCD {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = input.nextInt();
        System.out.println("Enter the second number:");
        int b = input.nextInt();
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++)
        {
            if (a % i == 0 && b % i == 0)
            {
                gcd = i;
            }
        }
        System.out.println("GCD:" + gcd);
        input.close();
    }
}
