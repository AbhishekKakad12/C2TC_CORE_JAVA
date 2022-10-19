package com.capgemini.javademos;

public class ClassesAndObjects {

	
	static class Car{
		private String doors;
		private String engine;
		private String driver;
		private int speed;
		public void setSpeed(int speed) {
			this.speed = speed;
		}
	
		public int getSpeed() {
			return speed;
		}
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.setSpeed(10);
		System.out.print(car.getSpeed());
	}

}
