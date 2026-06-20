import java.util.Scanner;
public class Words {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the string: "); 
       String str = input.nextLine();
       int count = 1;
       int len = str.length();
       for (int i = 0; i < len - 1; i++)
       {
        if (str.charAt(i)== ' ')
        {
            count++;
        }
       }
       System.out.println("Number of words is: " + count);
       input.close();
    }
}
