import java.util.Scanner;
public class Unnion {
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
        // UNION ARRAY
        System.out.println("UNION ARRAY:");
        for (int i = 0; i < a; i++)
        {
            System.out.println(array1[i]);
        }
        for (int i = 0; i < b; i++)
        {
            int count = 0;
            for (int j = 0; j < a; j++)
            {
                if ( array2[i] == array1[j])
                {
                    count++;
                    break;
                }

            }
            if (count == 0)
            {
                System.out.println(array2[i] + " ");
            }
        }
        input.close();
    } 
}
