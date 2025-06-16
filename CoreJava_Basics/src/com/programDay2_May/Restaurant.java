package com.programDay2_May;

public class Restaurant {
	
	String name;
	String order; 
	boolean isOrderReady = false;
	
	public Restaurant(String name, String order, boolean isOrderReady) {
		super();
		this.name = name;
		this.order = order;
		this.isOrderReady = isOrderReady;
	}
	
    public synchronized void placeOrder(String order) {
    	System.out.println("Welcome to "+name);
    	System.out.println("Waiter: Placed order for "+this.order+"");
    	
    	while(!isOrderReady) { 
    	try {
             wait();
    	}
    	catch(InterruptedException e) {
    		System.out.println(e);
    	}
    	System.out.println("Waiter: Serving the "+this.order+"");
    	}
    }
    
     public synchronized void placeOrder()  {
    	 
    	 System.out.println("Chef: Preparing "+order+"");
    	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 System.out.println("Chef: "+order+" is ready!");
		 notify();
    	
    }
     
     public String getRestaurantName() {
    	 return this.name;
     }
}
