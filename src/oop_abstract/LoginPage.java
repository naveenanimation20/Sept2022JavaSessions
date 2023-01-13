package oop_abstract;

public class LoginPage extends Page{

	//hidden default const...
	
	public LoginPage() {
		System.out.println("Lp -- const...");
	}
	
	@Override
	public void title() {
		System.out.println("LP - title");
	}

	@Override
	public void url() {
		System.out.println("LP - url");

	}
	
	public void doLogin() {
		System.out.println("user is logged in");
	}
	
	
	
	

}
