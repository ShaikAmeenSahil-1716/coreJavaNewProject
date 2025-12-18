package net.konic.string;
public class DeleteLastDigitOTP {

    public static void main(String[] args) {

        String otp = "7861530";

        StringBuffer sb = new StringBuffer(otp);

        sb.deleteCharAt(sb.length() - 4);

        System.out.println("Updated OTP: " + sb);
    }
}
