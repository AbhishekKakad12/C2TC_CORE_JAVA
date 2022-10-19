package com.capgemini.javademos;

public class MultiLevelInheritance {

	static class One{
		void disp1() {
			System.out.println("One");	
		}
	}

	static class Two extends One {
		void disp2() {
			System.out.println("Two");	
		}
	}

	static class Three extends Two {
		void disp3() {
			System.out.println("Three");	
		}
	}

	static class Four extends Three {
		void disp4() {
			System.out.println("Four");	
		}
	}

	public static void main(String[] args) {
		Four obj1 = new Four();
		obj1.disp2();
		obj1.disp3();
		obj1.disp4();
	}

}
