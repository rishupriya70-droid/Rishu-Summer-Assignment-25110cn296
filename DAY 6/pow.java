import java.util.Scanner;
public class pow {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        System.out.println("Enter the power number:");
        int a = input.nextInt();
        int pow = 1;
        for (int i =1; i<= a; i++)
        {
            pow = pow * n;

        }
        System.out.println("Answer : " + pow);
        input.close();
    }
}
