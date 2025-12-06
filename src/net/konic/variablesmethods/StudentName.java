package net.konic.variablesmethods;

import java.util.Scanner;

public class StudentName {

    String firstName;   
    String lastName;    

    void readNames() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        firstName = sc.nextLine();  

        System.out.print("Enter last name: ");
        lastName = sc.nextLine();    
    }

    String fullName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] parameter) {

        StudentName s = new StudentName();   
        
        s.readNames();                       
        
        String name = s.fullName();          
        
        System.out.println("Full Name: " + name);   
    }
}
