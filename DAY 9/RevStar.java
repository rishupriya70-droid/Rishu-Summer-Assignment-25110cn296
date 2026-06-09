import java.util.Scanner;
public class RevStar {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = input.nextInt();
        System.out.println("The pattern is:");
        for(int i =n; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("x");
            }
        System.out.println();      
        }
        input.close();    
    }
    
}
