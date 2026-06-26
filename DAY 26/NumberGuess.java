import java.util.Scanner;
import java.util.Random;
public class NumberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        System.out.println("BE READY FOR THE GAME!");
        int guess;
        do {
            System.out.println("Enter your guess: ");
            guess = input.nextInt();
            if (guess > num)
            {
                System.out.println("Too high!");
            }
            else if ( guess < num)
            {
                System.out.println("Too low!");   
            }
            else{
                System.out.println("Correct guess!!");
            }
        }
        while (guess != num);
        input.close();
    }
    
}
