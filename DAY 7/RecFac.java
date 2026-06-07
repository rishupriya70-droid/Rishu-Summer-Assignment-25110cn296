import java.util.Scanner;
public class RecFac {
    public static int factorial(int n)
    {
        if (n== 0 || n==1)
        {
            return 1;
        }
        return n * factorial(n-1);
        
    }    
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number:");
            int n = input.nextInt();
            int fact = factorial(n);
            System.out.println("Factorial = " +fact);
            input.close();
        }
}
