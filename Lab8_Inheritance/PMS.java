package Lab8_Inheritance;

import java.util.Scanner;
public class PMS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the payment choice");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                CreditCardPayment c=new CreditCardPayment();
                double d=c.makePayment();
                System.out.println("Payment made through credit card: "+d);
                break;
            case 2:
                UpiPayment u=new UpiPayment();
                double d1=u.makePayment();
                System.out.println("Payment made through upi: "+d1);
                break;
            default:
                System.out.println("Thank You!");
        }

        sc.close();
    }
}
interface Payment
{
    double makePayment();
}
class CreditCardPayment implements Payment
{
    public double makePayment()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        int a=sc.nextInt();
        int total=0;
        total=a+(a*20)/100;
        sc.close();
        return total;
    }
}
class UpiPayment implements Payment
{
    public double makePayment()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        int a=sc.nextInt();
        int total=0;
        total=a+(a*10)/100;
        sc.close();
        return total;
    }
}
