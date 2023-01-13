package oop_Interface;

//IS-A 
public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {
	
	//int bill_amount = 100;

	// US
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");
	}
	
	@Override
	public void physioServices(int a) {
		
	}

	@Override
	public int physioServices(int a, int b) {
		
		return 0;
	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("FH -- neuroServices");

	}

	// UK
	@Override
	public void ENTServices() {
		System.out.println("FH -- ENTServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");

	}

	// India
	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");

	}

	@Override
	public void orthoServices() {
		System.out.println("FH -- orthoServices");

	}

	// common:
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
	}

	// individual:
	public void medicalTraining() {
		System.out.println("FH -- medical training");
	}

	public void medicallBills() {
		System.out.println("FH -- medical bills");

	}

	@Override
	public void pathalogyDepartment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void covidVaccicnation() {
		System.out.println("FH -- covidVaccicnation");
	}

	@Override
	public void releaseFunds() {
		System.out.println("FH -- releaseFunds");

	}
	
	//method hiding
	public static void USMedicalHistory() {
		System.out.println("FH -- USMedicalHistory");
	}
	
	@Override
	public void medicalRD(){
		System.out.println("R&D -- FH");
	}

	

}
