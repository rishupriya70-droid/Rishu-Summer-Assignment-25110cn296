// PROGRAM TO PRINT MULTIPLICATION TABLE OF A NUMBER 
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the required number:");
        int n = input.nextInt();
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(n + "x" + i + "=" + (n*i));
        }
        input.close();
    }
}
