package javasessions;

public class CarType {

	String name;
	int price;
	String color;
	static final int wheels = 4;

	public static void main(String[] args) {
		
//		static int p = 10;//local var -- can not be static
//		p = 20;

		CarType c1 = new CarType();
		c1.name = "BMW";
		c1.price = 50;
		c1.color = "Black";
		
		//how to access static vars:
		System.out.println(c1.wheels);
		
		//1. use it by the class name:
		System.out.println(CarType.wheels);
		
		//2. access it directly:
		System.out.println(wheels);
		System.out.println(c1.name + " " + c1.price + " " + c1.color + " " + CarType.wheels);
		
		//CarType.wheels = 10;
		System.out.println(c1.name + " " + c1.price + " " + c1.color + " " + CarType.wheels);

		
//		final int days = 7;
//		days = 10;
//		System.out.println(days * 10);
		

		CarType c2 = new CarType();
		c2.name = "Audi";
		c2.price = 60;
		c2.color = "Blue";

		CarType c3 = new CarType();
		c3.name = "Honda";
		c3.price = 20;
		c3.color = "White";
		
		
		Department.getInfo();

	}

}
