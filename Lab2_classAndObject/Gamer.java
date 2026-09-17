package Lab2_classAndObject;
import java.util.Scanner;
public class Gamer {

    String playerName;
    int matchesPlayed;
    int points;

    void displayCategory() {
        if (points >= 90) {
            System.out.println("Category: Champion");
        } else if (points >= 70) {
            System.out.println("Category: Expert");
        } else if (points >= 50) {
            System.out.println("Category: Intermediate");
        } else {
            System.out.println("Category: Beginner");
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Gamer g = new Gamer();

        System.out.print("Enter Player Name: ");
        g.playerName = s.nextLine();

        System.out.print("Enter Matches Played: ");
        g.matchesPlayed = s.nextInt();

        System.out.print("Enter Points: ");
        g.points = s.nextInt();

        System.out.println("\nPlayer Name: " + g.playerName);
        System.out.println("Matches Played: " + g.matchesPlayed);
        System.out.println("Points: " + g.points);

        g.displayCategory();

    }
}