package net.konic.operators;
import java.util.Scanner;

public class FriedRiceBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter price of Fried Rice: ");
        double itemPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // Arithmetic operations
        double totalPrice = itemPrice * quantity;     // multiplication
        double tax = totalPrice * 0.05;               // 5% tax
        double finalBill = totalPrice + tax;          // addition
        
        // Output
        System.out.println("\n--- BILL DETAILS ---");
        System.out.println("Item: Fried Rice");
        System.out.println("Price per plate: " + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Tax (5%): " + tax);
        System.out.println("Final Bill: " + finalBill);
    }
}
