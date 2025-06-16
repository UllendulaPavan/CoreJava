package com.programDay30_Apr;

public class Car implements Runnable{
	
     String name;
     PetrolPump p;
     
    
     
     public Car(String name,PetrolPump p) {
    	 this.name=name;
    	 this.p=p;
     }
	
	@Override
	public synchronized void run() {
		p.refillCar(name);
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}

}
