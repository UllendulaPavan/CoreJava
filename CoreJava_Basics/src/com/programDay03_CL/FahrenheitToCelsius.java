package com.programDay03_CL;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		int fachrenheit = Integer.parseInt(args[0]);
		int celsius =((fachrenheit-32)*5/9);
		System.out.println("Fahrenheit is :"+celsius);

	}

}
