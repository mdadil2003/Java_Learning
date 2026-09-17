package Lab4_loop2;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        System.out.print("Enter third number: ");
        int c=sc.nextInt();
        LargestNum l=new LargestNum();
        l.large(a,b,c);
        sc.close();
    }
    void large(int p,int q,int r){
        if(p>q && p>r)
            System.out.println(p+ " is largest");
        else if(q>r)
            System.out.println(q+ " is largest");
        else
            System.out.println(r+ " is largest");
    }
}
