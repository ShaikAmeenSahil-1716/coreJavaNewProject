package net.konic.loops;
public class ContinueSkipNegative {
    public static void main(String[] args) {

        int nums[] = {17, 16, 0, -17, -16, 0, 1716};

        for (int n : nums) {

            if (n < 0) {
                continue;   
            }

            System.out.print(n + " ");
        }
    }
}
