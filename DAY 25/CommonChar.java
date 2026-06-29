import java.util.Scanner;
public class CommonChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = input.next();
        System.out.println("Enter the second string: ");
        String str2 = input.next();
        int len1= str1.length();
        int len2 = str2.length();
        String word = "";
        for (int i =0; i < len1; i++){
            int count = 0;
            for (int j =0; j < len2; j++)
            {
                if (str1.charAt(i) == str2.charAt(j))
                {
                    count = 1;
                    break;
                }
            }
            if (count == 1)
            {
                int flag = 0;
                for (int k = 0; k < word.length(); k++)
                {
                    if (str1.charAt(i) == word.charAt(k))
                    {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                {
                    word = word + str1.charAt(i);
                }
            }    
        }
        System.out.println("Common character: " + word);
        input.close();
    }
}
