package net.konic.corejava;


class Fan {
    String brand;
    int speed;
    
    void rotate() {
        System.out.println("Fan is rotating...");
        System.out.println("Fan brand : " + brand);
        System.out.println("Fan speed : " + speed + " RPM");
    }
}

class AC {
    String brand;
    String type;
    int temperature;
    
    Fan fan;
    
    void start() {
        System.out.println("AC is starting...");
        System.out.println("AC brand : " + brand);
        System.out.println("AC type : " + type);
        System.out.println("AC temperature : " + temperature + "°C");
        
        System.out.println();
        System.out.println("Now starting internal fan...");
        fan.rotate();
    }
}

public class AirConditionerFan {

    public static void main(String[] args) {
        
        Fan f1 = new Fan();
        f1.brand = "Crompton";
        f1.speed = 1200;
        
        AC ac1 = new AC();
        ac1.brand = "Blue Star";
        ac1.type = "Split";
        ac1.temperature = 24;
        
        ac1.fan = f1;
        
        ac1.start();
    }

}
