package net.konic.oops;

class Fan {
    String brand;
    int speed;
    String color;
    
    void start() {
        System.out.println("Fan is starting...");
        System.out.println("brand : " + brand);
        System.out.println("color : " + color);
        System.out.println("speed : " + speed + " RPM");
    }
}

public class Fan1 {

    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.brand = "Crompton";
        f1.color = "Black";
        f1.speed = 1200;
        
        f1.start();
    }

}
