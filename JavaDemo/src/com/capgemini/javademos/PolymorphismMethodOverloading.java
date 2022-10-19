package com.capgemini.javademos;

public class PolymorphismMethodOverloading {

	void add(int x, int y)
	{
		System.out.println("Add is "+(x+y));
	}
	void add(int x, int y, int z)
	{
		System.out.println("Add is "+(x+y+z));
	}
	
	public static void main(String[] args) {
		PolymorphismMethodOverloading obj = new PolymorphismMethodOverloading();
		obj.add(5, 4);
		obj.add(5, 5, 4);
	}

}
