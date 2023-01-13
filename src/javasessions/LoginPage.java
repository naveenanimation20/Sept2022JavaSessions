package javasessions;

public class LoginPage {

	String username;
	String password;

	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public void doLogin() {
		System.out.println("enter username: " + username);
		System.out.println("enter password: " + password);
		System.out.println("click on login button");
		System.out.println("user is logged in");
	}

	public static void main(String[] args) {

		LoginPage lp1 = new LoginPage("naveen@gmail.com", "naveen123");
		lp1.doLogin();
		
		LoginPage lp2 = new LoginPage("tom@gmail.com", "tom123");
		lp2.doLogin();

		
	}

}

