package net.konic.isainhertiance;
class BankLoan {
    void calculateEMI() {
        System.out.println("Calculating EMI...");
    }
}

class HomeLoan extends BankLoan {
    @Override
    void calculateEMI() {
        System.out.println("Calculating EMI for Home Loan");
    }
}

class CarLoan extends BankLoan {
    @Override
    void calculateEMI() {
        System.out.println("Calculating EMI for Car Loan");
    }
}

public class LoanMain4 {
    public static void main(String[] args) {

        HomeLoan hl = new HomeLoan();
        hl.calculateEMI();

        CarLoan cl = new CarLoan();
        cl.calculateEMI();
    }
}
