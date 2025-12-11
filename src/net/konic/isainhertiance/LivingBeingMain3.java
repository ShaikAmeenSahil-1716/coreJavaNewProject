package net.konic.isainhertiance;
class LivingBeing {
    void breathe() {
        System.out.println("Breathing...");
    }
}

class Animal extends LivingBeing {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks...");
    }
}

public class LivingBeingMain3 {
    public static void main(String[] args) {

        LivingBeing lb = new LivingBeing();
        lb.breathe();

        Dog d = new Dog();
        d.sound();
    }
}
