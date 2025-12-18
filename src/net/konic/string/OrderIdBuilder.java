package net.konic.string;
import java.util.Scanner;

public class OrderIdBuilder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        String base = sc.nextLine();

        System.out.print("Number: ");
        int number = sc.nextInt();

        StringBuilder orderId = new StringBuilder(base);
        orderId.append(number);

        System.out.println("Order ID: " + orderId);

        sc.close();
    }
}
