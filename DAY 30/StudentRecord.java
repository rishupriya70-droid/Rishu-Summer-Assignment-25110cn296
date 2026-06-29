import java.util.Scanner;
public class StudentRecord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] rollNo = new int[50];
        String[] name = new String[50];
        String[] course = new String[50];
        double[] marks = new double[50];
        int count = 0;
        int choice;
        do {
            System.out.println("\n===== Student Record System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter Roll Number: ");
                rollNo[count] = input.nextInt();
                input.nextLine();
                System.out.print("Enter Name: ");
                name[count] = input.nextLine();
                System.out.print("Enter Course: ");
                course[count] = input.nextLine();
                System.out.print("Enter Marks: ");
                marks[count] = input.nextDouble();
                count++;
                System.out.println("Student added successfully.");
            } 
            else if (choice == 2) {
                System.out.println("\nRoll No\tName\tCourse\tMarks");
                for (int i = 0; i < count; i++) {
                    System.out.println(rollNo[i] + "\t" + name[i] + "\t" + course[i] + "\t" + marks[i]);
                }
            } 
            else if (choice == 3) {
                System.out.print("Enter Roll Number to search: ");
                int roll = input.nextInt();
                int found = 0;
                for (int i = 0; i < count; i++) {
                    if (rollNo[i] == roll) {
                        System.out.println("Roll Number: " + rollNo[i]);
                        System.out.println("Name: " + name[i]);
                        System.out.println("Course: " + course[i]);
                        System.out.println("Marks: " + marks[i]);
                        found = 1;
                    }
                }
                if (found == 0) {
                    System.out.println("Student not found.");
                }
            } 
            else if (choice == 4) {
                System.out.print("Enter Roll Number to delete: ");
                int roll = input.nextInt();
                int found = 0;
                for (int i = 0; i < count; i++) {
                    if (rollNo[i] == roll) {
                        for (int j = i; j < count - 1; j++) {
                            rollNo[j] = rollNo[j + 1];
                            name[j] = name[j + 1];
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

