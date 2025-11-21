package net.konic.operators;
import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.next();

        System.out.print("Enter Password: ");
        String password = sc.next();

        // Logical Operator: &&
        if (username.equals("sahil") && password.equals("1234")) {
            System.out.println("Login Success!");
        } 
        else {
            System.out.println("Login Failed!");
        }
    }
}
