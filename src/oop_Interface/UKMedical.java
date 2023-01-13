package oop_Interface;

public interface UKMedical {
	
	
	public void ENTServices();
	
	public void pediaServices();
	
	public void emergencyServices();
	
	public void pathalogyDepartment();
	
	default void medicalRD(){
		System.out.println("R&D -- UK");
	}


}
