package comProgramDay16_Apr;

import java.util.Scanner;

public class ClassNotFoundExpDemo {
	
	public ClassNotFoundExpDemo(String str)  {
		try{
		Class<?> cl=Class.forName(str);
		System.out.println(cl.getClass()+" found:"+cl.getSimpleName());
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
    	System.out.println("Enter the class name to load:");
    	String st=sc.nextLine();
    	new ClassNotFoundExpDemo(st);

	}
	
    
}
