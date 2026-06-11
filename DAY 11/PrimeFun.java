import java.util.Scanner;
public class PrimeFun {
    public static void main(String[] args)
    {
        prime();
    }
    public static void prime()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int count = 0;
        for (int i = 2; n > i ; i++)
        {
            if (n % i == 0)
            { 
               count++;
               break;
            }   
        }
        if (count == 0)
        {
            System.out.println("Number is prime");
        }    
        else
        {
             System.out.println("Number is NOT prime");
        }     
        input.close();
    }
    
}
