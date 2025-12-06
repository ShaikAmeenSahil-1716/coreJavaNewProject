package net.konic.constructorstatics;
class TrainTicket {

    String passenger;           
    static int fare = 5400;     
    static String company = "IRCTC";  

    TrainTicket(String passenger) {
        this.passenger = passenger;
    }

    void printTicket() {
        System.out.println("Passenger: " + passenger);
        System.out.println("Ticket Fare: " + fare);
        System.out.println("Company: " + company);
    }
}

public class Irctc {
    public static void main(String[] args) {

        TrainTicket t1 = new TrainTicket("Nawaz");

        t1.printTicket();
    }
}
