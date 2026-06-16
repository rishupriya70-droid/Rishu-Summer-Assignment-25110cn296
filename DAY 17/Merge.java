import java.util.Scanner;
public class Merge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // FOR FIRST ARRAY
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
        // MERGING THE ARRAY
        int n = a + b;
        int array[] = new int[n];
        for (int i = 0; i < a; i++)
        {
            array[i] = array1[i];
        }
        for (int i = 0; i < b; i++)
        {
            array[a+i] = array2[i];
        }
        // PRINTING THE ARRAY
        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i]);
        }
        input.close();
    }   
}
