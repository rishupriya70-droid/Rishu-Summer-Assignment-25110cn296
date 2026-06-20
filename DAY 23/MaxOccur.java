import java.util.Scanner;

public class MaxOccur {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the string: "); 
       String str = input.next();
       int count = 0;
       int max = 0;
       int index = 0;
       int len = str.length();
       for (int i = 0; i < len - 1; i++)
       {
        for (int j = i+1; j < len; j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    count++;
                }
            } 
        if ( count > max)
        {
            max = count;
            index = i;
        }
       }
       System.out.println("The max occuring cgaracter is: " + str.charAt(index));
       input.close();
    }
}
