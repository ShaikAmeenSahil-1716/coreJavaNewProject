package net.konic.variablesmethods;

import java.util.Scanner;

public class EvenOddChecker {

    int number;   

    void readNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = sc.nextInt();   
    }

    boolean isEven() {
        return number % 2 == 0;
    }

    public static void main(String[] parameter) {

        EvenOddChecker obj = new EvenOddChecker();  

        obj.readNumber();   

        boolean result = obj.isEven();   

        if (result) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}
