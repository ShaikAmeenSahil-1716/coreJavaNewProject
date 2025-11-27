package net.konic.oopsbasic;

 public class Voting {

    public boolean  age(int age) {
    	
    	
    	    if (age >= 18) {
             System.out.println("Eligible for Voting");
             return true;    
         } else {
             System.out.println("Not Eligible for Voting");
             return false;   
         }
     }
 }
