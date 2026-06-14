import java.util.Scanner;
public class MaxFreq {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }
        int maxf = 0;
        int element = 0;
        for (int i = 0; i < n; i++)
        {
            int count = 0;
            for (int j = 0; j < n; j++)
            {
                if (array[i] == array[j])
                {
                    count++;
                }
            }
            if (count > maxf)
            {
                maxf = count;
                element = array[i];
            }
        }
        System.out.println("The element with maximum frequency is: " + element);
        System.out.println("The maximum frequency is: " + maxf);
        input.close();
    }    
}
