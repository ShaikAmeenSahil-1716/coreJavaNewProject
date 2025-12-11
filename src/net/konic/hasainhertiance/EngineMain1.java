package net.konic.hasainhertiance;
class Engine {
    void startEngine() {
        System.out.println("Engine started");
    }
}

class Car {
    Engine engine = new Engine();  

    void move() {
        engine.startEngine();      
        System.out.println("Car is moving");
    }
}

public class EngineMain1 {
    public static void main(String[] args) {

        Car c = new Car();
        c.move();
    }
}
