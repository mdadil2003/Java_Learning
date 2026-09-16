package Lab1_ifelse;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the year: ");
        int y = sc.nextInt();
        if ((y % 4 == 0 && y % 100 == 0) || y % 400 == 0)
            System.out.print("leap year");
        else
            System.out.print("Not leap year");
    }
}
