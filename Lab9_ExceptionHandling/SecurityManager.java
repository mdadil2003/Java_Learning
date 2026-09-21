package Lab9_ExceptionHandling;

import java.util.Scanner;
public class SecurityManager {
    public static void checkPassword(String password) throws Exception {
        if (password == null || password.isEmpty()) {
            throw new Exception("Authentication failure: Password cannot be empty.");
        }
        System.out.println("Password check successful.");
    }
    public static void processData(String password) {
        try {
            checkPassword(password);
            System.out.println("Data successfully processed.");
        } catch (Exception e) {
            System.out.println("LOG: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first password: ");
            String password1 = sc.nextLine();
            processData(password1);
            System.out.print("Enter second password: ");
            String password2 = sc.nextLine();
            if (password2.isEmpty()) {
                password2 = null;
            }
            processData(password2);
        } catch (Exception e) {
            System.out.println("Main Exception: " + e.getMessage());
        }
        sc.close();
    }
}

