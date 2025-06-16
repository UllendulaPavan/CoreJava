package com.programDay30_Apr;

import java.util.Arrays;

public class PetrolPumpSimulation {

	public static void main(String[] args) {
		PetrolPump petrol = new PetrolPump();
		Car ford =new Car("ford",petrol);
		Car Naxon =new Car("Naxon",petrol);
		Car Maruti =new Car("Maruti",petrol);
		
		Car []pump = {ford,Naxon,Maruti};
		
		
		Thread [] thread = {new Thread(ford),new Thread(Naxon),new Thread(Maruti)};
		
		/*for(Thread t: thread) {
			t.start();
			
		}*/
		   for(int i=0;i<thread.length;i++) {
			   
			   System.out.println(pump[i]);
			   try {
				//Thread.sleep(2000);
				thread[i].start();
				thread[i].join();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			    
			    
			    
		   }

	}

}
