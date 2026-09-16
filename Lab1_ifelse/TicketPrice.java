package Lab1_ifelse;
import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = s.nextInt();

        if (age < 5) {
            System.out.println("Ticket Price = Free");
        }
        else if (age >= 5 && age <= 18) {
            System.out.println("Ticket Price = ₹100");
        }
        else if (age >= 19 && age <= 60) {
            System.out.println("Ticket Price = ₹200");
        }
        else {
            System.out.println("Ticket Price = ₹150");
        }

    }
}