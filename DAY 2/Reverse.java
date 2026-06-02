import java.util.Scanner;
public class Reverse {
    public static void main (String[] agrs)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        int num = 0;
        while (n != 0)
        {
            int digit = n % 10;
            num = num*10 + digit;
            n = n/10;
        }
        input.close();
        System.out.println("The reversed number is:" + num); 
    }
    
}
