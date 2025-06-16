package com.programDay2_May;

import java.util.Scanner;

public class RestaurantSystem {

	public static void main(String[] args) {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter the Restaurant Name:");
	   String res=sc.nextLine();
	   System.out.println("Enter the Order Name:");
	   String order= sc.nextLine();
		Restaurant r =new Restaurant(res, order, false);
		//Waiter w =new Waiter(r, null);
		Chef c =new Chef(r);
		
		//w.start();
//		try {
//			Thread.sleep(1000);
//		}catch(InterruptedException e) {
//			System.out.println(e);
//		}
        c.start();
        
        
	}

}
