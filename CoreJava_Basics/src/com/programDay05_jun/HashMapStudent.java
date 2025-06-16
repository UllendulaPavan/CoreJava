package com.programDay05_jun;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student{
	private int id;
	private String name;
	private int age;
	
	
	
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}



public class HashMapStudent {

	public static void main(String[] args) {
		
     HashMap<Student,Integer> hs=new HashMap<>();
     hs.put(new Student(1,"pavan",23), 1);
     hs.put(new Student(2,"Dheeraj",23), 2);
     hs.put(new Student(3,"sandeep",23), 3);
     hs.put(new Student(4,"shiva",23), 4);
     
     for (Map.Entry<Student, Integer> str : hs.entrySet()) {
		System.out.println(str);
	}
	}

}
