package oop_encapsulation;

public class Employee {

	private String name;
	private int age;
	private double salary;

	// public methods: getter and setter:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {

		Employee e = new Employee();
		e.name = "Tom";
		e.age = 20;
		e.salary = 12.33;

	}

}
