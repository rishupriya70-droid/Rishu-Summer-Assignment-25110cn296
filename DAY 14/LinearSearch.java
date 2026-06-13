import java.util.Scanner;
public class LinearSearch {
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
        System.out.println("Enter the element to be searched:");
        int a = input.nextInt();
        int pos = -1;
        for (int i = 0; i < n; i++)
        {
            if (array[i] == a)
            {
                pos = i;
                break;
            }
        }
        if (pos != -1)
        {
            System.out.println("Element is present in the array at the index: " +pos);
        }
        else {
            System.out.println("Element is NOT present in the array");
        }
        input.close();
    }
}
