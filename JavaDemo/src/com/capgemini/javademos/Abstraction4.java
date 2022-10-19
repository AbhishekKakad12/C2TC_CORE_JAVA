package com.capgemini.javademos;

abstract class Base{
	final void fun(){
		System.out.println("Derived fun() called");
	}
}
		
class Derived extends Base{
}
		
class Abstraction4{
	public static void main(String args[]){
		Base b = new Derived();
		b.fun();
	}
}