package net.konic.accessmodifier;

class Restaurant {

    static String restaurantName = "Food Paradise";

    String customerName;

    public Restaurant() {
        customerName = "Walk-in Customer";
    }

    public Restaurant(String name) {
        customerName = name;
    }

    private Restaurant(int internalCode) {
        System.out.println("Private Constructor Called Internally");
    }

    void orderFood(int choice) {

        switch (choice) {
            case 1:
                System.out.println("Added: Pizza (₹200)");
                break;

            case 2:
                System.out.println("Added: Burger (₹120)");
                break;

            case 3:
                System.out.println("Added: Pasta (₹150)");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }


    public static void main(String[] args) {

        System.out.println("Welcome to: " + Restaurant.restaurantName);

        Restaurant r1 = new Restaurant("Ameen Sahil");
        System.out.println("Customer: " + r1.customerName);
        r1.orderFood(1); 

        Restaurant r2 = new Restaurant();
        System.out.println("\nCustomer: " + r2.customerName);
        r2.orderFood(2); 

        Restaurant internal = new Restaurant(999);
    }
}
