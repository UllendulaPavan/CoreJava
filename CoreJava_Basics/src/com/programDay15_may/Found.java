package com.programDay15_may;

import java.sql.Array;
import java.util.Scanner;

public class Found {

	public static void main(String[] args) {
       
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter searching element:");
		int num =sc.nextInt();    //5
		int []arr= {1,4,3,5,2,5,5};
		int c=0;
		
		
		for(int i=0;i<arr.length;i++) {
			
			
			if(num==arr[i]) {  //1 4 3 5 true
				c=1;
				System.out.println("Element found at index "+i);	
			}
		}
		if(c==0)
		System.out.println("Element not found ");
		
		
	}

}
