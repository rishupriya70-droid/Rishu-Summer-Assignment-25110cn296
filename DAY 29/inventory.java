import java.util.Scanner;
public class inventory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] productId = new int[50];
        String[] productName = new String[50];
        int[] quantity = new int[50];
        double[] price = new double[50];
        int count = 0;
        int choice;
        do {
            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter Product ID: ");
                productId[count] = input.nextInt();
                input.nextLine();
                System.out.print("Enter Product Name: ");
                productName[count] = input.nextLine();
                System.out.print("Enter Quantity: ");
                quantity[count] = input.nextInt();
                System.out.print("Enter Price: ");
                price[count] = input.nextDouble();
                count++;
                System.out.println("Product added successfully.");
            } 
            else if (choice == 2) {
                System.out.println("\nID\tName\tQuantity\tPrice");
                for (int i = 0; i < count; i++) {
                    System.out.println(productId[i] + "\t" + productName[i] + "\t" + quantity[i] + "\t\t" + price[i]);
                }
            } 
            else if (choice == 3) {
                System.out.print("Enter Product ID to search: ");
                int id = input.nextInt();
                int found = 0;
                for (int i = 0; i < count; i++) {
                    if (productId[i] == id) {
                        System.out.println("Product ID: " + productId[i]);
                        System.out.println("Product Name: " + productName[i]);
                        System.out.println("Quantity: " + quantity[i]);
                        System.out.println("Price: " + price[i]);
                        found = 1;
                    }
                }
                if (found == 0) {
                    System.out.println("Product not found.");
                }
            } 
            else if (choice == 4) {
                System.out.print("Enter Product ID to update quantity: ");
                int id = input.nextInt();
                int found = 0;
                for (int i = 0; i < count; i++) {
                    if (productId[i] == id) {
                        System.out.print("Enter new quantity: ");
                        quantity[i] = input.nextInt();
                        System.out.println("Quantity updated successfully.");
                        found = 1;
                    }
                }
                if (found == 0) {
                    System.out.println("Product not found.");
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

