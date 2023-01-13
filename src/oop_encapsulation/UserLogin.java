package oop_encapsulation;

import javasessions.Sample;

public class UserLogin {

	public static void main(String[] args) {

		LoginPage lp1 = new LoginPage("admin", "admin123", "superadmin");

		System.out.println(lp1.getUserName());
		System.out.println(lp1.getPassword());
		System.out.println(lp1.role);

		lp1.setPassword("admin345");
		System.out.println(lp1.getPassword());

		LoginPage lp2 = new LoginPage("seller", "seller123", "selleradmin");
		System.out.println(lp2.getUserName());
		System.out.println(lp2.getPassword());
		System.out.println(lp2.role);

		lp2.role = "sellersuperadmin";
		System.out.println(lp2.getUserName());
		System.out.println(lp2.getPassword());
		System.out.println(lp2.role);

		System.out.println(lp1.getUserInfo());
		System.out.println(lp2.getUserInfo());

		//
		//Application app = new Application();
		Application.getInfo();
		
		Sample s1 = new Sample();
		s1.name = "naven";
		
		
	}

}
