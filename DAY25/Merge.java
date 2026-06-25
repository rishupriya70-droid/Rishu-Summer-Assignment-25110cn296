import java.util.Scanner;
public class Merge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the elements of the first sorted array: ");
        int a = input.nextInt();
        int array1[] = new int[a];
        System.out.println("Enter the array elements: ");
        for (int i =0; i<a; i++)
        {
            array1[i] = input.nextInt();
        }
        System.out.println("Enter the number of the elements of the second sorted array: ");
        int b = input.nextInt();
        int array2[] = new int[b];
        System.out.println("Enter the array elements: ");
        for (int i =0; i<b; i++)
        {
            array2[i] = input.nextInt();
        }
        System.out.println("Merger of the sorted arrays are: ");
        for (int i =0; i<a; i++)
        {
            System.out.print(array1[i]);
        }
        for (int i =0; i<b; i++)
        {
            System.out.print(array2[i]);
        }
        input.close();
    }
}
