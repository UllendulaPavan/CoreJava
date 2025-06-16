package comProgramDay17_Apr;

public class TesterELC {

	public static void main(String[] args) throws ClassNotFoundException {
		ChildClass p=new ChildClass();
		try {
			
			p.loadingClass(args[0]);
		}
		catch(ClassNotFoundException e) {
			System.err.println("Class Not found.");
		}

	}

}
