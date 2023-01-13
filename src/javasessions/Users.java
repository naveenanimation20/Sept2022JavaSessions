package javasessions;

public class Users {

	String name;
	int id;
	String dob;
	String city;
	boolean isActive;

//	public Users() {
//		System.out.println("default const...");
//	}

	public Users(String name, int id) {
		System.out.println("2 param");
		this.name = name;
		this.id = id;
	}

	public Users(String name, int id, String city) {
		System.out.println("3 params");
		this.name = name;
		this.id = id;
		this.city = city;
	}

	public Users(String name, String dob, String city) {
		this.name = name;
		this.dob = dob;
		this.city = city;
	}

	public Users(String name, int id, String dob, String city, boolean isActive) {
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.city = city;
		this.isActive = isActive;
	}
	
	//fun vs const:
	//fun -- may or may not return the value but const...will never return anything
	//fun will be called with the object ref, but const.. will be called when you create the object
	//buss logic will be written inside the function. Const is used to initialize the class vars.
	

	public static void main(String[] args) {
		Users u1 = new Users("Tom", 101);
		System.out.println(u1.name);
		System.out.println(u1.id);

		Users u2 = new Users("Peter", 102, "LA");
		System.out.println(u2.name + " " + u2.id + " " + u2.city);
		
		Users u3 = new Users("Lisa", 103, "01-01-1990", "Pune", true);
		

	}

}
