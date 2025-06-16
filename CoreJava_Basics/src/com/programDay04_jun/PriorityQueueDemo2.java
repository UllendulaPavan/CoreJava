package com.programDay04_jun;

import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Red");
		pq.add("Green");
		pq.add("Orange");
		System.out.println("Priority Queue1:"+pq);
		
		PriorityQueue<String> pq1=new PriorityQueue<>();
		pq1.add("Pink");
		pq1.add("White");
		pq1.add("Black");
		System.out.println("Priority Queue2:"+pq1);
		
		pq.addAll(pq1);
		System.out.println("New Priority Queue1:"+pq);

	}

}
