import java.util.Scanner;
public class Project {
    static int[] rollNo = new int[50];
    static String[] studentName = new String[50];
    static String[] course = new String[50];
    static double[] marks = new double[50];
    static int count = 0;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Student Management Mini Project =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                addStudent();
            } 
            else if (choice == 2) {
                displayStudents();
            } 
            else if (choice == 3) {
                searchStudent();
            } 
            else if (choice == 4) {
                deleteStudent();
            } 
            else if (choice == 5) {
                System.out.println("Thank you.");
            } 
            else {
                System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    public static void addStudent() {
        System.out.print("Enter Roll Number: ");
        rollNo[count] = input.nextInt();
        input.nextLine();
        System.out.print("Enter Student Name: ");
        studentName[count] = input.nextLine();
        System.out.print("Enter Course: ");
        course[count] = input.nextLine();
        System.out.print("Enter Marks: ");
        marks[count] = input.nextDouble();
        count++;
        System.out.println("Student added successfully.");
    }
    public static void displayStudents() {
        System.out.println("\nRoll No\tName\tCourse\tMarks");
        for (int i = 0; i < count; i++) {
            System.out.println(rollNo[i] + "\t" + studentName[i] + "\t" + course[i] + "\t" + marks[i]);
        }
    }
    public static void searchStudent() {
        System.out.print("Enter Roll Number to search: ");
        int roll = input.nextInt();
        int found = 0;
        for (int i = 0; i < count; i++) {
            if (rollNo[i] == roll) {
                System.out.println("Roll Number: " + rollNo[i]);
                System.out.println("Name: " + studentName[i]);
                System.out.println("Course: " + course[i]);
                System.out.println("Marks: " + marks[i]);
                found = 1;
            }
        }
        if (found == 0) {
            System.out.println("Student not found.");
        }
    }
    public static void deleteStudent() {
        System.out.print("Enter Roll Number to delete: ");
        int roll = input.nextInt();
        int found = 0;
        for (int i = 0; i < count; i++) {
            if (rollNo[i] == roll) {
                for (int j = i; j < count - 1; j++) {
                    rollNo[j] = rollNo[j + 1];
                    studentName[j] = studentName[j + 1];
                    course[j] = course[j + 1];
                    marks[j] = marks[j + 1];
                }
                count--;
                found = 1;
                System.out.println("Student deleted successfully.");
                break;
            }
        }
        if (found == 0) {
            System.out.println("Student not found.");
        }
    }
}

