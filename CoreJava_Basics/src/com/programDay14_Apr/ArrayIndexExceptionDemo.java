package com.programDay14_Apr;

public class ArrayIndexExceptionDemo {

	public static void main(String[] args) {
		
		try {
			int a[] = new int[2];
			System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("An ArrayIndexOutOfBoundsException occurred.");
			System.out.println("Message:"+e.getMessage());
			System.out.println("String representation: "+e.toString()+" Index 3 out of bounds for length 2\r\n"
					+ "Stack trace: ");
			e.printStackTrace();
			
		}
		

	}

}
