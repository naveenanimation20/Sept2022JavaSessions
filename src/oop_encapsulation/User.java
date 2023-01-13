package oop_encapsulation;

public class User {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setName("Tom");
		e1.setAge(20);
		e1.setSalary(12.33);
		
		
		System.out.println(e1.getName() + " " + e1.getAge() + "  " + e1.getSalary());
		
		
		Browser br = new Browser();
		br.launchBrowser();
		
		
		//
		//POST - create a user
		Customer c1 = new Customer("Vaishali", 101, "vaishali@gmail.com");
		System.out.println(c1.getUserId());//GET -- get user info
		System.out.println(c1.getEmailId());
		System.out.println(c1.getName());
		
		System.out.println("-------");
		c1.setEmailId("vaishali101@gmail.com");//PUT/PATCH - update a user
		System.out.println(c1.getUserId());//GET -- get user info
		System.out.println(c1.getEmailId());
		System.out.println(c1.getName());
		
		System.out.println("-------");
		c1.setName("Vaishali Jain");
		System.out.println(c1.getUserId());//GET -- get user info
		System.out.println(c1.getEmailId());
		System.out.println(c1.getName());
		

	}

}
