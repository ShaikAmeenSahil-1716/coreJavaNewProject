package net.konic.operators;
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Option:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = sc.nextInt();   // no string used

        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();   // only number

        double result;

        if (choice == 1) {
            result = (temp * 9/5) + 32;
            System.out.println("Fahrenheit: " + result);
        } 
        else if (choice == 2) {

        	result = (temp - 32) * 5/9;
            System.out.println("Celsius: " + result);
        } 
        else {
            System.out.println("Invalid Choice!");
        }
    }
}
