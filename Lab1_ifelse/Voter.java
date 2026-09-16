package Lab1_ifelse;
import java.util.*;
public class Voter {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = s.nextInt();
        Voter r = new Voter();
        String m=r.isEligible(age);
        System.out.print(m);

    }
    String isEligible(int age){
        if(age<18)
            return "Not eligible";
        else
            return "Eligible";
    }
}
