import java.util.Scanner;
public class PairSum {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }
        System.out.println("Enter the required sum: ");
        int sum = input.nextInt();
        System.out.println("The required pairs are: ");
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (array[i] + array[j] == sum)
                {
                    System.out.println(array[i]+ " & " +array[j]);
                }
            }
        }
        input.close();
    }    
}
