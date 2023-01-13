package SuperKeyword;

public class BMW extends Car{

	int maxSpeed = 200;
	
	//super:
	//1. can call parent class variables having the same var in child class
	//2. can call parent class methods having the same methods in child class
	//3. can call parent class const.. from child class const....but it should be the 1st statement
	
	//4. static vars or methods can be called by super keyword
	
	
	public BMW() {
		super(10);
		//super(10,20);
		System.out.println("BMW -- default const...");

	}
	
	@Override
	public void racing() {
		System.out.println("BMW -- racing");
	}
	
	public static void refuel() {
		System.out.println("BMW -- refuel");
	}
	
	private void test()
	{
		System.out.println("BMW -- test");
	}
	
	public void info() {
		int carSpeed = super.maxSpeed;
		System.out.println(carSpeed);//100
		System.out.println(maxSpeed);//200
		
		super.racing();
		racing();
		
		System.out.println(price);
		System.out.println(super.price);
		
		refuel();
		super.refuel();
		Car.refuel();
		
		test();
	}

	public static void main(String ar[]) {
		
		BMW b = new BMW();
		b.info();
		

	}

}

