package predefinedFunctionalInterfaces;

import java.util.function.Predicate;

public class Comman {
	
	public static void main (String []args) {
		
		Predicate<Integer> p1= (num)-> num%2==0;
		Boolean iseven= p1.test(3);
		System.out.println(iseven);
	}

}


