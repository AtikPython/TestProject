public class Employee extends PowerPlant {
	private int id;
	private String name;
	private double totalCollectBill;
	private String PowerPlant;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTotalCollectBill() {
		return totalCollectBill;
	}	
	public void setTotalCollectBill(double totalCollectBill) {
		this.totalCollectBill = totalCollectBill;
	}
	public String getPowerPlant() {
		return PowerPlant;
	}
	public void setPowerPlant(String powerPlant) {
		PowerPlant = powerPlant;
	}
	
	
	public void TotalCollectBill() {
		
		System.out.println("Totall Collect Bill: "+totalCollectBill);
		
	}
	

}
