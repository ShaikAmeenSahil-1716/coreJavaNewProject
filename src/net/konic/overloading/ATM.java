package net.konic.overloading;

class ATM {

    void withdraw(int amount) {
        System.out.println("Withdrawn ₹" + amount);
    }

    void withdraw(double amount) {
        System.out.println("Withdrawn ₹" + amount);
    }

    void withdraw(int amount, String accType) {
        System.out.println("Withdrawn ₹" + amount + " from " + accType + " Account");
    }

    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.withdraw(500);
        atm.withdraw(500.75);
        atm.withdraw(1000, "Current");
    }
}
