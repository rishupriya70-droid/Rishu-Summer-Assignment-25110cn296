import java.util.Scanner;
    public class bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int accountNumber = 1001;
        String accountHolder = "Student";
        double balance = 0;
        int choice;
        do {
            System.out.println("\n===== Bank Account System =====");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                double amount = input.nextDouble();
                balance = balance + amount;
                System.out.println("Amount deposited successfully.");
            } 
            else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double amount = input.nextDouble();
                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Amount withdrawn successfully.");
                } else {
                    System.out.println("Insufficient balance.");
                }
            } 
            else if (choice == 3) {
                System.out.println("Current Balance: " + balance);
            } 
            else if (choice == 4) {
                System.out.println("Thank you.");
            } 
            else {
                System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        input.close();
    }
}

