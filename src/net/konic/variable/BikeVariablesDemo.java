package net.konic.variable;
public class BikeVariablesDemo {
    public static void main(String[] args) {
        String brand = "ROYAL ENFIELD";
        
        String model = "HUNTER 350";
        
        int year = 2025;
        
        double price = 215000.50;          
        boolean isNew = true;
        
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: ₹" + price);
        System.out.println("Is the Bike new? " + isNew);
        
        double  amount = 88000; 
        double finalPrice = price +  amount;
        System.out.println("Final Price after amount: ₹" + finalPrice);
    }
}
