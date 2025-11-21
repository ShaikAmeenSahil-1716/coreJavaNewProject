package net.konic.operators;
public class PeopleInHall {
    public static void main(String[] args) {

        int people = 10;   // starting count

        // 3 people entered → use ++
        people++;   // 11
        people++;   // 12
        people++;   // 13

        // 2 people left → use --
        people--;   // 12
        people--;   // 11

        System.out.println("Final count of people in hall: " + people);
    }
}

