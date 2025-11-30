package net.konic.variablesmethods;

import java.util.Scanner;

public class Product {

    double price;   

    void readPrice() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product price: ");
        price = sc.nextDouble();
    }

    double getDiscount() {
        return price - (price * 0.10);
    }

    public static void main(String[] parameter) {

        Product p = new Product();

        p.readPrice();

        double finalAmount = p.getDiscount();

        System.out.println("Final Price After Discount = " + finalAmount);
    }
}
