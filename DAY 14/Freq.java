import java.util.Scanner;
public class Freq {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = input.nextInt();
        int array[] = new int [n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }
        System.out.println("Enter the element whose frequency to be searched:");
        int a = input.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++)
        {
            if (array[i] == a)
            {
                count++;
            }
        }
        System.out.println("The frequency of the element is: " +count);
        input.close();
    }
}
