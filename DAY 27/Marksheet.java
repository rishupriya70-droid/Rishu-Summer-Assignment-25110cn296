import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollno;
        String name;
        int cl;
        int mark1;
        int mark2;
        int mark3;
        int mark4;
        int mark5;
        System.out.println("\n **** MARKSHEET GENERATION SYSTEM ****");
        System.out.println("Enter student roll number: ");
        rollno = input.nextInt();
        System.out.println("Enter student name: ");
        name = input.next();
        System.out.println("Enter student class: ");
        cl = input.nextInt();
        System.out.println("Enter student marks in Hindi: ");
        mark1 = input.nextInt();
        System.out.println("Enter student marks in English: ");
        mark2 = input.nextInt();
        System.out.println("Enter student marks in Maths: ");
        mark3 = input.nextInt();
        System.out.println("Enter student marks in Science: ");
        mark4 = input.nextInt();
        System.out.println("Enter student marks in SST: ");
        mark5 = input.nextInt();
        System.out.println("\n ---- MARKSHEET ----");
        System.out.println("Student Roll Number: " + rollno);
        System.out.println("Student Name: " + name);
        System.out.println("Student class: "+ cl);
        System.out.println("Total Marks: " + (mark1+mark2+mark3+mark4+mark5));
        System.out.println("Total percentage: " + (mark1+mark2+mark3+mark4+mark5)/5);
        input.close();
    }
}
