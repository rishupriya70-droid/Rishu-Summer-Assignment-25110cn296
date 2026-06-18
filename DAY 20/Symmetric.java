import java.util.Scanner;
public class Symmetric {
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
        // TRANSPOSE OF MATRIX
        System.out.println("TRASPOSE MATRIX");
        int transpose[][] = new int[a][b];
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                transpose[i][j] =  matrix[j][i];
            }
        }
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        //SYMMETRIC MATRIX
        int count = -1;
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                if (matrix[i][j] != transpose[i][j])
                {
                    count++;
                    break;
                }
            }
        }
        if (count == -1)
        {
            System.out.println("Matrix are Symmetric");
        }
        else
        {
            System.out.println("Matrix are not Symmetric");
        }
        input.close();
    }
}
