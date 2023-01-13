package BuilderPattern;

public class Employee extends Company {

	String name;
	int id;
	double salary;

	public Employee() {
		super();
		System.out.println("empp const....");
	}

	public Employee(String name, int id, double salary) {
		super(name, salary);
		this.name = name;
		this.id = id;
		this.salary = salary;
		
	}
	
	
	public static void main(String a[]) {
		Employee e1 = new Employee("Tom", 101, 12.33);
		System.out.println(e1.name + " " + e1.id + " " + e1.salary);
	}
	
	
	
	

}
