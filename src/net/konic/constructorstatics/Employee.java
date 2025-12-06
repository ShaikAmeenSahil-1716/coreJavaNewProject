package net.konic.constructorstatics;

public class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double yearlySalary() {
        return salary * 12;
    }

    void display() {
        System.out.println("Employee: " + name);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Yearly Salary: " + yearlySalary());
    }

    public static void main(String[] args) {

        Employee e = new Employee("Ameen", 300000);

        e.display();
    }
}
