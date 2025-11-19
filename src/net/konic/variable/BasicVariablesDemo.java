package net.konic.variable;
public class BasicVariablesDemo {
    public static void main(String[] args) {
        
    	int numberOfLaptops =1;

        double laptopPrice =100000.50;

        String laptopModel = "Apple iPad";

        boolean isOnSale = true;


        System.out.println("Model: " + laptopModel);
        System.out.println("Number of laptops: " + numberOfLaptops);
        System.out.println("Price per laptop: ₹" + laptopPrice);
        System.out.println("Is it on sale? " + isOnSale);

        double totalCost = numberOfLaptops * laptopPrice;
        System.out.println("Total cost: ₹" + totalCost);
    }
}
