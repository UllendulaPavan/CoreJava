package com.programDay_14mar;

import java.util.Scanner;

public class Add_Emp_main {

	

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		Address a1= new Address("banglore", "goa", "telangana") ;
		Employee e1 =new Employee(1, "pavan",a1);
		
		System.out.println(e1);	
		
	}

}
