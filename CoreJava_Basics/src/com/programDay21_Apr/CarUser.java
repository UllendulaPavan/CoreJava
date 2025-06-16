package com.programDay21_Apr;

class CarStoppedException extends Exception{
	public CarStoppedException() {
		//no argurment contructor
	}
	public CarStoppedException(String str) {
		super(str);
	}
}

class CarPunctureException extends Exception{
    public CarPunctureException() {
		
	}
	public CarPunctureException(String str) {
		super(str);
	}
}

class CarHeatException extends Exception{
    public CarHeatException() {
		
	}
	public CarHeatException(String str) {
		super(str);
	}
}

class CarTest{
	
	public static void Stop(String stopes) throws CarStoppedException
	{
		if(stopes.equals("stop")) {
			throw new CarStoppedException("Car stopped for some reason.");
		}
		else if(stopes.equals("go")){
			System.out.println("Car not stalled.");
		}
		
	}
	
	public static void puncture(String tairs) throws CarPunctureException
	{
		if(tairs.equals("puncture")) {
			throw new CarPunctureException("Car is punctured.");
		}
		else if(tairs.equals("move")) {
			System.out.println("Car not punctured.");
		}
		
	}
	
	public static void carHeat(int degrees) throws CarHeatException
	{
		if(degrees>50) {
			throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
		}
		else if(degrees<50) {
			System.out.println("Car temperature normal.");
		}
			
    }
	
}


public class CarUser {

	public static void main(String[] args) {
		
		try {
			CarTest.Stop("go");
			CarTest.puncture("move");
			CarTest.carHeat(40);
		}
		catch(CarStoppedException e) {
			System.err.println(e);
		}
        catch(CarPunctureException e) {
        	System.err.println(e);
		}
        catch(CarHeatException e) {
        	System.err.println(e);
		}
		

	}

}
