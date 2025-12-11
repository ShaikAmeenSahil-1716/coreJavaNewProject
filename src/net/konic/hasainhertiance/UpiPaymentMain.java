package net.konic.hasainhertiance;
class PaymentDetails {
    String method;
    double amount;
}

class Order {
    PaymentDetails payment;   

    void displaySummary() {
        System.out.println("Order Placed Successfully");
        System.out.println("Payment Method: " + payment.method);
        System.out.println("Amount: " + payment.amount);
    }
}

public class UpiPaymentMain {
    public static void main(String[] args) {

        PaymentDetails pd = new PaymentDetails();
        pd.method = "UPI";
        pd.amount = 550.00;

        Order o = new Order();
        o.payment = pd;

        o.displaySummary();
    }
}
