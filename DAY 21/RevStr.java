import java.util.Scanner;
public class RevStr {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the string: "); 
       String str = input.next();
       StringBuilder builder = new StringBuilder();
       char array[] = str.toCharArray();
       for (char ch : array)
        {
            builder.append(ch);
        } 
        System.err.println(builder.reverse());
        input.close();


    }
    
}
