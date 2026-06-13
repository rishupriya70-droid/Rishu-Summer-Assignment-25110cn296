import java.util.Scanner;
public class SumAvg {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }
        //FOR SUM OF ARRAY
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum = sum + array[i];
        }
        System.out.println("The sum of elements is: " + sum);
        //FOR AVERAGE
        float avg = 0;
        avg = (sum)/n;
        System.out.println("The average of elements is: " + avg);
        input.close();
    }
}
