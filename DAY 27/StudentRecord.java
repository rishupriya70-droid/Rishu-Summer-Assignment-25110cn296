import java.util.Scanner;
public class StudentRecord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollno;
        String name;
        int age;
        int marks;
        System.out.println("\n **** STUDENT RECORD MANAGEMENT SYSTEM ****");
        System.out.println("Enter roll number: ");
        rollno = input.nextInt();
        System.out.println("Enter name: ");
        name = input.next();
        System.out.println("Enter age: ");
        age = input.nextInt();
        System.out.println("Enter marks: ");
        marks = input.nextInt();
        System.out.println("\n ---- STUDENT RECORD ----");
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        input.close();
    }
    
}
