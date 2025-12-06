package net.konic.constructorstatics;
class MobileRecharge {

    String mobileNumber;   

    MobileRecharge(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    static String getPlan(int amount) {

        if(amount == 199) {
            return "1.5GB/day, 28 days";
        } else if(amount == 299) {
            return "2GB/day, 28 days";
        } else if(amount == 499) {
            return "3GB/day, 56 days";
        } else {
            return "Invalid Amount";
        }
    }

    void printRecharge(String planDetails) {
        System.out.println("Recharge Successful: " + planDetails);
    }
}

public class MobilePhone {
    public static void main(String[] args) {

        MobileRecharge user = new MobileRecharge("709270632");

        String plan = MobileRecharge.getPlan(199);

        user.printRecharge(plan);  
    }
}
