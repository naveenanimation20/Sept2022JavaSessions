package oop_inheritance;

public class Car extends Vehicle{

	
	int speed = 100;
	
	//final:
	//1. to prevent method overridding
	//2. to prevent inheritance
	//3. to provide the constant values
	
	public void start() {
		System.out.println("car -- start");
	}

	public void stop() {
		System.out.println("car -- stop");
	}

	public void refuel() {
		System.out.println("car -- refuel");
	}
	
	
	public static void billing() {
		System.out.println("car - billing");
	}

}
