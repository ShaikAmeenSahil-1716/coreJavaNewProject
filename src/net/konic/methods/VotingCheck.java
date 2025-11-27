package net.konic.methods;

public class VotingCheck {

    boolean isEligible(int age) {
        if(age >= 18) {
            return true;     
        } else {
            return false;    
        }
    }
}
 