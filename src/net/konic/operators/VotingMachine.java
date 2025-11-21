package net.konic.operators;

public class VotingMachine {
    public static void main(String[] args) {

        int votes = 0;   // starting votes

        // Add 5 votes using ++
        votes++;   // 1
        votes++;   // 2
        votes++;   // 3
        votes++;   // 4
        votes++;   // 5

        System.out.println("Final Votes Count: " + votes);
    }
}
