package net.konic.string;
import java.util.Scanner;

public class StringModificationWithReassignment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Message: ");
        String message = sc.nextLine();

        message = message.concat(" Sahil");

        System.out.println("Updated Message: " + message);

        sc.close();
    }
}
