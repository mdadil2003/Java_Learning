package Lab8_Inheritance;

import java.util.Scanner;

class Order {
    private String customerName;
    private int customerNumber;
    private double orderQuantity;
    private double unitCost;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
    public void setOrderQuantity(double orderQuantity) {
        this.orderQuantity = orderQuantity;
    }
    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public String getCustomerName() {
        return customerName;
    }
    public int getCustomerNumber() {
        return customerNumber;
    }
    public double getOrderQuantity() {
        return orderQuantity;
    }
    public double getUnitCost() {
        return unitCost;
    }

    public double computePrice() {
        return orderQuantity * unitCost;
    }
}

class ShippedOrder extends Order {
    private final double shippingCharge = 40;

    @Override
    public double computePrice() {
        return super.computePrice() + shippingCharge;
    }
}

public class UseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShippedOrder order = new ShippedOrder();
        System.out.print("Enter Customer Name: ");
        order.setCustomerName(sc.nextLine());
        System.out.print("Enter Customer Number: ");
        order.setCustomerNumber(sc.nextInt());
        System.out.print("Enter Order Quantity: ");
        order.setOrderQuantity(sc.nextDouble());
        System.out.print("Enter Unit Cost: ");
        order.setUnitCost(sc.nextDouble());
        System.out.println(" ORDER DETAILS ");
        System.out.println("Customer Name   : " + order.getCustomerName());
        System.out.println("Customer Number : " + order.getCustomerNumber());
        System.out.println("Order Quantity  : " + order.getOrderQuantity());
        System.out.println("Unit Cost       : " + order.getUnitCost());
        System.out.println("Total Cost      : " + order.computePrice());
        sc.close();
    }
}