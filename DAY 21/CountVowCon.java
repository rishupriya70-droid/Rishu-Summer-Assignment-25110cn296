import java.util.Scanner;
public class CountVowCon {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the string: "); 
       String str = input.next();
       char array[] = str.toCharArray();
       int countV = 0;
       int countC = 0;
       for (char ch : array)
        {
            if (ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                countV++;
            }
            else{
                countC++;
            }
        } 
        System.out.println("Number of vowels: " + countV);
        System.out.println("Number of consonants : " + countC);
        input.close();
    }
}
