package net.konic.operators;
import java.util.Scanner;

public class StudentResult1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sahil's Marks: ");
        int marks = sc.nextInt();

        if (marks >= 80 && marks <= 100) {
            System.out.println("Sahil is PASS");
            System.out.println("Grade: A");
        }
        else if (marks >= 65 && marks < 80) {
            System.out.println("Sahil is PASS");
            System.out.println("Grade: B");
        }
        else if (marks >= 35 && marks < 65) {
            System.out.println("Sahil is PASS");
            System.out.println("Grade: C");
        }
        else if (marks >= 0 && marks < 35) {
            System.out.println("Sahil is FAIL");
            System.out.println("Grade: F");
        }
        else {
            System.out.println("Invalid Marks!");
        }
    }
}
