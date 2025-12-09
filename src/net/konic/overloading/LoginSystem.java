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

        ls.login("shaik", "pass123");
        ls.login(900L, 1234);
    }
}
