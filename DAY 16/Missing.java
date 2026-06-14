import java.util.Scanner;
public class Missing {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n (1 to n): ");
        int n = input.nextInt();
        int array[] = new int[n-1];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n - 1; i++)
        {
            array[i] = input.nextInt();
        }
        int sum = 0;
        int total = n*(n+1)/2;
        for (int i = 0; i < n - 1; i++)
        {
            sum = sum + array[i];
        }
        int miss = total- sum;
        System.out.println("The missing number is: " + miss);
        input.close();
    }
     
}
