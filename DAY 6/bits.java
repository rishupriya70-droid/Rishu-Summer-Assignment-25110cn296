import java.util.Scanner;
public class bits {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        int count = 0;
        while (n != 0)
        {
            if (n % 2 == 1)
            {
                count++;
            }
            n = n/2;
        }
        System.out.println("Number os set bits are: " + count);
        input.close();
    }
}
