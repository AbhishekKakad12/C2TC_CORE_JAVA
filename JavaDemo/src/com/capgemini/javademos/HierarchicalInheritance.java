package com.capgemini.javademos;

public class HierarchicalInheritance {

	static class One {
		void disp1() {
			System.out.println("One");
		}
	}

	static class Two extends One{
		void disp2() {
			System.out.println("Two");
		}
	}
	
	static class Three extends One {
		void disp3() {
			System.out.println("Three");
		}
	}

	static class Four extends One {
		void disp4() {
			System.out.println("Four");
		}
	}

	
	public static void main(String[] args) {
		Four obj1 = new Four();
		obj1.disp1();
		obj1.disp4();
			
		Three obj2 = new Three();
		obj2.disp1();
		obj2.disp3();
		
		Two obj3 = new Two();
		obj3.disp1();
		obj3.disp2();
	}

}
