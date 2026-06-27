import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int id;
        String name;
        String dept;
        int salary;
        System.out.println("\n **** EMPLOYEE RECORD MANAGEMENT SYSTEM ****");
        System.out.println("Enter employee id: ");
        id = input.nextInt();
        System.out.println("Enter employee name: ");
        name = input.next();
        System.out.println("Enter employee department: ");
        dept = input.next();
        System.out.println("Enter employee salary: ");
        salary = input.nextInt();
        System.out.println("\n ---- EMPLOYEE RECORD ----");
        System.out.println("Employee id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee department: " + dept);
        System.out.println("Salarys: " + salary);
        input.close(); 
    }

}
