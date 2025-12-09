package net.konic.overloading;

public class MarksCalculator {

    void calculateMarks(int m1) {
        System.out.println("Total Marks: " + m1);
    }

    void calculateMarks(int m1, int m2) {
        System.out.println("Total Marks: " + (m1 + m2));
    }

    void calculateMarks(int m1, int m2, int m3) {
        System.out.println("Total Marks: " + (m1 + m2 + m3));
    }

    public static void main(String[] args) {
        MarksCalculator mc = new MarksCalculator();

        mc.calculateMarks(80);
        mc.calculateMarks(80, 90);
        mc.calculateMarks(80, 90, 85);
    }
}
