package net.konic.constructorstatics;

public class Car {

    static int carCount = 0;

	public static String carNames;

    String brand;

    Car(String brand) {
        this.brand = brand;
        carCount++;   
    }

    public static void main(String[] args) {

        Car c1 = new Car("BMW");
        Car c2 = new Car("Audi");
        Car c3 = new Car("Thar");

        System.out.println("Total Cars Sold: " + Car.carCount);
        System.out.println("Total Cars Sold: " + Car.carNames);
    }
}
