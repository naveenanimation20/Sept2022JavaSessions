package oop_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.neuroServices();
		fh.physioServices();
		fh.pediaServices();
		fh.ENTServices();
		fh.dentalServices();
		fh.orthoServices();
		fh.medicallBills();
		fh.medicalTraining();
		fh.emergencyServices();
		fh.medicalNews();
		fh.covidVaccicnation();
		fh.releaseFunds();

		System.out.println(USMedical.bill_amount);
		USMedical.USMedicalHistory();
		System.out.println(fh.bill_amount);
		FortisHospital.USMedicalHistory();

		// FortisHospital.bill_amount = 100;

		// USMedical us = new USMedical();

		// top casting:
		// child class object can be referred by parent interface ref variable:
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.neuroServices();
		us.physioServices();
		us.emergencyServices();

		UKMedical uk = new FortisHospital();
		uk.ENTServices();
		uk.pediaServices();
		uk.emergencyServices();

		// child class object can be referred by grand parent interface ref variable:
		WHO who = new FortisHospital();
		who.covidVaccicnation();

	}

}
