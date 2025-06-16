package com.programday29_7mar;

public class Vehicle {
	
   protected String make;
   protected String model;
   protected int year;

   public Vehicle(String make, String model, int year){
    this.make=make;
    this.model=model;
    this.year=year;
   }

   public void displayDetails(){
     
       System.out.println("Make: "+make);
       System.out.println("Model: "+model);
       System.out.println("year: "+year);

   }
}
class Car extends Vehicle
{
    protected String numberOfDoors;

    public Car(String make, String model, int year, String type){
         super(make,model,year);
         this.numberOfDoors=type;
    }

    public void displayDetails(){
        System.out.println("Number of Doors: "+numberOfDoors);
    }
}

class Bike extends Car
{
    public Bike(String make, String model, int year, String type) {
		super(make, model, year, type);
		// TODO Auto-generated constructor stub
	}

	protected String type;



   public void displayDetails(){
    System.out.println("  Type: "+type);
   }



//public class VehicleTest  {
    public static void main(String[] args) 
   {
		Car car = new Car(null, null, 0, null);
               System.out.println("Car Details:");
               car.displayDetails();

               Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports");
               System.out.println("\nBike Details:");
               bike.displayDetails();    
    }
}


