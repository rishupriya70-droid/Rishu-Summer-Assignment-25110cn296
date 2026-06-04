import java.util.Scanner;
public class ARMSrange {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number of range:");
        int a = input.nextInt();
        System.out.println("Enter the last number of range:");
        int b = input.nextInt();
        System.out.println("The armstrong numbers are:");
        for (int i = a; i <= b; i++)
        {
            int org = i;
            int n = i;
            int count = 0;
            while (n != 0)
            {
                count++;
                n = n/10;
            }
            n = org;
            int sum = 0;
            while (n != 0)
            {
                int dig = n%10;
                sum = sum + (int)Math.pow(dig,count);
                n = n/10;
            }
            if (sum == org)
            {
                System.out.println(org);
            }
        }
        input.close();
    }
}
