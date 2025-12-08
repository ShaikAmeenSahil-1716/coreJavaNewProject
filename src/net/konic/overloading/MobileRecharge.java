package net.konic.overloading;

class MobileRecharge {

    void recharge(long mobile) {
        System.out.println("Recharge successful for " + mobile);
    }

    void recharge(long mobile, int plan) {
        System.out.println("Recharge ₹" + plan + " successful");
    }

    void recharge(long mobile, int plan, String coupon) {
        System.out.println("Recharge ₹" + plan + " with coupon " + coupon + " applied");
    }

    public static void main(String[] args) {
        MobileRecharge r = new MobileRecharge();

        r.recharge(90000L);
        r.recharge(90000L, 299);
        r.recharge(90000L, 299, "NEW50");
    }
}
