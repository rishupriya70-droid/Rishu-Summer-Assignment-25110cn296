import java.util.Scanner;
public class PerFun {
    public static void main(String[] args)
    {
        perfect();
    }
    public static void perfect()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        int sum = 0;
        int org = n;
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0){
                sum = sum + i;
            }
        }
        if (sum == org)
        {
            System.out.println("The number is a perect number");
        } 
        else
        {
            System.out.println("The number is NOT a perect number");
        } 
        input.close();
    }
    
}
