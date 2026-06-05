import java.util.Scanner;
public class pfact {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        System.out.println("The prime factors are:");
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0){
                System.out.println(i);
            }
        }
        input.close();
    }    
}
