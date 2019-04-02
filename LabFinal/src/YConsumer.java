public class YConsumer extends PowerPlant {
	private int id;
	private String name;
	private String location;
	private double monthlyUsedKW;
	private String PowerPlantName;
	private double TotalBill;
	private double tax;
	private double ServiceCharge;
	private double discount;
	
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getMonthlyUsedKW() {
		return monthlyUsedKW;
	}
	public void setMonthlyUsedKW(int monthlyUsedKW) {
		this.monthlyUsedKW = monthlyUsedKW;
	}
	public String getPowerPlantName() {
		return PowerPlantName;
	}
	public void setPowerPlantName(String powerPlantName) {
		PowerPlantName = powerPlantName;
	}
	public double getTotalBill() {
		return TotalBill;
	}
	public void setTotalBill(int totalBill) {
		TotalBill = totalBill;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getServiceCharge() {
		return ServiceCharge;
	}
	public void setServiceCharge(double serviceCharge) {
		ServiceCharge = serviceCharge;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	//method

		public void Discount() {
			if(monthlyUsedKW>100) {
				TotalBill = TotalBill+tax+ServiceCharge - discount;
			
			}
		}
		
		public void TotalBill() {
			TotalBill = TotalBill+tax+ServiceCharge;
			
		}
		void Display() {
			TotalBill();
			Discount();
			System.out.println("TotalBill for MConsumer: "+TotalBill);
			
		}
		
	}