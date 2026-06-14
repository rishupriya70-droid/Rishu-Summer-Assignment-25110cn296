import java.util.Scanner;
public class RotateLeft {
    public static void main(String[] args) {
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
        // ROTATING LEFT
        int first = array[0]; 
        for (int i = 0; i < n - 1; i++)
        {
            array[i] = array[i+1];
        }
        array[n-1] = first;
        System.out.println("ROTATED ARRAY:");
        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i]);
        }
        input.close();
    }
}
