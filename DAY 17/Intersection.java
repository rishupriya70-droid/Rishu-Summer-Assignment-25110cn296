import java.util.Scanner;
public class Intersection {
    public static void main(String[] args)
    {
        // FOR FIRST ARRAY
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements of the fist array: ");
        int a = input.nextInt();
        int array1[] = new int[a];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < a; i++)
        {
            array1[i] = input.nextInt();
        }
        // FOR SECOND ARRAY
        System.out.println("Enter the number of elements of the second array: ");
        int b = input.nextInt();
        int array2[] = new int[b];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < b; i++)
        {
            array2[i] = input.nextInt();
        }
        // INTERSECTION OF ARRAY
        System.out.println("Intersection of the array: ");
        for (int i =0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                if (array1[i] == array2[j])
                {
                    System.out.println(array1[i]);
                }
            }
        }
        input.close();
    }    
}
