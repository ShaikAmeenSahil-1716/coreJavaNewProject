package net.konic.accessmodifier;
class Cart {

    static String websiteName = "FlipKart Online Store";

    String customerName;

    public Cart(String name) {
        this.customerName = name;
    }

    private Cart() {
        System.out.println("Internal Log: Private constructor called");
    }

    public void addItem(int itemId) {

        switch (itemId) {

            case 1:
                System.out.println("Added: Shoes (₹1500)");
                break;

            case 2:
                System.out.println("Added: T-Shirt (₹700)");
                break;

            case 3:
                System.out.println("Added: Headphones (₹1200)");
                break;

            case 4:
                System.out.println("Added: Watch (₹2000)");
                break;

            default:
                System.out.println("Invalid Item ID");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Cart c = new Cart("Ameen");

        System.out.println("Welcome to " + Cart.websiteName);

        int itemId = 1;   
        c.addItem(itemId);
    }
}
