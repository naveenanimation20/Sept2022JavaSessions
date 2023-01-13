package oop_Interface;

public interface USMedical extends WHO, UNHG{
	
	
	//vars are static and final by default:
	int bill_amount = 10;

	// a method with no body -- only method declaration
	// method prototype
	// Abstract Method
	//can not create the object of Interface
	public void physioServices();
	
	public void physioServices(int a);
	
	public int physioServices(int a, int b);
	
	public void cardioServices();

	public void neuroServices();
	
	public void emergencyServices();
	
	//public static void test();
	
	
	//JDK 1.8:
	//1. can have static method with method body
	public static void USMedicalHistory() {
		System.out.println("US -- USMedicalHistory");
	}
	
	//2. default method with method body
	default void medicalRD(){
		System.out.println("R&D -- US");
	}
	
	default void medicalSearch(){
		System.out.println("search -- US");
	}
	
}

