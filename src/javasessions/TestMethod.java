package javasessions;

public class TestMethod {
	
	//data members:
	//1. class vars
	//2. methods/functions
	
	//three types of functions:
	//can not create a function inside a function
	
	//1. no input and no return:
	//void - can not return anything - no return keyword
	public void test() {
		System.out.println("test method");
		int z = 10+20+30;
		System.out.println(z);
	}
	
	//2. no input and some return:
	//return type: int
	public int printValue() {
		System.out.println("print value");
		int a = 10;
		int b = 20;
		int c = a+b;//30
		return c;
	}
	
	public String getTrainerName() {
		System.out.println("get trainer name");
		String name = "Naveen";
		return name;
	}
	
	public double getTotalBill() {
		System.out.println("getting total bill");
		int foodBill = 100;
		double drinks = 30.23;
		int dessert = 40;
		double totalAmount = foodBill + drinks + dessert;
		return totalAmount;
	}
	
	//3. some input and some return
	//return type: int
	//parameters: x,y
	public int add(int x, int y) {
		System.out.println("adding two numbers");
		int sum = x+y;
		return sum;
	}
	
	public boolean isActive() {
		System.out.println("user is active");
		return true;
	}
	
	public void click() {
		System.out.println("click on element");
		//return;
	}
	
	public void sendKeys(String value) {
		System.out.println("entering the value : " + value);
	}
	
	public int generateBill(int totalProducts, int discount) {
		System.out.println("generating bill");
		int finalBill = totalProducts * 10;
		return finalBill;
	}
	

	public static void main(String[] args) {
		
		//call the function:
		//create the object of the class:
		TestMethod t = new TestMethod();
		t.test();
		int p = t.printValue();
		System.out.println(p-5);
		
		System.out.println(t.printValue()+5);
		
		String n = t.getTrainerName();
		System.out.println(n);
		
		if(n.equals("Naveen")) {
			System.out.println("India");
		}
		
		double bill = t.getTotalBill();
		System.out.println("final bill: " + (bill - 50));
		
		int s1 = t.add(10, 20);//arguments/value -- call by value
		System.out.println(s1);
		
		s1 = t.add(40, 50);
		System.out.println(s1);
		
		if(t.isActive()) {
			System.out.println("credit the salary");
		}
		
	}
	
	

}
