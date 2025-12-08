package net.konic.overloading;

class FoodDelivery {

    void order(String item) {
        System.out.println("Order placed: " + item + " (1 qty)");
    }

    void order(String item, int qty) {
        System.out.println("Order placed: " + item + " (" + qty + " qty)");
    }

    void order(String item, int qty, boolean spicy) {
        if (spicy) {
            System.out.println("Order placed: " + item + " (" + qty + " qty, Spicy)");
        } else {
            System.out.println("Order placed: " + item + " (" + qty + " qty, Not Spicy)");
        }
    }

    public static void main(String[] args) {
        FoodDelivery fd = new FoodDelivery();

        fd.order("Biryani");
        fd.order("Biryani", 2);
        fd.order("Biryani", 2, true);
    }
}
