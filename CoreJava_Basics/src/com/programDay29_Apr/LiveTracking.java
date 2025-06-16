package com.programDay29_Apr;

public class LiveTracking extends Thread{
   @Override
   public void run() {
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
   }
}
