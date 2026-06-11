import java.util.Scanner;
public class RevFullPyra {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = input.nextInt();
        for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1); k++){
                System.out.print("x");
            }
            System.out.println();
        }
        input.close();
    }
}    
    
