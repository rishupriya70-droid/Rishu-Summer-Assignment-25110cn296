import java.util.Scanner;
public class RecRev {
    static int rev = 0;
    public static int RevNum(int n)
    {
        if (n == 0)
        {
            return rev;
        }
        rev = rev * 10 + (n % 10);
        return RevNum(n / 10);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        System.out.println("Reverse of the number:" + RevNum(n));
        input.close();
    }
}
