import java.util.Scanner; 
public class Array {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = input.nextInt();

        //INPUT THE ARRAY
        int array[] = new int [n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }
        //DISPLAY THE ARRAY
        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i]);
        }
        input.close();
    }
}
