package net.konic.variablesmethods;

import java.util.Scanner;

public class NameCheck {

    String fullName;

    void readFullName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        fullName = sc.nextLine();   
    }

    boolean isLongName() {
        if(fullName.length() > 10) {
            return true;
        } else {
            return false;
        }
    }
  public static void main(String[] parameter){
        NameCheck obj = new NameCheck();
        obj.readFullName();  

        boolean result = obj.isLongName();  

        System.out.println("Is long name? " + result);
    }
}
