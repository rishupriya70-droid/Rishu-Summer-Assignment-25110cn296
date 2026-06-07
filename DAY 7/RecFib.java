import java.util.Scanner;
public class RecFib {
    public static int fib (int n) 
    {
        if (n== 0)
        {
            return 0;
        }
        if (n == 1)
        {
            return 0;
        }
        if (n == 2)
        {
            return 1;
        }
        return fib(n-2) + fib(n-1);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = input.nextInt();
        System.out.println("Fibonacci series:");
        for (int i =1; i <= n; i++)
        {
            System.out.println(fib(i));
        }
        input.close();
    }
}
