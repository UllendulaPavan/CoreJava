package comProgramDay16_Apr;

import java.util.Scanner;

public class ClassCastExceptionDemo {

	public static void main(String[] args) {
		
      handleClassCastException();
	}
	
	public static void handleClassCastException() {
		
		Scanner sc=new Scanner(System.in);

		Object A[]=new Object[] {"Hello", 123, "Java"};
		
		try(sc){
			for(Object o: A) {
				String s=(String)o;
				System.out.println("Casting successful:"+s);
			}
		
		}
			catch(ClassCastException e) {
				System.out.println(e.getMessage());
			}
		
	}

}
