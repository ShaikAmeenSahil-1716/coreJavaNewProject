package net.konic.string;
public class ReversePasswordSahil {

    public static void main(String[] args) {

        String password = "SAHIL";

        StringBuffer sb = new StringBuffer(password);

        sb.reverse();

        System.out.println("Reversed Password: " + sb);
    }
}
