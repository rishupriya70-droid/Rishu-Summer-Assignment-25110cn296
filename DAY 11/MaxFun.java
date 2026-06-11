import java.util.Scanner;
public class MaxFun {
    public static void main(String[] args){
        int ans = max();
        System.out.print(ans);

    }
    public static int max()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        input.close();
        int max = (a>b)?a:b;
        return max;
    }
}

