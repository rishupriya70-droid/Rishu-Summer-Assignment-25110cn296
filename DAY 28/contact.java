import java.util.Scanner;
public class contact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[50];
        String[] phoneNumbers = new String[50];
        int count = 0;
        int choice;
        do {
            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                input.nextLine();
                System.out.print("Enter Name: ");
                names[count] = input.nextLine();
                System.out.print("Enter Phone Number: ");
                phoneNumbers[count] = input.nextLine();
                count++;
                System.out.println("Contact added successfully.");
            } 
            else if (choice == 2) {
                System.out.println("\nName\tPhone Number");
                for (int i = 0; i < count; i++) {
                    System.out.println(names[i] + "\t" + phoneNumbers[i]);
                }
            } 
            else if (choice == 3) {
                input.nextLine();
                System.out.print("Enter name to search: ");
                String searchName = input.nextLine();
                int found = 0;
                for (int i = 0; i < count; i++) {
                    if (names[i].equalsIgnoreCase(searchName)) {
                        System.out.println("Name: " + names[i]);
                        System.out.println("Phone Number: " + phoneNumbers[i]);
                        found = 1;
                    }
                }
                if (found == 0) {
                    System.out.println("Contact not found.");
                }
            } 
            else if (choice == 4) {
                input.nextLine();
                System.out.print("Enter name to delete: ");
                String deleteName = input.nextLine();
                int found = 0;
                for (int i = 0; i < count; i++) {
                    if (names[i].equalsIgnoreCase(deleteName)) {
                        for (int j = i; j < count - 1; j++) {
                            names[j] = names[j + 1];
                            phoneNumbers[j] = phoneNumbers[j + 1];
                        }
                        count--;
                        found = 1;
                        System.out.println("Contact deleted successfully.");
                        break;
                    }
                }
                if (found == 0) {
                    System.out.println("Contact not found.");
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