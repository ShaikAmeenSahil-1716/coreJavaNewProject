package net.konic.variablesmethods;

import java.util.Scanner;

public class Calculator {

    int num1;   
    int num2;   
    void readInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();   

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();   
    }

    int add() {
        return num1 + num2;
    }

    public static void main(String[] parameater) {

        Calculator c = new Calculator();  
        
        c.readInput();                     
        
        int result = c.add();              
        
        System.out.println("Sum = " + result);   
    }
}
