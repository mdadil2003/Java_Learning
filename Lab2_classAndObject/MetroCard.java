package Lab2_classAndObject;
import java.util.Scanner;

public class MetroCard {

    String cardNumber;
    double balance;
    double travelFare;

    void checkJourney() {

        if (balance >= travelFare) {

            balance = balance - travelFare;

            System.out.println("Journey Allowed");
            System.out.println("Remaining Balance: ₹" + balance);

            if (balance < 50) {
                System.out.println("Low Balance Warning");
            }

        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MetroCard m = new MetroCard();

        System.out.print("Enter Card Number: ");
        m.cardNumber = sc.nextLine();

        System.out.print("Enter Balance: ");
        m.balance = sc.nextDouble();

        System.out.print("Enter Travel Fare: ");
        m.travelFare = sc.nextDouble();

        m.checkJourney();

        sc.close();
    }
}
