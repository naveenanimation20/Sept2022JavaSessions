package oop_inheritance;

//IS - A relationship
public class BMW extends Car{
	
	int speed = 200;

	//Method Overriding: Poly(many) + Morphism(forms) -- RunTime/dynamic binding
	//when we have a method in parent class and the same method in child class:
	//with the same name
	//with the same number of parameters
	//with the same sequence of the parameters
	//with the same return type
	//static method can not be overridden
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	
	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}
	
	//method hiding
	public static void billing() {
		System.out.println("bmw - billing");
	}
	
	//HAS - A relationship - composition in Java
	public void getBMWEngineInfo() {
		Engine eg = new Engine();
		eg.engine();
	}
	
}
