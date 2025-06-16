package com.programDay3_jun;

import java.util.HashMap;
import java.util.IdentityHashMap;

record Student(Integer id ,String name) {
	
}

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		
		IdentityHashMap hp = new IdentityHashMap(); 
		 
		Student s1=new Student(101,"Dheeraj");
		Student s2=new Student(101,"Dheeraj");
		
		hp.put(s1, "first");
		hp.put(s2, "Second");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		
		

	}

}
