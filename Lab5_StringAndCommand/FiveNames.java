package Lab5_StringAndCommand;

import java.util.Scanner;
public class FiveNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String names[] = new String[5];
        System.out.println("Enter 5 names:");
        for(int i = 0; i < 5; i++) {
            names[i] = sc.nextLine();
        }
        System.out.println("\nNames are:");
        for(int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }
    }
}
