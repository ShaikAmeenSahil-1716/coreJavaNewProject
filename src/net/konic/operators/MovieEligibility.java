package net.konic.operators;
import java.util.Scanner;

public class MovieEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Relational Operator: >=, <
        if (age >= 18) {
            System.out.println("Allowed to watch the movie!");
        } 
        else if (age >= 0 && age < 18) {
            System.out.println("Not Allowed to watch the movie!");
        } 
        else {
            System.out.println("Invalid Age!");
        }
    }
}

