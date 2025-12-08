package net.konic.overloading;

class LoginSystem {

    void login(String username, String password) {
        System.out.println("Login success using Username & Password");
    }

    void login(long mobile, int otp) {
        System.out.println("Login success using Mobile OTP");
    }

    public static void main(String[] args) {
        LoginSystem ls = new LoginSystem();

        ls.login("shiraz", "pass123");
        ls.login(9000000000L, 1234);
    }
}
