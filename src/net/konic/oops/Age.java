package net.konic.oops;

public class Age {
     public boolean age(int age) {
    	  
    	 if(age>=18) {
    		 System.out.println("age is 18 then true");
    		 return true;
    		 
    	 }else {
    		
		 return false;
    	 }
     }
     public static void main(String[] args) {
		Age age=new Age();
		age.age(20);
		
		
	}
}
