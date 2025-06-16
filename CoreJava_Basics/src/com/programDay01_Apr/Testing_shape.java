package com.programDay01_Apr;

public class Testing_shape {

	public static void main(String[] args) {
		
       Shape s=null;
       s=new Rectangle(30.3, 45.4);  s.printDetails();
       System.out.println("-------------");
       s=new Circle(23.2);  s.printDetails();
       System.out.println("-------------");
       s=new Triangle(146.2, 40.0);  s.printDetails();
		
		

	}

}
