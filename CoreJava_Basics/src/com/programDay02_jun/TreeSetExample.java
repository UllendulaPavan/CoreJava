package com.programDay02_jun;

import java.util.Scanner;
import java.util.TreeSet;

record Product(Integer pid,String pname){
	
	 public Product {
		if(pid<0) {
			throw new IllegalArgumentException();
		}
	 }
}

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		
		
		System.out.println("1) Sort based on the pid in ascending order.\r\n"
				+ "2) Sort based on the pid in descending order.\r\n"
				+ "3) Sort based on the name in Alphabetical order.\r\n"
				+ "4) Sort based on the name in Reverse order.\r\n"
				+ "");
		
	   System.out.println("Enter the choice");
	   int choice =Integer.parseInt(sc.nextLine());
	   
	   switch(choice){
	   case 1:
		   TreeSet<Product> p= new TreeSet<Product>((s1,s2)->s1.pid().compareTo(s2.pid()));
			p.add(new Product(107, "pavan"));
			p.add(new Product(100, "dheeraj"));
			p.add(new Product(105, "shiva"));
			p.add(new Product(103, "sandeep"));
			p.add(new Product(106, "koti"));
			for (Product product : p) {
				System.out.println(product);
			}
		   break;
	   case 2:
		   TreeSet<Product> o= new TreeSet<>((p1,p2)->p2.pid().compareTo(p1.pid()));
			o.add(new Product(107, "pavan"));
			o.add(new Product(100, "dheeraj"));
			o.add(new Product(105, "shiva"));
			o.add(new Product(103, "sandeep"));
			o.add(new Product(106, "koti"));
			for (Product product : o) {
				System.out.println(product);
			}
		   break;
	   case 3:
		   TreeSet<Product> q= new TreeSet<>((r1,r2)->r1.pname().compareTo(r2.pname()));
			q.add(new Product(107, "pavan"));
			q.add(new Product(100, "dheeraj"));
			q.add(new Product(105, "shiva"));
			q.add(new Product(103, "sandeep"));
			q.add(new Product(106, "koti"));
			for (Product product : q) {
				System.out.println(product);
			}
		   break;
	   case 4 :
		   TreeSet<Product> f= new TreeSet<>((r1,r2)->r2.pname().compareTo(r1.pname()));
			f.add(new Product(107, "pavan"));
			f.add(new Product(100, "dheeraj"));
			f.add(new Product(105, "shiva"));
			f.add(new Product(103, "sandeep"));
			f.add(new Product(106, "koti"));
			for (Product product : f) {
				System.out.println(product);
			}
		   break;
		   default:System.out.println("invalid option");
	   }
	}

}
