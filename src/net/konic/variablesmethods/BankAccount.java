package net.konic.variablesmethods;

public class BankAccount {

    int balance;   

    void deposit(int amount) {
        balance = balance + amount;   
    }

    int getBalance() {
        return balance;
    }

    public static void main(String[] paramater) {

        BankAccount acc = new BankAccount();  

        acc.deposit(500);   

        int bal = acc.getBalance();   

        System.out.println("Current Balance: " + bal);
    }
}
