import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.next();
        int len =str.length();
        int count = 0;
        for (int i = 0; i < len; i++)
        {
            for (int j = i+1; j < len; j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    count++;
                }
            } 
            if (count >= 1)   
            {
                System.out.println("First repeat character is: " + str.charAt(i));
                break;
            }
        }
        input.close();
    }
}
