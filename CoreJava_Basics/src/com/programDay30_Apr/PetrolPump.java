package com.programDay30_Apr;

public class PetrolPump {
    
	public synchronized void refillCar(String carName) {
		try {
			
			Thread.sleep(1000);
			System.out.println("<"+carName+"> started refilling... ");
			Thread.sleep(2000);
			System.out.println("<"+carName+"> completed refilling!.");
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}


	
	
	
}
