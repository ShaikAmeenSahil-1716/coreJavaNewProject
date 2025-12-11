package net.konic.isainhertiance;

import java.util.Scanner;

public class PersonEmployeeMain1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee1 emp = new Employee1();

        System.out.print("Enter Name: ");
        emp.name = sc.nextLine();

        System.out.print("Enter Age: ");
        emp.age = sc.nextInt();

        System.out.print("Enter Salary: ");
        emp.salary = sc.nextInt();

        System.out.println("Person: " + emp.name + " (" + emp.age + ")");
        System.out.println("Employee Salary: " + emp.salary);
    }
}
