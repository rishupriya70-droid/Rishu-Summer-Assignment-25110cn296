import java.util.Scanner;
public class BtoD {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        int dec = 0;
        int plc = 0;
        while (n != 0)
        {
            int rem = n % 10;
            dec = dec + rem * (int)Math.pow(2,plc);
            plc++;
            n = n / 10;
        }
        System.out.println("The converted number is:" +dec);
        input.close();
    }
}
