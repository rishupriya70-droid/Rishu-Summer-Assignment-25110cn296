import java.util.Scanner;
public class MiniLibrary {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] bookId = new int[50];
        String[] bookName = new String[50];
        String[] status = new String[50];
        int count = 0;
        int choice;
        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter Book ID: ");
                bookId[count] = input.nextInt();
                input.nextLine();
                System.out.print("Enter Book Name: ");
                bookName[count] = input.nextLine();
                status[count] = "Available";
                count++;
                System.out.println("Book added successfully.");
            } 
            else if (choice == 2) {
                System.out.println("\nBook ID\tBook Name\tStatus");
                for (int i = 0; i < count; i++) {
                    System.out.println(bookId[i] + "\t" + bookName[i] + "\t" + status[i]);
                }
            } 
            else if (choice == 3) {
                System.out.print("Enter Book ID to issue: ");
                int id = input.nextInt();
                int found = 0;
                for (int i = 0; i < count; i++) {
                    if (bookId[i] == id) {
                        found = 1;
                        status[i] = "Issued";
                        System.out.println("Book issued successfully.");
                    }
                }
                if (found == 0) {
                    System.out.println("Book not found.");
                }
            } 
            else if (choice == 4) {
                System.out.print("Enter Book ID to return: ");
                int id = input.nextInt();
                int found = 0;
                for (int i = 0; i < count; i++) {
                    if (bookId[i] == id) {
                        found = 1;
                        status[i] = "Available";
                        System.out.println("Book returned successfully.");
                    }
                }
                if (found == 0) {
                    System.out.println("Book not found.");
                }
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