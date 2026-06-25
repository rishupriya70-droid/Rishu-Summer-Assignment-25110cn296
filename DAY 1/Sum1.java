// SUM OF FIRST N NATURAL NUMBERS 
import java.util.Scanner;
public class Sum1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the required number:");
        int n = input.nextInt();
        int sum = 0;
        for (int i=1; i<=n; i++) 
        {
            sum+= i;
        }
        System.out.println("Sum = " + sum);
        input.close();
    
    }
    
}
