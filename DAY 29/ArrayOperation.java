import java.util.Scanner;
public class ArrayOperation {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[50];
        int n = 0;
        int choice;
        do {
            System.out.println("\n===== Menu Driven Array Operation =====");
            System.out.println("1. Insert Elements");
            System.out.println("2. Display Elements");
            System.out.println("3. Search Element");
            System.out.println("4. Delete Element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter number of elements: ");
                n = input.nextInt();
                System.out.println("Enter " + n + " elements:");
                for (int i = 0; i < n; i++) {
                    arr[i] = input.nextInt();
                }
                System.out.println("Elements inserted successfully.");
            } 
            else if (choice == 2) {
                System.out.println("Array elements are:");
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            } 
            else if (choice == 3) {
                System.out.print("Enter element to search: ");
                int search = input.nextInt();
                int found = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == search) {
                        found = 1;
                        System.out.println("Element found at position " + (i + 1));
                    }
                }
                if (found == 0) {
                    System.out.println("Element not found.");
                }
            } 
            else if (choice == 4) {
                System.out.print("Enter element to delete: ");
                int delete = input.nextInt();
                int found = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == delete) {
                        for (int j = i; j < n - 1; j++) {
                            arr[j] = arr[j + 1];
                        }
                        n--;
                        found = 1;
                        System.out.println("Element deleted successfully.");
                        break;
                    }
                }
                if (found == 0) {
                    System.out.println("Element not found.");
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


