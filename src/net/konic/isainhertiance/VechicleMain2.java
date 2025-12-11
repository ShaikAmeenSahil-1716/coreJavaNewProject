package net.konic.isainhertiance;

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with kick");
    }
}

public class VechicleMain2 {
    public static void main(String[] args) {

        Car c = new Car();
        c.start();

        Bike b = new Bike();
        b.start();
    }
}
