package com.capgemini.javademos;

public class SingleInheritance {

	static class One{
		void displ() {
			System.out.println("One");
		}
	}

	static class Two extends One {
		void disp2() {
			System.out.println("Two");
		}
	}
	
	public static void main(String[] args) {
		Two obj = new Two();
		obj .displ();
		obj .disp2();
	}

}
