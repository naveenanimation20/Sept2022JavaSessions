package javasessions;

public class Car {

	String name;
	String color;
	double price;
	String type;

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.name = "BMW";
		c1.color = "Red";
		c1.price = 75.55;
		c1.type = "Sedan";

		Car c2 = new Car();
		c2.name = "mini cooper";
		// c2.price = 45.44;
		c2.type = "small";

		System.out.println(c1.name + " " + c1.color + " " + c1.price + " " + c1.type);
		System.out.println(c2.name + " " + c2.color + " " + c2.price + " " + c2.type);

		c2.price = 55.66;
		c2.color = "Black";
		System.out.println(c2.name + " " + c2.color + " " + c2.price + " " + c2.type);

		Car c3 = new Car();
		c3.name = "Honda";
		System.out.println(c3.name + " " + c3.color + " " + c3.price + " " + c3.type);

	}

}
