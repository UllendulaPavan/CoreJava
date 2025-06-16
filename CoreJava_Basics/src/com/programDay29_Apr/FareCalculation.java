package com.programDay29_Apr;

public class FareCalculation extends Thread {
   @Override
   public void run(){
	   System.out.println("Calculating estimated fare...");
	   try {
		   Thread.sleep(1500);
		   System.out.println("Estimated fare: 135.75 RS.");
	   }
	   catch(InterruptedException e) {
		   e.printStackTrace();
	   }
   }
}
