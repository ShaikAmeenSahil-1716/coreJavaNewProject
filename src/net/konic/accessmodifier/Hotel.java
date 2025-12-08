package net.konic.accessmodifier;

public class Hotel {
    String print(String a, String b) {
        System.out.println(a);
        System.out.println(b);
        return a + " " + b;
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        String result = hotel.print("Novotel", "Taj");
        System.out.println("Returned: " + result);
    }
}  
