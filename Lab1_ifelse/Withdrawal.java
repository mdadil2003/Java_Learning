package Lab1_ifelse;

import java.util.Scanner;

public class Withdrawal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your amount:");
        int amount = s.nextInt();
        System.out.println("Enter Withdrawal Amount:");
        int wa = s.nextInt();
        Withdrawal r = new Withdrawal();
        String m=r.isPossible(amount,wa);
        System.out.println(m);
    }
String isPossible(int a,int b)
{
        if(a>b)
            return "Withdrawal Possible";
        else
            return "Withdrawal Not Possible";
}
}
