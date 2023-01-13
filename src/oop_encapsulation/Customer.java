package oop_encapsulation;

public class Customer {

	//POJO classes --> plain old java object
	private String name;
	private int userId;
	private String emailId;

	public Customer(String name, int userId, String emailId) {
		this.name = name;
		this.userId = userId;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
