package com.capgemini.javademos;

public class ClassesAndObjects2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car. setDoors ("closed");
		car. setSpeed(10) ;
		System .out.println(car. run());
	}

	public static class Car {
			private String doors;
			private int speed;
			public void setSpeed(int speed){
				this. speed = speed;
			}
			public int getSpeed(){
				return speed;
			}
			public String getDoors() {
				return doors;
			}
			public void setDoors(String doors) {
				this. doors = doors;
			}
			public String run(){
				if (doors. equals ("closed") && speed >0){
					return "running";
				}else {
					return "not running";
				}
			}
		}
}
