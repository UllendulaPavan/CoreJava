package comProgramDay17_Apr;

public class CommandLineDivision {

	public static void main(String[] args) {
		   int dividend=Integer.parseInt(args[0]);
		   int divisor =Integer.parseInt(args[1]);
		   int length =args.length;
	   try {
		   
		   if(length==2) {
			  int result =dividend/divisor;
			  System.out.println("Division result:"+result);
		   }
	   }
	   catch(NumberFormatException e) {
		   System.out.println("NumberFormatException: For input string:"+e.getMessage());
	   }
	   catch(IllegalArgumentException e) {
		   throw new IllegalArgumentException("Exactly two arguments are required");
	   }
       catch(ArithmeticException e) {
		   System.out.println("Arithmetic error:"+e.getMessage());
	   }
	   finally {
		   System.out.println("Division operation completed.");
	   }
	   

	}

}
