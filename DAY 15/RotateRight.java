import java.util.Scanner;
public class RotateRight {
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
        System.out.println("ORIGINAL ARRAY");
        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i]);
        }
        // ROTATING RIGHT
        int last = array[n-1]; 
        for (int i = n-1; i > 0; i--)
        {
            array[i] = array[i-1];
        }
        array[0] = last;
        System.out.println("ROTATED ARRAY:");
        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i]);
        }
        input.close();

    }
}
