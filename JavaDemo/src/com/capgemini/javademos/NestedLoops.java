package com.capgemini.javademos;

public class NestedLoops {

	public static void main(String[] args) {
		
// Code 1
		
		for(int i=1; i<=10; i++){
			for(int j=1; j<=10; j++){
				System.out.println("Value of i:"+i+" and value of j:"+j);
			}
			System.out.println("************************");
		}
	
// Code 2
		for (int i = 1; i <= 5; i++){
			for (int j = 1; j <= i; j++){
				System.out.print('@');
			}
			System.out.println();
		}

	}
}
