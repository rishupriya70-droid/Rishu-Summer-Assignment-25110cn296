import java.util.Scanner;

public class Digit {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the digit:");
        int n = input.nextInt();
        int count = 0;
        while (n!=0)
        {
            n= n/10;
            count++;
        }
        System.out.println("Number of digits are:" + count);
        input.close();

    }
    
}
