package comProgramDay17_Apr;

public class ArrayStoreExample {

	public static void main(String[] args) {
		
		storeObjects();
	}
	
	public static void storeObjects() {
		Object array[]=new String[5];
		 
		
		try
		{
			array[0]="Hello";
			array[1]="Hello";
			array[3]=123;
			System.out.println("Objects stored successfully.");
		}
		catch(ArrayStoreException e) {
			System.out.println(e);
		}
	}

}
