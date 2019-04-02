package HospitalBilling;

public class AdmittedPatient extends Hospital {
	private int doctorFee;
	private int cabinCost;
	private int totalCost;
	private int testCost;
	private int discount;
	
	//getter setter
	public int getDoctorFee() {
		return doctorFee;
	}
	public void setDoctorFee(int doctorFee) {
		this.doctorFee = doctorFee;
	}
	public int getCabinCost() {
		return cabinCost;
	}
	public void setCabinCost(int cabinCost) {
		this.cabinCost = cabinCost;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	public int gettestCost() {
		return testCost;
	}
	public void settestCost(int testCost) {
		this.testCost = testCost;
	}
	
	
    //method
    void allInformation() {
    	
    	totalCost = doctorFee + cabinCost + testCost;
    	
    	if(totalCost>=2000) {
    		discount = (totalCost*10)/100;
    		totalCost = doctorFee + cabinCost + testCost - discount;
    		System.out.println("Total cost with discount:"+totalCost);
    	}
    	else 
    	{
    	System.out.println("Total cost is:"+totalCost);
    	}
		
	}
	
}
