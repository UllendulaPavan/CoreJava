package com.programDay15_may;

import java.util.Scanner;

public class LastandFirst {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the elements");
		int num=Integer.parseInt(sc.nextLine());
		int []arr=new int[num];
			for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the index="+i);
			arr[i]=Integer.parseInt(sc.nextLine());
			
		}
			int sum=0;
		for(int i=0;i<arr.length;i++ ) {
			if(i==0 ||i==arr.length-1) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);

	}

}
