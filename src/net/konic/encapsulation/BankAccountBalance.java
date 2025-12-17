package net.konic.encapsulation;

import java.util.Scanner;

class BankAccount {

    // 1. private variable
    private double balance;

    // 2. setter method
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    // 3. getter method
    public double getBalance() {
        return balance;
    }
}

public class BankAccountBalance {

    public static void main(String[] args) {

        // 4. Scanner for input
        Scanner sc = new Scanner(System.in);

        // 5. Create object
        BankAccount acc = new BankAccount();

        // 6. Take input
        System.out.print("Enter Balance: ");
        double amount = sc.nextDouble();

        // 7. Set balance
        acc.setBalance(amount);

        // 8. Display balance
        System.out.println("Balance is: " + acc.getBalance());
    }
}
