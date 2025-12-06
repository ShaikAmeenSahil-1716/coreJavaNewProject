package net.konic.accessmodifier;

class Recharge {

    static void showOperator() {
        System.out.println("Operator: Jio");
    }

    String mobileNumber;

    public Recharge(String number) {
        this.mobileNumber = number;
    }

    private Recharge() {
        System.out.println("Private constructor called internally.");
    }

    void choosePlan(int planCode) {

        switch (planCode) {

            case 1:
                System.out.println("1.5GB/day – 28 days");
                break;

            case 2:
                System.out.println("2GB/day – 28 days");
                break;

            case 3:
                System.out.println("2GB/day – 56 days");
                break;

            case 4:
                System.out.println("3GB/day – 84 days");
                break;

            default:
                System.out.println("Invalid Plan Code");
        }
    }

    public static void main(String[] args) {

        Recharge.showOperator();

        Recharge r1 = new Recharge("7092706032");
        System.out.println("Mobile Number: " + r1.mobileNumber);

        r1.choosePlan(2);

        Recharge internal = new Recharge();
    }
}
