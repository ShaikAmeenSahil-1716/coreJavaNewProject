package net.konic.string;
public class EqualsVsDoubleEquals {

    public static void main(String[] args) {

        String username1 = "admin";
        String username2 = new String("admin");

        System.out.println("== result: " + (username1 == username2));

        System.out.println("equals result: " + username1.equals(username2));
    }
}
