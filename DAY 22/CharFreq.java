import java.util.Scanner;
public class CharFreq {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the string: "); 
       String str = input.next();
       System.out.print("Enter the character to find: "); 
       char ch = input.next().charAt(0);
       int count = 0;
       int len = str.length();
       for (int i = 0; i < len - 1; i++)
       {
        if (str.charAt(i)== ch)
        {
            count++;
        }
       }
       System.out.println("The frequency of" + ch + "is: " + count);
       input.close();
    }
}
