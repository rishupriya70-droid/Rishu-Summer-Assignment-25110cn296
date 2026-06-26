import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;
        char ans;

        System.out.println("***** JAVA QUIZ *****");

        System.out.println("\n1. Which keyword is used to create an object?");
        System.out.println("A. class");
        System.out.println("B. new");
        System.out.println("C. static");
        System.out.println("D. public");
        System.out.print("Enter your answer: ");
        ans = input.next().charAt(0);

        if(ans == 'B' || ans == 'b')
            score++;

        System.out.println("\n2. Which method is the entry point of a Java program?");
        System.out.println("A. main()");
        System.out.println("B. start()");
        System.out.println("C. run()");
        System.out.println("D. display()");
        System.out.print("Enter your answer: ");
        ans = input.next().charAt(0);

        if(ans == 'A' || ans == 'a')
            score++;

        System.out.println("\n3. Which package contains Scanner?");
        System.out.println("A. java.io");
        System.out.println("B. java.util");
        System.out.println("C. java.lang");
        System.out.println("D. java.awt");
        System.out.print("Enter your answer: ");
        ans = input.next().charAt(0);

        if(ans == 'B' || ans == 'b')
            score++;

        System.out.println("\n4. Which loop executes at least once?");
        System.out.println("A. for");
        System.out.println("B. while");
        System.out.println("C. do-while");
        System.out.println("D. none");
        System.out.print("Enter your answer: ");
        ans = input.next().charAt(0);

        if(ans == 'C' || ans == 'c')
            score++;

        System.out.println("\n5. Which symbol is used to end a statement in Java?");
        System.out.println("A. :");
        System.out.println("B. .");
        System.out.println("C. ;");
        System.out.println("D. ,");
        System.out.print("Enter your answer: ");
        ans = input.next().charAt(0);

        if(ans == 'C' || ans == 'c')
            score++;

        System.out.println("\nYour Score = " + score + "/5");

        input.close();
    }
}
