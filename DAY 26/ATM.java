import java.util.Scanner;
import java.util.Random;
public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int balance = random.nextInt(1000) + 1;
        System.out.println("/n***** ATM MENU *****");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");
        int ch = input.nextInt();
        switch (ch)
        {
            case 1:
                System.out.print("Currect balance: " + balance);
                break;
            case 2:
                System.out.print("Enter the amount to be deposit: ");
                int amount = input.nextInt();
                balance = balance + amount;
                System.out.print("The new balance is: " + balance);
                break;
            case 3:
                System.out.print("Enter the amount to be widrawn:");
                int widraw = input.nextInt();
                balance = balance - widraw;
                System.out.print("The new balance is: " + balance);
                break;
            case 4:
                System.out.print("Thank you for using our service");
                break;
            default:
                System.out.println("Please enter apropriate choice");
        }
        input.close();        
    } 
}
