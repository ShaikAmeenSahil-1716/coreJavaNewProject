package net.konic.constructorstatics;
class ShoppingOrder {

    double price;        
    static double discount;  

    ShoppingOrder(double price) {
        this.price = price;
    }

    double applyDiscount() {
        return price * (1 - discount / 100);
    }
}

public class Main  { 
    public static void main(String[] args) {

        ShoppingOrder.discount = 10.0;  

        ShoppingOrder order1 = new ShoppingOrder(1000);

        double finalPrice = order1.applyDiscount();

        System.out.println("Final Price: " + finalPrice); 
    }
}
