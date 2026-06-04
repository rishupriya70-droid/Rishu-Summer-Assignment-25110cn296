import java.util.Scanner;
public class Arms {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        int org = n;
        int count = 0;
        int a = 0;
        while (n != 0)
        {
            a = n % 10;
            count++;
            n = n/10;
        }
        int sum = 0;
        n = org;
        while (n != 0)
        {
            a = n % 10;
            sum = sum + (int)Math.pow(a,count);
            n = n/10;
        }
        if (sum == org)
        {
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is NOT armstrong");
        }
        input.close();
    } 
}
