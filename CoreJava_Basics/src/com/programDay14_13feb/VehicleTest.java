package com.programDay14_13feb;



public class VehicleTest  {
    public static void main(String[] args) 
   {
		Car car = new Car("Audi", "Q8", 2021, 4);
               System.out.println("Car Details:");
               car.displayDetails();

               Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports");
               System.out.println("\nBike Details:");
               bike.displayDetails();    
    }
}
class Vehicle 
{
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
    protected int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors){
         super(make,model,year);
         this.numberOfDoors=numberOfDoors;
    }

    public void displayDetails(){
        System.out.println("Number of Doors: "+numberOfDoors);
    }
}

class Bike extends Vehicle
{
    protected String type;

public Bike(String make, String model, int year, String type){
    super(make,model,year);
    this.type=type;
   }

   public void displayDetails(){
    System.out.println("  Type: "+type);
   }

}