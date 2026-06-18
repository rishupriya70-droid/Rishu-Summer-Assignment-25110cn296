import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // FOR FIRST MATRIX
        System.err.print("Enter the number of rows: ");
        int r1 = input.nextInt();
        System.err.print("Enter the number of column: ");
        int c1 = input.nextInt();
        int matrix1[][] = new int[r1][c1];
        System.out.println("FIRST MATRIX ");
        for (int i = 0; i < r1; i++)
        {
            for (int j = 0; j < c1; j++)
            {
                matrix1[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < r1; i++)
        {
            for (int j = 0; j < c1; j++)
            {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        // FOR SECOND MATRIX
        System.out.println("SECOND MATRIX ");
        System.err.print("Enter the number of rows: ");
        int r2 = input.nextInt();
        System.err.print("Enter the number of column: ");
        int c2 = input.nextInt();
        if (c1 != r2)
        {
            System.out.println("Multiplication is not possible ");
            input.close();
            return;
        }
        int matrix2[][] = new int[r2][c2];
        for (int i = 0; i < r2; i++)
        {
            for (int j = 0; j < c2; j++)
            {
                matrix2[i][j] = input.nextInt();
            }
        }
        System.out.println("SECOND MATRIX ");
        for (int i = 0; i < r2; i++)
        {
            for (int j = 0; j < c2; j++)
            {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        // MULTIPLYING 
        int mult[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++)
        {
            for (int j = 0; j < c2; j++)
            {
                mult[i][j] = 0;
                for (int k = 0; k < c1; k++)
                {
                    mult[i][j] = mult[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("PRODUCT MATRIX ");
        for (int i = 0; i < r2; i++)
        {
            for (int j = 0; j < c2; j++)
            {
                System.out.print(mult[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
} 
