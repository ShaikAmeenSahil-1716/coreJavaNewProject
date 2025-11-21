package net.konic.operators;
public class ParkingSlots {
    public static void main(String[] args) {

        int slots = 50;   // starting available slots

        // car parked → one slot used → decrement (--)
        slots--;   // 49

        // car exit → one slot freed → increment (++)
        slots++;   // back to 50

        System.out.println("Available Parking Slots: " + slots);
    }
}

