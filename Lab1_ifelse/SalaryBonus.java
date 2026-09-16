package Lab1_ifelse;
import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double salary = s.nextDouble();

        System.out.print("Enter Years of Experience: ");
        int exp = s.nextInt();

        double bonus = 0;

        if (exp < 2) {
            bonus = 0;
        }
        else if (exp <= 5) {
            bonus = salary * 0.10;
        }
        else {
            bonus = salary * 0.20;
        }

        double totalSalary = salary + bonus;

        System.out.println("Bonus = ₹" + bonus);
        System.out.println("Total Salary = ₹" + totalSalary);

    }
}