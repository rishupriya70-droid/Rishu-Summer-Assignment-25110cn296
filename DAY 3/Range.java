import java.util.Scanner;
public class Range {
    public static void main( String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial number of the range:");
        int a = input.nextInt();
        System.out.println("Enter the last number of the range:");
        int b = input.nextInt();
        System.out.println("Your range is:" +a + " to " +b);
        System.out.println("The prime number in this range is:");
        for (int i = a; b >= i; i++)
        {
            int count = 0;
            for (int j = 1; j <= i; j++ )
            {
                if (i % j == 0)
                {
                    count++;
                }
            }    
            if (count == 2) 
                {
                    System.out.println(i);
                }   
        }
        input.close();
    }
}
