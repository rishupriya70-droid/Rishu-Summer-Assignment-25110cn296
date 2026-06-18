import java.util.Scanner;

public class ColSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // FOR FIRST MATRIX
        System.err.print("Enter the number of rows: ");
        int r = input.nextInt();
        System.err.print("Enter the number of column: ");
        int c = input.nextInt();
        int matrix[][] = new int[r][c];
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // COLUMN SUM
        for (int j = 0; j < c; j++)
        {
            int sum = 0;
            for (int i = 0; i < r; i++)
            {
                sum = sum + matrix[i][j];
            }
            System.out.println("Sum of column " + (j+1) + " = " + sum );
        }
        input.close();
    }    
}
