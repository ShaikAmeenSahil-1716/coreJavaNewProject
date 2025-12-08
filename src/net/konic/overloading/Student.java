package net.konic.overloading;

class Student {

    void register(String name) {
        System.out.println("Registered: " + name);
    }

    void register(String name, int age) {
        System.out.println("Registered: " + name + ", Age: " + age);
    }

    void register(String name, int age, String city) {
        System.out.println("Registered: " + name + ", Age: " + age + ", City: " + city);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.register("Sahil");
        s.register("Sahil", 22);
        s.register("Sahil", 22, "Chennai");
    }
}
