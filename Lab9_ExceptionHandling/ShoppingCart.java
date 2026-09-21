package Lab9_ExceptionHandling;

import java.util.Scanner;
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String msg) {
        super(msg);
    }
}
class InvalidPriceException extends Exception {
    public InvalidPriceException(String msg) {
        super(msg);
    }
}
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();
            if (price <= 0) {
                throw new InvalidPriceException("InvalidPriceException");
            }
            if (quantity <= 0) {
                throw new InvalidQuantityException("InvalidQuantityException");
            }
            double total = price * quantity;
            if (total > 5000) {
                total = total - (total * 0.10);
                System.out.println("10% Discount Applied.");
            }
            System.out.println("Total Bill = " + total);
        } catch (InvalidPriceException | InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
