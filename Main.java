import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 1;
        while (n>a){
            System.out.println(a);
            a++;
        }
        input.close();
    }
    
}