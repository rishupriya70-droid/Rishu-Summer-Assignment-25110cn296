import java.util.Scanner;
public class LarPfact {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        System.out.println("The largest prime factors is:");
        int max = 0;
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0){
                int a = i;
                if (a > max)
                {
                    max = a;
                }

            } 
        }
        System.out.println(max); 
        input.close();
    }    
}
