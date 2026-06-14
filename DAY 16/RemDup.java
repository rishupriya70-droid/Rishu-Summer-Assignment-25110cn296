import java.util.Scanner;
public class RemDup {
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
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < n; i++)
        {
            int count = 0;
            for (int j = i+ 1; j < n; j++)   
            {
                if (array[i] == array[j])
                {
                    count++;
                }
            }  
            if (count == 0)
            {
                System.out.println(array[i] + " ");
            } 
        }
        input.close();
    }
}
