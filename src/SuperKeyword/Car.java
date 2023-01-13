package SuperKeyword;

public class Car extends Vehicle{

	int maxSpeed = 100;
	
	int price = 500;
	
	
	public Car() {
		System.out.println("car -- default const....");
	}
	
	public Car(int i) {
		System.out.println("car -- const...." + i);
	}
	
	public Car(int i, int j) {
		System.out.println("car -- const...." + i+j);
	}
	
	public void racing() {
		System.out.println("Car -- racing");
		test();
	}
	
	public static void refuel() {
		System.out.println("car -- refuel");
		
	}
	
	private void test()
	{
		System.out.println("CAr -- test");
	}
	
}
