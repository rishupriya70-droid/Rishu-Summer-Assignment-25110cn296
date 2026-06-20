import java.util.Scanner;
public class LCtoUC {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the string: "); 
       String str = input.next();
       StringBuilder builder = new StringBuilder();
       char array[] = str.toCharArray();
       for (char ch : array)
        {
            builder.append((char)(ch - 32));
        } 
        System.out.println(builder);
        input.close();
    }
    
}
