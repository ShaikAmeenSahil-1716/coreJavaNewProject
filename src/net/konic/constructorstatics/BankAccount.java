package net.konic.constructorstatics;

public class BankAccount {

    static String bankName = "HDFC";

    int accountNo;
    String name;
    double balance;

    BankAccount(int acc, String nm) {
        accountNo = acc;
        name = nm;
        balance = 0;   
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void display() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account No: " + accountNo);
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount(1, "Nawaz");

        b.deposit(5000);

        b.display();
    }
}
