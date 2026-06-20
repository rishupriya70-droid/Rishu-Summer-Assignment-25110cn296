import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the string one: "); 
       String str1 = input.next();
       System.out.print("Enter the string two: "); 
       String str2 = input.next();
       int len1 = str1.length();
       int len2 = str2.length();
       int count = 0;
       for (int i = 0; i < len1; i++ )
       {
        for (int j = 0; j < len2; j++ )
        {
            if (str1.charAt(i) == str2.charAt(j))
            {
                count++; 
                break;
            }
        }
       }
       if (count == len1)
       {
        System.out.println("The string are Anagram");
       }
       else {
        System.out.println("The string are NOT Anagram");
       }
       input.close();
    }   
}
