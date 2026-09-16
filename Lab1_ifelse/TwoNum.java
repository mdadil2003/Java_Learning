package Lab1_ifelse;

import java.util.Scanner;

public class TwoNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = s.nextInt();
        System.out.println("Enter the second number: ");
        int b = s.nextInt();
        TwoNum r = new TwoNum();
        int m=r.large(a,b);
        System.out.print("Largest number: " +m);
    }
int large(int a1,int a2)
{
    if(a1>a2)
        return a1;
    else
        return a2;
}
}
