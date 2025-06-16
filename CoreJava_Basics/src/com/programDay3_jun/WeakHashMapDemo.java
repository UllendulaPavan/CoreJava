package com.programDay3_jun;

import java.util.WeakHashMap;

record Employee(Integer id,String name) {
	
}

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		
		 WeakHashMap<Employee ,String > wh =new WeakHashMap<Employee, String>();
		  var p1=new Employee(101,"Dheeraj");
		  wh.put(p1, "Ameerpet");
		  System.out.println(wh);
		
		 p1=null;
		 System.gc();
		 Thread.sleep(2000);
		 
		 System.out.println(wh);
		 

	}

}
