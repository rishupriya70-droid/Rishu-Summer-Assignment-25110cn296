//Factorial of the given number
import java.util.Scanner;

public class Factorial {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++)
        {
            fact = fact*i;
        } 
        input.close();
        System.out.println("Factorial is:" + fact);
    }
    
}
