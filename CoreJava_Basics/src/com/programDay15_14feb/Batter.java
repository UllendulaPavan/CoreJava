package com.programDay15_14feb;

public class Batter {
	String name; 
	  int runs;
	 int  matches;
	 float batting_avg;
	 
	 public void batterDetails(String nam,int run,int matche)
	 {
		 name =nam;
		 runs =run;
		 matches =matche;
		 
	 }
	 
	 public void  computeBattingAverage() 
	 {
		if(runs<0 || matches<0 ) {
			System.out.println("error");
		}
		if(matches ==0 && (runs>0 || matches>0)) {
			System.out.println("error");
		}
		batting_avg =(float) runs/matches;
		System.out.println("Name :"+name);
		System.out.println("Batting_Avg:"+batting_avg);
	 }
	 
	 public void getStatistics() 
	 {
		 if(runs<0 || matches<0 ) {
				System.out.println("error");
			}
			if(matches ==0 && (runs>0 || matches>0)) {
				System.out.println("error");
			}
			
			System.out.println(" Name: "+name );
			System.out.println(" Runs:"+runs);
			System.out.println(" Matches:"+matches);
			
	 }

}
