package net.konic.oops;

import java.util.Scanner;

class CalculatorsProgram {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculators calc = new Calculators();

        System.out.print("Enter number A B: ");
        int a = sc.nextInt();

        System.out.print("Enter number A C: ");
        int b = sc.nextInt();

        System.out.print("Enter number A C: ");
        int c = sc.nextInt();

        System.out.println(" A & B ");
        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + (b != 0 ? calc.divide(a, b) : "Not possible"));

        System.out.println(" A & C ");
        System.out.println("Addition: " + calc.add(a, c));
        System.out.println("Subtraction: " + calc.subtract(a, c));
        System.out.println("Multiplication: " + calc.multiply(a, c));
        System.out.println("Division: " + (c != 0 ? calc.divide(a, c) : "Not possible"));

        System.out.println(" B & C ");
        System.out.println("Addition: " + calc.add(b, c));
        System.out.println("Subtraction: " + calc.subtract(b, c));
        System.out.println("Multiplication: " + calc.multiply(b, c));
        System.out.println("Division: " + (c != 0 ? calc.divide(b, c) : "Not possible"));

        sc.close();
    }
}
