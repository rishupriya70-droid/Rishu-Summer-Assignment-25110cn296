import java.util.Scanner;
public class ticket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalSeats = 50;
        int bookedSeats = 0;
        int availableSeats = totalSeats;
        int choice;
        do {
            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Check Available Seats");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Enter number of tickets to book: ");
                int tickets = input.nextInt();
                if (tickets <= availableSeats) {
                    bookedSeats = bookedSeats + tickets;
                    availableSeats = availableSeats - tickets;
                    System.out.println("Tickets booked successfully.");
                } else {
                    System.out.println("Not enough seats available.");
                }
            } 
            else if (choice == 2) {
                System.out.print("Enter number of tickets to cancel: ");
                int tickets = input.nextInt();
                if (tickets <= bookedSeats) {
                    bookedSeats = bookedSeats - tickets;
                    availableSeats = availableSeats + tickets;
                    System.out.println("Tickets cancelled successfully.");
                } else {
                    System.out.println("Invalid cancellation.");
                }
            } 
            else if (choice == 3) {
                System.out.println("Total Seats: " + totalSeats);
                System.out.println("Booked Seats: " + bookedSeats);
                System.out.println("Available Seats: " + availableSeats);
            } 
            else if (choice == 4) {
                System.out.println("Thank you.");
            } 
            else {
                System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        input.close();
    }
}

