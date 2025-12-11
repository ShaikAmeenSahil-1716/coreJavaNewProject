package net.konic.hasainhertiance;
import java.util.Scanner;

class Address {
    String city;
    int pincode;
}

class Student {
    String name;
    Address address;   
}

public class StudentAddressMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        s.address = new Address();  

        System.out.print("Enter Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter City: ");
        s.address.city = sc.nextLine();

        System.out.print("Enter Pincode: ");
        s.address.pincode = sc.nextInt();

        System.out.println("Student: " + s.name);
        System.out.println("Address: " + s.address.city + " - " + s.address.pincode);
    }
}
