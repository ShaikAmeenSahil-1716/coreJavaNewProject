package net.konic.loops;
import java.util.Scanner;

public class OrderStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Order Status: ");
        String status = sc.next().toUpperCase();

        String message;

        switch (status) {
            case "PLACED":
                message = "Your order has been placed";
                break;

            case "PROCESSING":
                message = "Your order is being prepared";
                break;

            case "SHIPPED":
                message = "Your order is on the way";
                break;

            case "DELIVERED":
                message = "Your order has been delivered";
                break;

            case "CANCELLED":
                message = "Your order was cancelled";
                break;

            default:
                message = "Invalid order status";
        }

        System.out.println(message);
        sc.close();
    }
}
