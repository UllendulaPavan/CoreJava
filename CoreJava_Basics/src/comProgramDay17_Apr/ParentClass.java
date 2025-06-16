package comProgramDay17_Apr;


public class ParentClass {
	 
	public void loadingClass(String str) throws ClassNotFoundException {
	
		Class.forName(str);
		System.out.println("Class Found :"+str);
//		try {
//			System.out.println("Class loaded successfully:"+str);
//		}
//		catch(ClassNotFoundException e) {
//			System.out.println(e);
//		}
	}

}
