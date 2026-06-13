import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = input.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }
        int countodd = 0;
        int counteven = 0;
        for (int i = 0; i < n; i++)
        {
            if (array[i] % 2 == 0)
            {
                counteven++;
            }
            else{
                countodd++;
            }
        }
        System.out.println("The even elements are: " + counteven);
        System.out.println("The odd elements are: " + countodd);
        input.close();
    }
}
