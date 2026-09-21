package Lab9_ExceptionHandling;
import java.util.Scanner;

public class TwoIntegers {
    public static void main(String[] args) {
        TwoIntegers obj = new TwoIntegers();
        obj.integer();
    }

    void integer()
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Num: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = a / b;
                System.out.println("Division is: " + c);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Division by zero is not allowed");
            }
        }
    }