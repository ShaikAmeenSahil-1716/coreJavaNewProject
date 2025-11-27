package net.konic.oops;

import java.util.Scanner;

class CalculatorsPrograms{

    int add(int a, int b ) {
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

    int add1(int a, int c) {
        return a + c;
    }
    
    int subtract1(int a, int c) {
        return a - c;
    }

    int multiply1(int a, int c) {
        return a * c;
    }

    double divide1(int a, int c) {
        return (double) a / c;
    }
    
    int add2(int b, int c) {
        return b + c;
    }
    
    int subtract2(int b, int c) {
        return b - c;
    }
    
    int multiply2(int b, int c) {
        return b * c;
    }
    
    double divide2(int b, int c) {
        return (double) b / c;
    }
}

public class CalculatorsPrograms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculators calc = new Calculators();

        System.out.print("Enter first number A B: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number A C: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter first number B C: ");
        int num3 = sc.nextInt();

        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Addition: " + calc.add(num2, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));

        System.out.println("Addition: " + calc.add1(num1, num3));
        System.out.println("Addition: " + calc.add1(num1, num3));
        System.out.println("Subtraction: " + calc.subtract1(num1, num3));
        System.out.println("Multiplication: " + calc.multiply1(num1, num3));

        System.out.println("Addition: " + calc.add2(num2, num3));
        System.out.println("Addition: " + calc.add2(num2, num3));
        System.out.println("Subtraction: " + calc.subtract2(num2, num3));
        System.out.println("Multiplication: " + calc.multiply2(num2, num3));

        if (num2 != 0) {
            System.out.println("Division: " + calc.divide(num1, num2));
        } else {
            System.out.println("Division: Not possible");
        }

        sc.close();
    }
}
