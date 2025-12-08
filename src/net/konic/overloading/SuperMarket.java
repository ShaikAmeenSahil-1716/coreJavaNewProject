package net.konic.overloading;

class SuperMarket {

    void generateBill(int amount) {
        System.out.println("Final Bill: ₹" + amount);
    }

    void generateBill(int amount, int discount) {
        int finalAmount = amount - (amount * discount / 100);
        System.out.println("Final Bill after discount: ₹" + finalAmount);
    }

    void generateBill(int amount, int discount, int tax) {
        int priceAfterDiscount = amount - (amount * discount / 100);
        int finalAmount = priceAfterDiscount + (priceAfterDiscount * tax / 100);
        System.out.println("Final Bill: ₹" + finalAmount);
    }

    public static void main(String[] args) {
        SuperMarket sm = new SuperMarket();

        sm.generateBill(1000);
        sm.generateBill(1000, 10);
        sm.generateBill(1000, 10, 5);
    }
}
