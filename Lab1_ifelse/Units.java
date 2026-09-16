package Lab1_ifelse;

import java.util.Scanner;

public class Units {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the units used: ");
        int u = s.nextInt();
        Units r = new Units();
        int m = r.bill(u);
        System.out.print("Bill amount is "+m);
    }
    int bill(int data){
        int amount=0;
        if (data<100){
            amount=amount+(data*5);
            return amount;
        }
        else if (data>=100 && data<=200){
            amount=amount+(data*7);
            return amount;
        }
        else{
            amount=amount+(data*10);
            return amount;
        }
    }
}
