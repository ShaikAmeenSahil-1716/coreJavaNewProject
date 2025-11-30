package net.konic.methods;

import java.util.Scanner;

public class TemperatureConverter {

    double celsius;   

    public void readTemperature() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double input = sc.nextDouble();   

        celsius = input;   
    }

    double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {

        TemperatureConverter tc = new TemperatureConverter();

        tc.readTemperature(); 

        double f = tc.toFahrenheit();  

        System.out.println("Temperature in Fahrenheit: " + f);
    }
}
