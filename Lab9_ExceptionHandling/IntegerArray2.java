package Lab9_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerArray2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the element: ");
        int sum=0;
        try
        {
            int arr[]=new int[5];
            for(int i=0;i<5;i++) {
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            int avg=sum/5;
            System.out.println("Average of array is"+ avg);
        }
        catch(InputMismatchException r) {
            System.out.println("wrong entry");
        }
        sc.close();


    }
}
