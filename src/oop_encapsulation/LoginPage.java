package oop_encapsulation;

public class LoginPage {

	private String userName;
	private String password;
	public String role;

	public LoginPage(String userName, String password, String role) {
		this.userName = userName;
		this.password = password;
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getUserInfo() {
		return userName + " "  + password + " " + role;
	}

}

