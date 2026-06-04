import java.util.Scanner;
public class FIBnthseries {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the term:");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i < n; i++)
        {
            c = a + b;
            a = b;
            b = c;
            if (i == n - 1)
            {
                System.out.println(a);
            }
        }
        input.close();
    }
    
}
