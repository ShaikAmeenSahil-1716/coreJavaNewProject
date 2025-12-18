package net.konic.string;
public class AddressUpdate {

    public static void main(String[] args) {

        String address = "NO-13/57 Jan Mohammad Street";
        String city = "Chennai";

        StringBuffer fullAddress = new StringBuffer(address);

        fullAddress.append(" ").append(city);

        System.out.println("Updated Address: " + fullAddress);
    }
}
