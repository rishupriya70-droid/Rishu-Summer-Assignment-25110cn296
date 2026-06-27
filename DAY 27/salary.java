import java.util.Scanner;

public class salary {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int id;
        String name;
        String dept;
        int salary;
        System.out.println("\n **** SALARY MANAGEMENT SYSTEM ****");
        System.out.println("Enter employee id: ");
        id = input.nextInt();
        System.out.println("Enter employee name: ");
        name = input.next();
        System.out.println("Enter employee department: ");
        dept = input.next();
        System.out.println("Enter employee salary: ");
        salary = input.nextInt();
        System.out.println("\n ---- SALARY RECORD ----");
        System.out.println("Employee id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee department: " + dept);
        System.out.println("Salarys: " + salary);
        System.out.println("Yearly salary: " +(salary*12));
        input.close(); 
    } 
}
