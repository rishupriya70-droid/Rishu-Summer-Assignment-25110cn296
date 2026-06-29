import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double num1, num2, result;
        do {
            System.out.println("\n===== Menu Driven Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                num1 = input.nextDouble();
                System.out.print("Enter second number: ");
                num2 = input.nextDouble();
                if (choice == 1) {
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                } 
                else if (choice == 2) {
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                } 
                else if (choice == 3) {
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                } 
                else if (choice == 4) {
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
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

