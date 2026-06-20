import java.util.Scanner;
public class RemSpace {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the string: "); 
       String str = input.nextLine();
       int len = str.length();
       for ( int i =0; i < len; i++)
       {
        if (str.charAt(i) != ' ')
        {
            System.out.print(str.charAt(i));
        }
       }
       input.close();
    }   
}
