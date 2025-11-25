package net.konic.oops;

class AC {
    String brand;
    String type;    
    int temperature;
    
    void start() {
        System.out.println("AC is starting...");
        System.out.println("brand : " + brand);
        System.out.println("type : " + type);
        System.out.println("temperature : " + temperature + "°C");
    }
}

public class AirConditioner {

    public static void main(String[] args) {
        AC ac1 = new AC();
        ac1.brand = "Blue Star";
        ac1.type = "Split";
        ac1.temperature = 24;
        
        ac1.start();
    }

}
