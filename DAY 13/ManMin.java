import java.util.Scanner;
public class ManMin {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }
        // LARGEST ELEMENT
        int max = array[0];
        for (int i = 1; i < n; i++)
        {
           if (max < array[i])
           {
            max = array[i];
           }
        }
        System.out.println("The largest element is: " + max);
        // SMALLEST ELEMENT
        int min = array[0];
        for (int i = 1; i < n; i++)
        {
           if (min > array[i])
           {
            min = array[i];
           }
        }
        System.out.println("The largest element is: " + min);
        input.close();
    }
}
