import java.util.Scanner;
public class Duplicate {
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
        System.out.println("Duplicate Elements are:");
        for (int i = 0; i < n; i++)
        {
            for (int j = i+1; j < n; j++)
            {
                if (array[i] == array[j])
                {
                    System.out.println(array[i]);
                    break;
                }
            }
        }
        input.close();
    }
}
