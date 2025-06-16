package com.programDay06_may;

public class CoronaVaccineApp {

	public static void main(String[] args) {
		
		VaccineEligibility v =new VaccineEligibility(17, true);
		
		User u1 =new User("dheeraj",19,true);
		User u2 =new User("Shiva reddy", 16,false);
		
		Thread t1 =new Thread( ()->{
			try {
				u1.bookDose();
			}
			catch(RuntimeException e) {
				System.out.println(e);
			}
		});
		
         Thread t2 =new Thread( ()->{
        	 try {
 				u2.bookDose();
 			}
 			catch(RuntimeException e) {
 				System.out.println(e);
 			}
		});
         
         t1.start();
         t2.start();
         
         try {
        	 t1.join();
        	 t2.join();
         }
         catch(InterruptedException e) {
        	 System.out.println(e);
         }
	}

}
