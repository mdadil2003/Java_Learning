package Lab1_ifelse;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int correctPin = 1234;

        System.out.print("Enter PIN: ");
        int pin = s.nextInt();

        System.out.print("Enter Balance: ");
        double balance = s.nextDouble();

        System.out.print("Enter Withdrawal Amount: ");
        double withdraw = s.nextDouble();

        if (pin != correctPin) {
            System.out.println("Invalid PIN");
        }
        else if (withdraw > balance) {
            System.out.println("Insufficient Balance");
        }
        else if (balance - withdraw < 1000) {
            System.out.println("Minimum balance of ₹1000 must be maintained");
        }
        else {
            balance = balance - withdraw;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance = ₹" + balance);
        }
    }
}