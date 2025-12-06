package net.konic.variablesmethods;

public class Employee {

    String name;     
    double salary;   

    void setDetails(String n, double s) {
        name = n;
        salary = s;
    }

    double getYearlySalary() {
        return salary * 12;
    }

    public static void main(String[] parameter) {

        Employee e = new Employee();  

        e.setDetails("Ameen", 30000); 

        double yearly = e.getYearlySalary();  

        System.out.println("Yearly Salary: " + yearly);
    }
}
