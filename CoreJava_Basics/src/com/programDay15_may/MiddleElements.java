package com.programDay15_may;

import java.util.Scanner;

public class MiddleElements {

	public static void main(String[] args) {
     
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the elements");
		int size=Integer.parseInt(sc.nextLine());
		int []arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the index="+i);
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		if(arr.length%2==0)
			System.out.println(arr[arr.length/2-1]+" "+arr[arr.length/2]);
		else
			System.out.println(arr[arr.length/2]);
		
		
		
	}

}
