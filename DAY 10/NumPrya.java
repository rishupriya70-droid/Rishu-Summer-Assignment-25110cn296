import java.util.Scanner;
public class NumPrya {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
                //space
            }
            for (int k = 1; k <= i; k++){
                System.out.print(k);
                //ascending
                }
            for (int l = i -1; l >=1; l--)   
            {
                System.out.print(l);
                // descending
            }
            System.out.println();            
        }
        input.close();
    } 
}
