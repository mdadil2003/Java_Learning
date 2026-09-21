package Lab9_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerArray {

        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the integer: ");

            try
            {
                int a=sc.nextInt();
                int lo = 1, hi = a;
                int res = 1;

                while (lo <= hi) {
                    int mid = lo + (hi - lo) / 2;
                    if (mid * mid <= a){
                        res = mid;
                        lo = mid + 1;
                    }   else {
                        hi = mid - 1;
                    }
                }

                System.out.println("the square root is"+ res);
            }
            catch(InputMismatchException r) {
                System.out.println("wrong entry");
            }
            sc.close();
        }
    }

