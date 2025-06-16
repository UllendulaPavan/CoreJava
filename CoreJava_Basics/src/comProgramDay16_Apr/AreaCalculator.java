package comProgramDay16_Apr;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		try(sc){
			System.out.println("Enter length of rectangle:");
			int length=sc.nextInt();
			System.out.println("Enter width of rectangle:");
			int width=sc.nextInt();
			
			if(length<0 || width<0) {
				throw new IllegalArgumentException("IllegalArgumentException caught: Dimensions must be positive: length="+length+", width="+width);
			}
			System.out.println("Area of rectangle with length "+length+" and width "+width+" is: "+calculateArea(length, width));
			
			
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}
	public static double calculateArea(double length,double width) {
		return length*width;
	}

}
