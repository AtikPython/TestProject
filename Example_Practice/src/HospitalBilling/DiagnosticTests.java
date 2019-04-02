package HospitalBilling;

public class DiagnosticTests extends Hospital{
	
	private String testTitale;
	private int testRate;
	
	//getter setter
	public String getTestTitale() {
		return testTitale;
	}
	public void setTestTitale(String testTitale) {
		this.testTitale = testTitale;
	}
	public int getTestRate() {
		return testRate;
	}
	public void setTestRate(int testRate) {
		this.testRate = testRate;
	}
	
    void allInformation() {
		System.out.println("Test title: "+testTitale);
		System.out.println("Rate per test : "+testRate);
		
	}
	
	
	

}
