package net.konic.employer;
public class Main {
    public static void main(String[] args) {
        String name = "Wasif";
        int salary = 50000;
        String department = "IT";

        Manager manager = new Manager(name, salary, department);

        System.out.println("Name: " + manager.getName());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Department: " + manager.getDepartment());
    }
}
