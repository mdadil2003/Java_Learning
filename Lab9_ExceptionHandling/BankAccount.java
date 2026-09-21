package Lab9_ExceptionHandling;

import java.util.Scanner;

public class BankAccount {

    int accNo;
    String AccountHolderName;
    double balance;
    BankAccount(int accNo,String AccountHolderName,double balance)
    {
        this.accNo=accNo;
        this.AccountHolderName=AccountHolderName;
        this.balance=balance;
    }
    void deposit(double amount)
    {
        balance+=amount;
        System.out.println("Deposited:"+balance);
    }
    void withdraw(double amount)
    {
        if(amount<=balance)
        {
            balance=balance-amount;
            System.out.println("Balance remain:"+balance);
        }
    }
    void showBalance() {
        System.out.println("Balance for account " + accNo + ": " + (int)balance);
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;
        System.out.println("Enter the number of command");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("createAccount");
        System.out.println("deposit");
        System.out.println("withdraw");
        System.out.println("balance");
        System.out.println("Enter choice");
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            switch (command) {
                case "createAccount":
                    System.out.println("Enter Account Number");
                    int accNo = sc.nextInt();
                    System.out.println("Enter account holder name");
                    String name = sc.next();
                    System.out.println("enter the balance");
                    double bal = sc.nextDouble();
                    account = new BankAccount(accNo, name, bal);
                    account.deposit(bal);
                    account.showBalance();

                    break;
                case "deposit":
                    System.out.println("Enter account number");
                    sc.nextInt();
                    account.deposit(sc.nextDouble());
                    break;
                case "withdraw":
                    System.out.println("Enter account number");
                    sc.nextInt();
                    account.withdraw(sc.nextDouble());
                    break;
                case "balance":
                    System.out.println("Enter account number");
                    sc.nextInt();
                    account.showBalance();
                    break;
            }
        }
        sc.close();
    }
}

