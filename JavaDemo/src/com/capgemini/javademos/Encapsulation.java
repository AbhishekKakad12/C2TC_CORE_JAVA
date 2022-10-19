package com.capgemini.javademos;

class Student{
	private String name;
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}
}

public class Encapsulation{
	public static void main(String[] args){
		
		Student s=new Student();
		s.setName("vikas");
		System.out.println(s.getName());
		
	}
}