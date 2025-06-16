package com.programDay04_jun;

import java.util.PriorityQueue;

public class PriorityQueueDemo3 {

	public static void main(String[] args) {
		PriorityQueue<String> pq1=new PriorityQueue<>();
		pq1.add("Red");
		pq1.add("Green");
		pq1.add("Black");
		pq1.add("White");
		System.out.println("First Priority Queue:"+pq1);
		
		PriorityQueue<String> pq2=new PriorityQueue<>();
		pq2.add("Red");
		pq2.add("Pink");
		pq2.add("Black");
		pq2.add("Orange");
		System.out.println("First Priority Queue:"+pq2);
//		int c=0;
//		for (String string : pq1) {
//			c=0;
//			for (String string2 : pq2) {
//				if(string.equalsIgnoreCase(string2)) {
//					c++;
//				}
//				
//			}
//			if(c==1) {
//				System.out.println("Yes");
//			}
//			else {
//				System.out.println("No");
//			}
		for (String str : pq1) {
			if(pq2.contains(str))
			{
				System.out.println("yes");
		}
			else
			{
				System.out.println("no");
			}
			
		}
		
    

	}

}
