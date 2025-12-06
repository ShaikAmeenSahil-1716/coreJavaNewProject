package net.konic.constructorstatics;

public class Product {

    String name;
    int price;

    Product() {
        name = "Unknown";
        price = 0;
    }

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name + ", Price: " + price);
    }

    public static void main(String[] args) {

        Product p1 = new Product("Phone", 20000);

        Product p2 = new Product();

        p1.display();
        p2.display();
    }
}
