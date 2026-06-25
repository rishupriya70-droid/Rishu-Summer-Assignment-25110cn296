import java.util.Scanner;
public class CharTriangle {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = input.nextInt();
        System.out.println("The pattern is:");
        for(int i = 1; i <= n; i++){
            char ch = 'A';
            for (int j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
        System.out.println();      
        }
        input.close();    
    }
    
}
