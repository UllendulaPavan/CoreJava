package com.programDay29_Apr;

public class OlaRidingApp {

	public static void main(String[] args) throws InterruptedException  {
		
		
//		RideRequest rd =new RideRequest();
//		DriverAssignment da =new DriverAssignment();
//		FareCalculation fc =new FareCalculation();
//		LiveTracking lt =new LiveTracking();
//		PaymentProcessing pp= new PaymentProcessing();
//		RatingSystem rs =new RatingSystem();
//		
//		rd.start();   
//		fc.start();    
//		rd.join();      
//		
//		da.start();   
//		da.join();     
//		
//		lt.start();    
//		lt.join();
//		
//		pp.start();
//		pp.join();
//		
//		rs.start();
		
		//anonymous inner class
		
		Runnable rd=()->{
			System.out.println("User requested a ride...");
			try {
				Thread.sleep(2000);
				System.out.println("Searching for nearby drivers...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		};
		
		Runnable da =()->{
			 try {
				 Thread.sleep(3000);
				 System.out.println("Driver found and assigned!");
			 }
			 catch(InterruptedException e) {
				 e.printStackTrace();
			 }
		};
		
		Runnable fc =()->{
			System.out.println("Calculating estimated fare...");
			   try {
				   Thread.sleep(1500);
				   System.out.println("Estimated fare: 135.75 RS.");
			   }
			   catch(InterruptedException e) {
				   e.printStackTrace();
			   }
		};
		
		Runnable lt =()->{
			try {
				   for(int i=20;i<=100;) {
					   System.out.println("Updating ride location... "+i+"% completed");
					   Thread.sleep(1000);
					   i+=20;
				   }
				   System.out.println("Ride Completed");
			   }
			   catch(InterruptedException e) {
				   System.out.println(e);
			   }
		};
		
		Runnable pp=()->{
			System.out.println( "Processing payment...");
	    	 try {
	    		 Thread.sleep(2000);
	    		 System.out.println("Payment successful!");
	    	 }
	    	 catch(InterruptedException e) {
	    		 System.out.println(e);
	    	 }
		};
		
		Runnable rs=()->{
			System.out.println("Requesting user rating...");
			   try {
				   Thread.sleep(1000);
				   System.out.println("User rated the ride: 5 star");
			   }
			   catch(InterruptedException e) {
				   System.out.println(e);
			   }
		};
		Thread t1 = new Thread(rd);
        Thread t2 = new Thread(da);
        Thread t3 = new Thread(fc);
        Thread t4 = new Thread(lt);
        Thread t5 = new Thread(pp);
        Thread t6 = new Thread(rs);
        
        t1.start();
        t3.start();
        t1.join();
        
        t2.start();
        t2.join();
		
        t4.start();
        t4.join();
		   
        t5.start();
        t5.join();
        
        t6.start();
        
		
		
		
	}

}
