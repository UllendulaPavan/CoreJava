package com.programDay_26mar;

import java.lang.reflect.Constructor;

public class User extends Program01 {
	
	public static void main(String[] args) throws Exception {
		// Program01 p=new Program01();
		// p.m1();

		// Program01 p=new User();
		// p.m1();

		/*
		 * load the class | class.forName("fully Qualified name ") packageName and
		 * className
		 * 
		 * create the object |- newInstance()
		 */

		Program02 p = (Program02) Class.forName("com.programDay_26mar.Program02").newInstance();

		Constructor con = p.getClass().getDeclaredConstructor();
		Program02 obj = (Program02) con.newInstance();
		
		

	}
}
