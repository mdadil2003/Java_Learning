package Lab4_loop2;
import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int s = sc.nextInt();
        EvenOddSum r = new EvenOddSum();
        r.digitSum(s);
        sc.close();
    }
    void  digitSum(int n){
        int evensum = 0, oddsum = 0, rem;
        while(n>0)
        {
            rem=n%10;
            if(rem%2==0)
            {
                evensum = evensum+rem;
            }
            else
                oddsum=oddsum+rem;
            n=n/10;
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
