package net.konic.variablesmethods;

public class StudentMarks {

    int marks;   

    void setMarks(int m) {
        marks = m;   
    }

    String checkResult() {
        if (marks >= 35) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] parameter) {

        StudentMarks s = new StudentMarks();   
        
        s.setMarks(45);   

        String result = s.checkResult();   

        System.out.println("Result: " + result);
    }
}
