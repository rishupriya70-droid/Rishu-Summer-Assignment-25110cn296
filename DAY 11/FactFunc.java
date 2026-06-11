import java.util.Scanner;
public class FactFunc {
    public static int factorial()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int fact = 1;
        if (n == 0)
        {
            fact = 1;
        }
        for (int i = 1; i <= n; i++)
        {
            fact = fact * i ;
        }
        input.close();
        return fact;
    }
    public static void main(String[] args)
    {
        System.out.print("FACTORAIL: " +factorial());
    }
}
