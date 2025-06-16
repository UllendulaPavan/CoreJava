package com.programDay14_13feb;

	
	int studentId;
	String studentName;
	int marks;
	char grade;
	
	public void setStudentData(int id,String name,int mark) {
		studentId=id;
		studentName=name;
		marks=mark;
		
	}
	
	public void displayDetails() {
		System.out.println("[studentId="+studentId+", name="+studentName+", marks="+marks+", garde="+grade+"]");
	}
	
	public void calculateGrade() {
		if(marks>90) {
			grade='A';
			
		}
		else if(marks>=81 && marks<=90) {
			grade='B';
		}
		else if (marks>=71 && marks<=80) {
			grade='c';
		}
		else if(marks>=61 && marks<=70) {
			grade='D';
		}
		else {
			grade='E';
		}
	}

}


