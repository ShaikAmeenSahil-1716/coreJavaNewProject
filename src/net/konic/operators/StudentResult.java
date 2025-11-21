package net.konic.operators;
import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sahil's Marks: ");
        int marks = sc.nextInt();

        // Relational + Logical Operators
        if (marks >= 35 && marks <= 100) {        // passing condition
            System.out.println("Sahil Is PASS. You Are The Best.");
        } 
        else if (marks < 35 && marks >= 0) {      // failing condition
            System.out.println("Sahil Is FAIL. You Can Do It.");
        }
        else {
            System.out.println("Invalid Marks!");
        }
    }
}

