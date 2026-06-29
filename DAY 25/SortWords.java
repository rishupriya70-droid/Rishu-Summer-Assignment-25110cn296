import java.util.Scanner;
public class SortWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements of the arra: ");
        String str = input.nextLine();
        String word[] = str.split(" ");
        // SORTING
        for (int i =0; i < word.length - 1; i++)
        {
            for (int j =0 ; j < word.length - i - 1; j++)
            {
                if (word[j].length() < word[j+1].length())
                {
                    String temp = word[j];
                    word[j] = word[j+1];
                    word[j+1] = temp;
                }
            }
        }
        System.out.println("Words sorted by length are: ");
        for (int i =0; i < word.length;i++){
            System.out.println(word[i]);
        }
        input.close();    
    }    
}
