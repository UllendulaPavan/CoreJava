package com.programDay29_may;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Tester_product {

	public static void main(String[] args) {
		ArrayList<Product> al=new ArrayList<>();
		al.add(new Product(666,"laptop",50000D));
		al.add(new Product(111,"pen",6000D));
		al.add(new Product(333,"ball",8000D));
		al.add(new Product(555,"computer",20000D));
		al.add(new Product(222,"fan",44000D));
		
		
		al.forEach(System.out::println);
		System.out.println("-----------------");
		Collections.sort(al);
         al.forEach(System.out::println);
	}

}
