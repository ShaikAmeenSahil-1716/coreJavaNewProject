package net.konic.loops;
public class OddNumber {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {
            if (i == 2||i==4 ||i==6 ||i==8 ||i==10) {
                continue; 
                
            }
            System.out.println(i);
            
        }
    }
}