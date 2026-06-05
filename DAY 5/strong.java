import java.util.Scanner;
public class strong {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        int sum = 0;
        int org = n;
        while (n != 0)
            {
                int a = n % 10;
                int fact = 1;
                for (int i = 1; i <= a; i++)
                {
                    fact = fact * i;
                }
                sum =  sum + fact;
                n = n/10;
            }
            if (sum == org)
            {
                System.out.println("Number is a strong number");
            }
            else
            {
            System.out.println("The number is NOT a strong number");
            } 
            input.close();
    }
}
