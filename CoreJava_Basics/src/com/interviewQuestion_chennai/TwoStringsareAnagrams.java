package com.interviewQuestion_chennai;

@FunctionalInterface
interface mmm {
	 void run();
	
}

public class TwoStringsareAnagrams
{
	public static void main (String [] args) {
		mmm m =()-> System.out.println("Running");
		m.run();
	}
}


