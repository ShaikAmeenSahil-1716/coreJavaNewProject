package net.konic.accessmodifier;

class MovieBooking {

    int ticketPrice;

    String userName;

    public MovieBooking(String name) {
        this.userName = name;
    }

    static void showTheatre() {
        System.out.println("Theatre: INOX Cinema");
    }

    void chooseMovie(int option) {

        switch (option) {

            case 1:
                ticketPrice = 200;
                System.out.println("Booked: Pushpa (₹" + ticketPrice + ")");
                break;

            case 2:
                ticketPrice = 250;
                System.out.println("Booked: Jab Tak Haa Jaan (₹" + ticketPrice + ")");
                break;

            case 3:
                ticketPrice = 300;
                System.out.println("Booked: Bigil (₹" + ticketPrice + ")");
                break;

            default:
                System.out.println("Invalid Movie Option");
        }
    }


    public static void main(String[] args) {

        MovieBooking.showTheatre();

        MovieBooking mb = new MovieBooking("Ameen Sahil");
        System.out.println("User: " + mb.userName);

        mb.chooseMovie(2);  
    }
}
