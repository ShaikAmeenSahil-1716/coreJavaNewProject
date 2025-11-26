package net.konic.oops;

import java.util.Scanner;

class Calculators {

    static int add(int a, int b ) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(int a, int b) {
        return (double) a / b;
    }

    static int add1(int a, int c) {
        return a + c;
    }
    
    static int subtract1(int a, int c) {
        return a - c;
    }

    static int multiply1(int a, int c) {
        return a * c;
    }

    static double divide1(int a, int c) {
        return (double) a / c;
    }
    
    static int add2(int b, int c) {
        return b + c;
    }
    
    static int subtract2(int b, int c) {
        return b - c;
    }
    
    static int multiply2(int b, int c) {
        return b * c;
    }
    
    static double divide2(int b, int c) {
        return (double) b / c;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number A B: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number A C: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter first number B C: ");
        int num3 = sc.nextInt();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Addition: " + add(num2, num2));
        System.out.println("Subtraction: " + subtract(num1, num2) );
        System.out.println("Multiplication: " + multiply(num1, num2));
        
        System.out.println("Addition: " + add(num1, num3));
        System.out.println("Addition: " + add(num1, num3));
        System.out.println("Subtraction: " + subtract(num1, num3) );
        System.out.println("Multiplication: " + multiply(num1, num3));
        
        System.out.println("Addition: " + add(num2, num3));
        System.out.println("Addition: " + add(num2, num3));
        System.out.println("Subtraction: " + subtract(num2, num3) );
        System.out.println("Multiplication: " + multiply(num2, num3));

        if (num2 != 0) {
            System.out.println("Division: " + divide(num1, num2));
        } else {
            System.out.println("Division: Not possible");
        }

        sc.close();
    }
    
   }
