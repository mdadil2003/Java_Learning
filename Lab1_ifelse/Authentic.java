package Lab1_ifelse;
import java.util.Scanner;
public class Authentic {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String a = s.nextLine();
        System.out.print("Enter Password: ");
        int pd = s.nextInt();

        Authentic r = new Authentic();
        String cre = r.isAuthentic(a, pd);
        System.out.println(cre);
    }
    String isAuthentic(String b, int c) {

        if (b.equals("admin") && c == 1234) {
            return "Credential is Authentic";
        } else {
            return "Credential is not Authentic";
        }
    }
}