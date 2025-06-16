package com.programDay29_Apr;

public class RatingSystem extends Thread {
   @Override
   public void run() {
	   System.out.println("Requesting user rating...");
	   try {
		   Thread.sleep(1000);
		   System.out.println("User rated the ride: 5 star");
	   }
	   catch(InterruptedException e) {
		   System.out.println(e);
	   }
   }
}
