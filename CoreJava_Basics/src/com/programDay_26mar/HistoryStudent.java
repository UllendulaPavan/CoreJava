package com.programDay_26mar;

public class HistoryStudent extends Student {

	private int historyMarks;
	 private int civicsMarks;
	 
	 
	 public HistoryStudent(String studentName, String studentClass,int historyMarks,int civicsMarks) {
			super(studentName, studentClass);
			this.historyMarks=historyMarks;
			this.civicsMarks=civicsMarks;
			
			
		}


		@Override
		public int getPercentage() {
			return (historyMarks+civicsMarks)/2;
		}
		
}
