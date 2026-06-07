import java.util.Scanner;
public class DtoB {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        int bin = 0;
        int plc = 1;
        while (n != 0)
        {
            int rem = n%2;
            bin = bin + rem*plc;
            plc = plc*10;
            n = n/2;
        }
        System.out.println("The converted number is:" + bin);
        input.close();
    }
}
