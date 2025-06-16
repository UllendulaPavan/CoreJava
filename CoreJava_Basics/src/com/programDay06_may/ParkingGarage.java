package com.programDay06_may;

public class ParkingGarage {
	
	int availableSpots ; 
	final int MAX_SPOTS ;
	
	public ParkingGarage(int availableSpots, int mAX_SPOTS) {
		super();
		this.availableSpots = availableSpots;
		System.out.println("Total Available spots are :"+availableSpots);
		this.MAX_SPOTS = mAX_SPOTS;
	}
    
	

	public synchronized void parkCar(String carName) {
		while(this.availableSpots<=0) {
			try {
				System.out.println(carName+"is waiting for a spot.");
				wait();
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}	
		}
		this.availableSpots-=1;
		System.out.println(carName+"parked. Available spots:"+availableSpots);
		notify();
	}
	
	public synchronized void freeSpot(String carName) {
		if(this.availableSpots==this.MAX_SPOTS) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		this.availableSpots+=1;
		System.out.println(carName+"left. Available spots: "+availableSpots);
		notify();
		
	}

	
	public int getAvailableSpots() {
		return availableSpots;
	}

	
	
	

}
