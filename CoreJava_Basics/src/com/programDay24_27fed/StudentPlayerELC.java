package com.programDay24_27fed;

public class StudentPlayerELC {

	public static void main(String[] args) {
	    
		Student p1=new Student(2,"pavan",18);
		Player play=new Player(p1);
		play.updateName("dheeraj");
		p1.showDetails();
		play.showDetails();
		play.isEligible();
		
		
	}

}
