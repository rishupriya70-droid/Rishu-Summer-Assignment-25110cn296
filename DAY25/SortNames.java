import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of names: ");
        int n = input.nextInt();
        String names[] = new String[n];
        System.out.println("Enter the names: ");
        for (int i =0; i<n; i++)
        {
            names[i] = input.next();
        }
        // SORTING
        for (int i =0; i < n - 1; i++)
        {
            for (int j =0 ; j < n - i - 1; j++)
            {
                if (names[j].compareTo(names[j+1])> 0)
                {
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }
        System.out.println("Words sorted by length are: ");
        for (int i =0; i < n ;i++){
            System.out.println(names[i]);
        }
        input.close();    
    }
}
