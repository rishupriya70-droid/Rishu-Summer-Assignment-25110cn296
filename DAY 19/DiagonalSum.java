import java.util.Scanner;
public class DiagonalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.print("Enter the number of rows: ");
        int a = input.nextInt();
        System.err.print("Enter the number of column: ");
        int b = input.nextInt();
        int matrix[][] = new int[a][b];
        System.out.println("MATRIX ");
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // DIAGONAL SUM
        int sum = 0;
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                if (i == j)
                {
                    sum = sum + matrix[i][j];
                }
            }
        }
        System.out.println("Sum of dialognal elements are: " + sum);
        input.close();
    }    
}
