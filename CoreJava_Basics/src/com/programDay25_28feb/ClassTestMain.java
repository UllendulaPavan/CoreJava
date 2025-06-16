package com.programDay25_28feb;

public class ClassTestMain {

	public static void main(String[] args) {
      
		Employee pavan=new Employee(1,"pavan",20000,55,88);
		
		System.out.println(pavan);
		System.out.println("Employee TAX : "+ pavan.calculateGrossSalary());
		
		
		Manager dheeraj =new Manager(2,"dheeraj",25000,56,89,2);
		System.out.println(dheeraj);
		System.out.println("Manager TAX : "+ 	dheeraj.calculateGrossSalary());
		
		Trainer shiva =new Trainer(3,"shivaReddy",35000,57,90,100,5);
		System.out.println(shiva);
		System.out.println("Trainer TAX : "+ shiva.calculateGrossSalary());
		
		
		Sourcing koti = new Sourcing(4,"kotimuthyara",10000,58,91,101,77,88);
		System.out.println(koti);
		System.out.println("Sourcing TAX : "+ koti.calculateGrossSalary());
		
		
		

	}

}
