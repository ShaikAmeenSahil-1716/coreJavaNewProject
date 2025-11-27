package net.konic.methods;
public class SahilFullNamePrinter {

    void printFullName(String firstName, String middleName, String lastName) {  
        System.out.println("Full Name: " + firstName + middleName + lastName);
    }

    public static void main(String[] args) {
        SahilFullNamePrinter obj = new SahilFullNamePrinter(); 
        obj.printFullName(" Shaik "," Ameen Nawaz ", " Sahil ");  
    }
}
