package Lab1_ifelse;

import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = s.nextInt();
        System.out.print("Enter second number: ");
        int b = s.nextInt();
        System.out.print("Enter third number: ");
        int c = s.nextInt();
        Student r=new Student();
        String m =r.result(a,b,c);
        System.out.print(m);
    }
String result(int p, int q, int r)
{
        if(p>=35 && q>=35 && r>=35)
            return "Pass";
        else
            return "Fail";
}
}
