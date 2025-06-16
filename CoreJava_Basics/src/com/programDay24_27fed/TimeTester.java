package com.programDay24_27fed;

public class TimeTester {

	public static void main(String[] args) {
		
		
		Time pavan=new Time (2,30,40);//100x
		Time pavan1=new Time (4,40,21);//200x
		
		Time newTime=Time.Add(pavan, pavan1);
		newTime.show();
		

	}

}
