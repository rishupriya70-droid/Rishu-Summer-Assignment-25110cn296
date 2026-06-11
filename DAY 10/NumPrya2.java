import java.util.Scanner;
public class NumPrya2 {
    // SECOND METHOD:
    public static void Main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1); k++){
                if (k <= i){
                    System.out.print(k);
                }
                else {
                    System.out.print(2*i- k);
                }
            }
        System.out.println();            
        }
        input.close();
    }
    
}
