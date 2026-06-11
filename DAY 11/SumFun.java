import java.util.Scanner;
public class SumFun {
    public static void main(String[] args)
    {
        sum();
    }
    public static void sum (){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.print("SUM = " +sum);
        input.close();
    }
}

