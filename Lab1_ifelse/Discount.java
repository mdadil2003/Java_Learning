package Lab1_ifelse;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your amount: ");
        int a = s.nextInt();
        Discount r = new Discount();
        int tamount = r.withdrawal(a);
        System.out.print("The total amount is " + tamount);
    }
    int withdrawal(int a1) {
        if (a1 < 2000)
            return a1;
        else if (a1 >= 2000 && a1 < 5000) {
            int am = 0;
            am = am + a1 - (a1 * 10) / 100;
            return am;
        }
        else
        {
            int am = 0;
            am = am + a1 - (a1 * 20) / 100;
            return am;
        }
    }
}
