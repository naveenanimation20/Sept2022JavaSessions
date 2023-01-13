package oop_inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();//overridden
		b.stop();//inherited 
		b.refuel();//inherited
		b.autoParking();//individual
		BMW.billing();
		b.engine();
		System.out.println(b.speed);
		b.getBMWEngineInfo();
		
		System.out.println("--------");

		//
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		Car.billing();
		c.engine();
		System.out.println(c.speed);
		
		System.out.println("--------");
		//child class object can be referred by parent class ref variable
		//top/up casting:
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		System.out.println(c1.speed);
		
		
		//child class object can be referred by grand parent class ref variable
		Vehicle v1 = new BMW();
		v1.engine();
		
		
		//down casting:
		//parent class object can be referred by child class ref variable?
		//BMW b1 = (BMW)new Car();//ClassCastException
		
		//BMW b1 = (BMW)new Vehicle();
		
	}

}
