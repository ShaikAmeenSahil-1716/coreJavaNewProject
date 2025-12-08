package net.konic.overloading;

class Shopping {

    void addToCart(int itemId) {
        System.out.println("Product " + itemId + " added to cart");
    }

    void addToCart(int itemId, int qty) {
        System.out.println("Product " + itemId + " added with quantity " + qty);
    }

    void addToCart(String itemName) {
        System.out.println(itemName + " added to cart");
    }

    public static void main(String[] args) {
        Shopping s = new Shopping();

        s.addToCart(101);
        s.addToCart(101, 3);
        s.addToCart("Earphones");
    }
}
