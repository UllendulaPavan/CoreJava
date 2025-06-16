package com.programDay15_may;

import java.util.Scanner;

public class EvenelementsOdd {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the elements");
		int num=Integer.parseInt(sc.nextLine());
		int []arr=new int[num];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the index="+i);
			arr[i]=Integer.parseInt(sc.nextLine());
			}
		System.out.print("Even elements are :");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println("\n");
		System.out.print("Odd elements are :");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
