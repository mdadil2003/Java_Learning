package Lab9_ExceptionHandling;

import java.util.Scanner;
public class StringToint {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the String");
            try
            {
                String a=s.next();
                int a1=Integer.parseInt(a);
                System.out.println("Number: ");
                System.out.println(a1);
            }
            catch(NumberFormatException e)
            {
                System.out.println("wrong number entered");
            }
            s.close();
        }
    }

