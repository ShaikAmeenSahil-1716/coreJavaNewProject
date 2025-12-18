package net.konic.string;
public class StringConstantPoolCheck {

    public static void main(String[] args) {

        String a = "Hotel";
        String b = "Hotel";

        if (a == b) {
            System.out.println("Is Same");
        } else {
            System.out.println("Is Different ");
        }
    }
}
