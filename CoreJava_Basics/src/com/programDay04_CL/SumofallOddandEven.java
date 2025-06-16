package com.programDay04_CL;

public class SumofallOddandEven {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);

		int evenSum=0;
		int oddSum=0;
		for(int i=0;i<=num;i++) {
			if(i%2==0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		System.out.println("Sum of evensum :"+evenSum);
		System.out.println("Sum of oddsum :"+oddSum);

	}

}
