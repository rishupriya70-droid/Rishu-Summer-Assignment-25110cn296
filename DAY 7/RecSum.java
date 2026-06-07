import java.util.Scanner;
public class RecSum {
    public static int sumDig(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        return (n%10) + sumDig(n / 10);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = input.nextInt();
        System.out.println("Sum of digits:");
        int sum = sumDig(n);
        System.out.println(sum);
        input.close();
    }
}
