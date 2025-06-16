package com.programDay05_jun;

import java.util.HashMap;

public class FruitInventoryManagement {

	public static void main(String[] args) {

     HashMap<String,Integer> hs =new HashMap<>();
     hs.put("Apple", 50);
     System.out.println("Added Apple: 50");
     hs.put("Banana", 30);
     System.out.println("Added Banana: 30");
     hs.put("Orange", 20);
     System.out.println("Added Orange: 20");
     
     System.out.println("Total number of entries:"+hs.size());
     
     if(hs.isEmpty()) {
    	 System.out.println("HashMap is empty");
     }
     else {
    	 System.out.println("HashMap is not empty");
     }
     
     System.out.println("Quantity for Apple:"+hs.get("Apple"));
     System.out.println("Quantity for Banana:"+hs.get("Banana"));

	}

}
