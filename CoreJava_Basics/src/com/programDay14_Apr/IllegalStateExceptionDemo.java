			package com.programDay14_Apr;

public class IllegalStateExceptionDemo {

	public static void main(String[] args) {
		
		try {
			throw new IllegalStateException("MyException");
		}
		catch(IllegalStateException objA) {
			System.out.println("Calling throwIllegalException from main method:");
			System.out.println("caught:"+objA);
		}

	}

}
