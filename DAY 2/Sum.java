import java.util.Scanner; 
public class Sum {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        int sum = 0;
        while (n != 0)
        {
            int a = n % 10;
            sum  = sum + a;
            n = n / 10;

        }
        input.close();
        System.out.println("Sum of the digits are:" + sum);
    }
    
}
