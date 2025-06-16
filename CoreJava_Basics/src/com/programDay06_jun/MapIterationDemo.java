package com.programDay06_jun;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class MapIterationDemo {

	public static void main(String[] args) {
		 HashMap<String,Integer> hs =new HashMap<>();
	        Scanner sc =new Scanner (System.in);
	        System.out.println("Enter number of students to add: ");
	        int size =Integer.parseInt(sc.nextLine());
	       
	        for(int i=0;i<size;i++){
	        	 System.out.println("Enter student name: ");
	             String name=sc.nextLine();
	             System.out.println("Enter student ID:");
	             int id =Integer.parseInt(sc.nextLine());
	             hs.put(name, id);
	       
	        }
//	        Enumeration<Entry<String, Integer>> enumeration = Collections.enumeration(hs.entrySet());
//	        while(enumeration.hasMoreElements()) {
//	        	Entry<String,Integer> nextElement = enumeration.nextElement();
//	        	System.out.println(nextElement.getKey()+" : "+nextElement.getValue());
//	        }
	        
	        Set<Entry<String, Integer>> eSet = hs.entrySet();
	        Vector<Entry<String,Integer>> legacy = new Vector<Entry<String,Integer>>(eSet);
	        Enumeration<Entry<String, Integer>> enume = legacy.elements();
	        while(enume.hasMoreElements()) {
	        	System.out.println(enume.nextElement());
	        }

	}

}
