import java.util.Scanner;
public class Second {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int array[] = new int [n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }
        // BY SORTING
        for ( int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (array[i] > array[j])
                {
                    int temp = array[j];
                    array[j] = array[i];
                    array [i] = temp;
                }
            }
        }
        System.out.print("The second largest element is: " + array[n-2]);
        input.close();
    }
}
