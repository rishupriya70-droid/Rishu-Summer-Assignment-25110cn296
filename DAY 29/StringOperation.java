import java.util.Scanner;
public class StringOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "";
        int choice;
        do {
            System.out.println("\n===== Menu Driven String Operation =====");
            System.out.println("1. Enter String");
            System.out.println("2. Display String");
            System.out.println("3. Find Length");
            System.out.println("4. Reverse String");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                input.nextLine();
                System.out.print("Enter a string: ");
                str = input.nextLine();
                System.out.println("String saved successfully.");
            } 
            else if (choice == 2) {
                System.out.println("String: " + str);
            } 
            else if (choice == 3) {
                System.out.println("Length: " + str.length());
            } 
            else if (choice == 4) {
                String reverse = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    reverse = reverse + str.charAt(i);
                }
                System.out.println("Reverse String: " + reverse);
            } 
            else if (choice == 5) {
                System.out.println("Thank you.");
            } 
            else {
                System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        input.close();
    }
}
