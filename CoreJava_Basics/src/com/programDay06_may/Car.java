package com.programDay06_may;

public class Car implements Runnable{
	
	private ParkingGarage garage;
	private String carName;
	
	public Car(ParkingGarage garage, String carName) {
		super();
		this.garage = garage;
		this.carName = carName;
	}

	@Override
	public void run() {
		
		try {
			garage.parkCar(carName);
			Thread.sleep(2000);
			garage.freeSpot(carName);
		}
		catch(InterruptedException e) {
			System.out.println(e);
			
		}
		
	}

}
