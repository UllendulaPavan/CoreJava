package comProgramDay17_Apr;

public class ChildClass extends ParentClass{
   
	
	public void loadingClass(String str) throws ClassNotFoundException {
		
         try
			{
				if(str.isEmpty() || str.isBlank()) {
					throw new IllegalArgumentException("Exception caught: Class name cannot be empty");
					}
					else {
						super.loadingClass(str);
					}
			  }
			 catch(IllegalArgumentException e) {
				 System.out.println(e.getMessage());
			 }
    }
}
