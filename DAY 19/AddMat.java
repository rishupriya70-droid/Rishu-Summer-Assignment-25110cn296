import java.util.Scanner;
public class AddMat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // FOR FIRST MATRIX
        System.err.print("Enter the number of rows: ");
        int a = input.nextInt();
        System.err.print("Enter the number of rows: ");
        int b = input.nextInt();
        int matrix1[][] = new int[a][b];
        System.out.println("FIRST MATRIX ");
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                matrix1[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        // FOR SECOND MATRIX
        System.out.println("SECOND MATRIX ");
        int matrix2[][] = new int[a][b];
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                matrix2[i][j] = input.nextInt();
            }
        }
        System.out.println("SECOND MATRIX ");
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        // ADDING MATRICES
        int sum[][] = new int[a][b];
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("THE SUM MATRIX  ");
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
