package com.capgemini.javademos;

public class PolymorphismOverinding {

	static class Super{
		void disp(){
			System.out.println("Super Class");
		}
	}
	
	static class subclass extends Super{
		@Override
		void disp(){
			super.disp();
		//System.out.println("Only Sub Class");
		}
	}
	
	public static void main(String[] args) {
		subclass obj = new subclass();
		obj.disp();
	}

}
