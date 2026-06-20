import java.util.Scanner;
public class NonRepeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.next();
        int len =str.length();
        for (int i = 0; i < len; i++)
        {
            int count = 0;
            for (int j = i+1; j < len; j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    count++;
                }
            }
            if (count == 0)
                {
                    System.out.println("First non repeated character = " + str.charAt(i));
                    break;
                }
        }
        input.close();
    }
}
