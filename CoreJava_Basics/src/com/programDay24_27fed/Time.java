package com.programDay24_27fed;

public class Time {
	
	private int hours;
	private int minutes ;
	private int seconds ;
	
	public Time() {
		this.hours=0;
		this.minutes=0;
		this.seconds=0;
	}
	
	public Time(int hours,int minutes,int seconds) {
		this.hours=hours;
		this.minutes=minutes;
		this.seconds=seconds;
	}
	
	public void show() {
		System.out.println("It must display the time in hours:"+hours+" minutes:"+minutes+" seconds:"+seconds+" format.");
		
	}
	
	public static Time Add(Time t1,Time t2) //2:30:40    4:40:21// pavan    pavan1
	{
		int totalSeconds = t1.seconds + t2.seconds;
        int totalMinutes = t1.minutes + t2.minutes + totalSeconds / 60;
        int totalHours = t1.hours + t2.hours + totalMinutes / 60;

        int finalSeconds = totalSeconds % 60;
        int finalMinutes = totalMinutes % 60;
        int finalHours = totalHours;

        return new Time(finalHours, finalMinutes, finalSeconds);
		
		
	}

}
