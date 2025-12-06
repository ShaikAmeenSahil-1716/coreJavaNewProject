package net.konic.methods;
public class Assalawalikum {

    public String greet(String name) {
        return " Assalawalikum " + name + "Bhai";
    }

    public static void main(String[] args) {
    	Assalawalikum obj = new Assalawalikum();
        String message = obj.greet(" Nawaz ");
        System.out.println(message);
    }
}


