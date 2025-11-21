package net.konic.operators;
import java.util.Scanner;

public class AssignmentPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // += operation
        number += 5;
        System.out.println("After number += 5  → " + number);

        // -= operation
        number -= 3;
        System.out.println("After number -= 3  → " + number);

        // *= operation
        number *= 2;
        System.out.println("After number *= 2  → " + number);

        // /= operation
        number /= 2;
        System.out.println("After number /= 2  → " + number);
    }
}
