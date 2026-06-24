import java.util.Scanner;
public class compress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.next();
        char array[] = str.toCharArray();
        int len = str.length();
        for (int i = 0; i< len; i++)
        {
            int count = 0;
            for (int j = 0; j < len; j++)
            {
                if (array[i] == array[j])
                {
                    count++;
                }

            }
            for (int k = 0; k < i; k++)
            {
                if (array[i] == array[k])
                {
                    count = -1;
                    break;
                }
            }
            if (count != -1)
            {
                System.out.print(array[i]);
                System.out.print(count);
            }
        }
        input.close();
    }
}
