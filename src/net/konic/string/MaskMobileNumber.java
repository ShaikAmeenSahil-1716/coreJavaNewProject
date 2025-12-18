package net.konic.string;
public class MaskMobileNumber {

    public static void main(String[] args) {

        String mobile = "7092706032";

        String maskedMobile =
                mobile.substring(0, 2) + "****" + mobile.substring(8);

        System.out.println("Masked Mobile: " + maskedMobile);
    }
}
