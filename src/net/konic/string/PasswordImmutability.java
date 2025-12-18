package net.konic.string;
import java.util.Scanner;

public class PasswordImmutability {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Password: ");
        String password = sc.nextLine();

        password.concat("143");

        
        System.out.println("Password remains: " + password);

        sc.close();
    }
}
