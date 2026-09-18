package Lab5_StringAndCommand;
import java.util.Scanner;

public class StringLength {
    public static int count(String str) {
        return str.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int len = count(str);
        System.out.println("Length = " + len);
    }
}
