package net.konic.constructorstatics;

public class Student {

    static String collegeName = "Default College";

    String name;
    int rollNo;
    String Branch;

    Student(String name, int rollNo, String Branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.Branch = Branch;
    }

    static void changeCollege(String newCollege) {
        collegeName = newCollege;
    }

    void display() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Student: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + Branch);
    }

    public static void main(String[] args) {

        Student.changeCollege("Narayana");

        Student s = new Student("Arshiya", 12, "CSE");

        s.display();
    }
}
