package com.programDay06_may;

public class CarParkingProject {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to D-Mart Parking");
//		ParkingGarage p =new ParkingGarage(5, 5);
//		String[]cars = {"Maruti Brezza","Tata Naxon","Mahindra BE6","Kia Seltos","Honda city","Toyota Fortuner","Hundai i20"};
//		Thread[]arr=new Thread[cars.length];
//		
//		for (int i=0;i<cars.length;i++) {
//			Car  c=new Car(p, cars[i]);
//			 arr[i] =new Thread(c);
//			arr[i].start();
//		}
//		
//		for (Thread thread : arr) {
//			try {
//				thread.join();
//			} catch (InterruptedException e) {
//				
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Parking garage simulation is complete.");
		
		ParkingGarage garage =new ParkingGarage(5,5);
		
		Thread car1 = new Thread(new Car(garage, "Maruti Brezza"));

        Thread car2 = new Thread(new Car(garage, "Tata Naxon"));

        Thread car3 = new Thread(new Car(garage, "Kia Seltos"));

        Thread car4 = new Thread(new Car(garage, "Mahindra BE6"));

        Thread car5 = new Thread(new Car(garage, "Toyota Fortuner"));

        Thread car6 = new Thread(new Car(garage, "Hundai i20"));

        Thread car7 = new Thread(new Car(garage, "Honda city"));

        car1.start();

        car2.start();

        car3.start();

        car4.start();

        car5.start();

        car6.start();

        car7.start();
       
        try
        {
            car1.join();
            car2.join();
            car3.join();
            car4.join();
            car5.join();
            car6.join();
            car7.join();
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("Parking garage simulation is complete.");


	}

}
