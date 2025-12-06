package net.konic.staticsvsnonstatic;

class Hotel {

    static String hotelName = "Taj Hotel";

    int roomNumber;

    public static void main(String[] args) {

        System.out.println("Hotel Name: " + Hotel.hotelName);

        Hotel h1 = new Hotel();
        h1.roomNumber = 101;
        System.out.println("Room Number (Object 1): " + h1.roomNumber);

    }
}
