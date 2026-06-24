import java.util.Scanner;
public class longest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        int len = str.length();
        String word ="";
        String longest = "";
        for (int i =0; i<len; i++)
        {    
            if (str.charAt(i) != ' ')
            {
                word = word + str.charAt(i);
            }
            else {
                if (word.length() > longest.length())
            {
                longest = word;
            }
            word = "";
            }  
        }
        if (word.length() > longest.length())
        {
            longest = word;
        }
        System.out.println("Longest word = " + longest);
        input.close();
    }
}
