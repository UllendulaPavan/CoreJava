package comProgramDay17_Apr;

import java.io.IOException;
import java.util.Scanner;

class A {
	public void loadClass(String name) throws ClassNotFoundException {
		Class.forName(name);
		System.out.println("Class is loaded..");
	}
}
class B extends A {
	public void loadClass(String name) throws RuntimeException{
		
		try {
			
			super.loadClass(name);
		}
		
		catch(ClassNotFoundException e) {
			System.err.println("class Not Found..");
			/*
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 */
			RuntimeException r = new RuntimeException();
			r.initCause(new IOException("This is the real cause..."));
		// throw new RuntimeException(new IOException("This is the real cause..."));
			throw r;
		 
		}
		
		
		
	}
}
public class Tester {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Class Name: ");
		String name = sc.nextLine();
		A a = new B();
		try {
			a.loadClass(name);	
		}
		catch(RuntimeException e) {
			System.err.println(e);
		}
	}
   
	
}
