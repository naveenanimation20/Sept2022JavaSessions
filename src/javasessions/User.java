package javasessions;

public class User {

	String name;
	int age;
	String city;

	public static void main(String[] args) {

		User u1 = new User();
		u1.name = "Irina";
		u1.age = 25;
		u1.city = "LA";

		User u2 = new User();
		u2.name = "Aman";
		u2.age = 27;
		u2.city = "Bangalore";

		User u3 = new User();
		u3.name = "Nidhi";
		u3.age = 30;
		u3.city = "Pune";

		System.out.println(u1.name + " " + u1.age + " " + u1.city);//ir
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//am
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//ni
		
		System.out.println("---------");
		u1 = u2;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

		System.out.println("---------");

		u2 = u3;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);

		System.out.println("---------");

		u3 = u1;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);


	}

}
