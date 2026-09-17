// Lab assignment  for loops

package Lab4_loop2;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter 1st number: ");
        a=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        b=sc.nextInt();
        Calculator c = new Calculator();
        c.number(a,b);
        sc.close();
    }
    void number(int p,int q){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice){
        case 1:
            System.out.println("Addition: "+(p+q));
            break;
        case 2:
            System.out.println("Subtraction: "+(p-q));
            break;
        case 3:
            System.out.println("Multiplication: "+(p*q));
            break;
        case 4:
            System.out.println("Division: "+(p/q));
            break;
        case 5:
            System.exit(0);
        }
        sc.close();
    }
}
