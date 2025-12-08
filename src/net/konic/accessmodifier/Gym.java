package net.konic.accessmodifier;

class Gym {

    static String gymName = "Power Gym";

    String name;
    int age;

    public Gym(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Gym() {
    }

    void chooseMembership(int choice) {

        switch (choice) {

            case 1:
                System.out.println("Selected: Monthly Plan (₹500)");
                break;

            case 2:
                System.out.println("Selected: Quarterly Plan (₹1200)");
                break;

            case 3:
                System.out.println("Selected: Yearly Plan (₹4000)");
                break;

            default:
                System.out.println("Invalid Choice!");
        }
    }

    public static void main(String[] args) {

        Gym g1 = new Gym("Ameen", 22);

        int choice = 1; 
        g1.chooseMembership(choice);
    }
}
