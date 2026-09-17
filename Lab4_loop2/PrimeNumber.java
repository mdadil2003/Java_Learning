package Lab4_loop2;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int s=sc.nextInt();
        PrimeNumber r=new PrimeNumber();
        r.prime(s);
        sc.close();
    }
    void prime(int n){
        int count=0;
        for(int i=1;i<=n;i++) {
            if (n % i == 0) {
                count++;
            }
        }
            if(count==2)
                System.out.println("Number is Prime");
            else
                System.out.println("Number is not Prime");
    }
}
