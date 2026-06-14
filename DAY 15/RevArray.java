import java.util.Scanner;
public class RevArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = input.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }
        System.out.println("ORIGINAL ARRAY:");
        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i]);
        }
        // REVERSING THE ARRAY
        for (int i = 0; i < n/2; i++)
        {
                int temp = array[i];
                array[i] = array[n-1-i];
                array[n-1-i] = temp; 
        }
        System.out.println("REVERSED ARRAY:");
        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i]);
        }
        input.close();
    }
}




