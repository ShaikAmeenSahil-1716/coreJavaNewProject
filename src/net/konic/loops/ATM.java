package net.konic.loops;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== ATM MENU ====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter option: ");

            int option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Balance Checking...");
                    break;

                case 2:
                    System.out.println("Deposit Selected");
                    break;

                case 3:
                    System.out.println("Withdraw Selected");
                    break;

                case 4:
                    System.out.println("Exit… Thank You!");
                    break; 

                default:
                    System.out.println("Invalid Option!");
                    break;
            }

            if (option == 4) {
                break;   
            }
        }

        sc.close();
    }
}
