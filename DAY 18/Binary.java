import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        // FOR BINARY SEARCH SORTED ARRAY IS TAKEN
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array: ");
        int n = input.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int a = input.nextInt();
        int first = 0;
        int last = n - 1;
        int found = 0;
        while (first <= last)
        {
            int mid = (first + last)/2;
            if (array[mid] == a)
            {
                System.out.println("Element found at index: " +mid);
                found = 1;
                break;
            }
            if (array[mid] < a)
            {
                first = mid + 1;
            }
            else{
                last = mid - 1;
            }
        }
        if (found == 0)
        {
            System.out.println("Elemend not found");
        }
        input.close();
    }
}
