package com.programDay15_14feb;

public class BowlerDetails {
	
	String name; 
	int wickets; 
	 int matches; 
	 int balls_bowled; 
	 int runs_conceded; 
	 
	 public void DowlerDetails (String nam,int wicket,int matche,int balls ,int runs) {
		 name =nam;
		 wickets =wicket;
		 matches =matche;
		 balls_bowled =balls;
		 runs_conceded =runs;
		 
	 }
	 public void computeBowlingAverage() {
		 if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
	            System.out.println("Error");
	            return;
	        }
		 if(matches==0 && (balls_bowled > 0 || runs_conceded > 0)) {
			 System.out.println("Error");
	            return;
		 }
		 if(wickets == 0 ) {
			 System.out.println("error");
			 return;
		 }
		
		double bowling_avg = (double)runs_conceded/wickets;
		  System.out.println("Name: " + name);
		 System.out.println("bowling_avg :"+bowling_avg);
		
		 
	 }
	 public void computeStrikeRate() {
		 if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
	            System.out.println("Error");
	            return;
	        }
		 if(matches==0 && (balls_bowled > 0 || runs_conceded > 0)) {
			 System.out.println("Error");
	            return;
		 }
		 if(balls_bowled<0 || runs_conceded<0 ) {
			 System.out.println("error");
			 return;
		 }
		 
		double   Strike_rate= (double) balls_bowled/runs_conceded;
		 System.out.println("Name: " + name);
		 System.out.println("Strike_rate ="+Strike_rate);
		 
	 }
	 public void  showStatistics()
	 {
		 if (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0) {
	            System.out.println("Error");
	            return;
	        }
		 if(matches==0 && (balls_bowled > 0 || runs_conceded > 0)) {
			 System.out.println("Error");
	            return;
		 }
		
		    System.out.println("Name: " + name);
	        System.out.println("Wickets: " + wickets);
	        System.out.println("Matches: " + matches);
	        System.out.println("Balls Bowled: " + balls_bowled);
	        System.out.println("Runs Conceded: " + runs_conceded);
	 }
		 
	 
	 

}
