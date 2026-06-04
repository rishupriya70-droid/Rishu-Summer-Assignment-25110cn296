import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println("Fibonacci series:");
        for (int i =1; i <= n; i++)
        {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c; 
        }
        input.close();
    }
    
}
