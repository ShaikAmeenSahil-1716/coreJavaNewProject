package net.konic.overloading;

class Ride {

    void bookRide(String from, String to) {
        System.out.println("Ride booked from " + from + " to " + to);
    }

    void bookRide(String from, String to, String carType) {
        System.out.println(carType + " ride booked from " + from + " to " + to);
    }

    void bookRide(String from, String to, int passengers) {
        System.out.println("Ride booked for " + passengers + " passengers from " + from + " to " + to);
    }

    public static void main(String[] args) {
        Ride r = new Ride();

        r.bookRide("Chennai", "Nellore");
        r.bookRide("Chennai", "Nellore", "THAR");
        r.bookRide("Chennai", "Nellore", 4);
    }
}
