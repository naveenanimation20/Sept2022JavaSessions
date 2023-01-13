package javasessions;

public class Customer {
	
	String name;
	int id;
	String city;
	boolean isActive;
	
	//constructor:
	//0 param const...or default const...
	public Customer() {
		System.out.println("0 param");
	}
		
	public Customer(int i) {
		System.out.println("1 param " + i);
	}
	
	public Customer(int i, int j) {
		System.out.println("2 params " + i+j);
	}
	
	public Customer(int i, String p) {
		System.out.println("2 params " + i+p);
	}
	
	public Customer(String p, int i) {
		System.out.println("2 params " + i+p);
	}
	

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		Customer c2 = new Customer(10);
		Customer c3 = new Customer(10,20);
		Customer c4 = new Customer(10,"tom");
		Customer c5 = new Customer("testing", 20);


	}

}
