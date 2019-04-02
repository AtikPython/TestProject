package HospitalBilling;

public class Main {
	public static void main(String[] args) {
		PatientsInformation patients = new PatientsInformation();
		patients.setName("Atik");
		patients.setAge(24);
		patients.setContactNo(1929591892);
		patients.allInformation();
		
		AdmittedPatient AP = new AdmittedPatient();
		AP.setDoctorFee(1000);
		AP.setCabinCost(5000);
		AP.settestCost(2000);
		AP.allInformation();
		
		DiagnosticTests DT = new DiagnosticTests();
		DT.setTestTitale("CBC");
		DT.setTestRate(200);
		DT.allInformation();
		
		DoctorsInformation DI = new DoctorsInformation();
		DI.setName("Dr Atik");
		DI.setAge(50);
		DI.setDepartment("Hematology");
		DI.setDegree("MBBS");
		DI.allInformation();
		
		
	}
	
}
