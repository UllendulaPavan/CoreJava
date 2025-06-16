package com.programDay24_27fed;

import java.util.Objects;

public class A {
  int a;
  int b;
  
  A(int a,int b){
	   this.a=a;
	   this.b=b;
  }
  
	@Override
public int hashCode() {
	return Objects.hash(a, b);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	A other = (A) obj;
	return a == other.a && b == other.b;
}

	public static void main(String[] args) {
		  A a1=new A(1,2);
		  A a2=new A(1,2);
		  
		  System.out.println(a1.hashCode());
		  System.out.println(a2.hashCode());
		  System.out.println(a1.equals(a2));
		  
		  if(a1==a2) {
			   System.out.println("object is same");
			   
		  }
		  else {
			  System.out.println("object is diff");
		  }
	}
}
