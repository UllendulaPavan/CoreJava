package com.extra_question;

public class SchoolMarks {

	public static void main(String[] args) {
		double marksGot =Double.parseDouble(args[0]);
		double totalMarks =Double.parseDouble(args[1]);
		
		double percentage = (marksGot/totalMarks)*100;
		System.out.printf("percentage of student :%.2f%%\n",percentage);
		
		double cgpa = percentage/9.5;
		System.out.printf("cgpa of student :%.2f",cgpa);
		
		
		
		
	}

}
