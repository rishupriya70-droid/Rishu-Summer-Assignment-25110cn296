import java.util.Scanner;
public class ZeroEnd {
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
        System.out.println("ORIGINAL ARRAY");
        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i]);
        }
        //MOVING ZEROES TO THE END
        int index = 0;
        for (int i = 0; i < n; i++)
        {
            if (array[i] != 0)
            {
                array[index] = array[i];
                index++;
            }        
        } 
        while (index < n)
        {
            array[index] = 0;
            index++;
        }  
        System.out.println("ARRAY WITH ZEROES AT THE END");
        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i]);
        } 
        input.close();
    }
}
