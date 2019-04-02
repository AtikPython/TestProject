public class PowerPlant {
	private String PowerPlantName;
	private String Location;
	private int TotalPcapacity;
	private int ProductionCostPMW;
	private int TotalCustomer;
	private int priceOfoneKW;
	private double totalCollectBill;
	private double profit;
	
	
	
	public String getPowerPlantName() {
		return PowerPlantName;
	}
	public void setPowerPlantName(String PowerPlantName) {
		this.PowerPlantName = PowerPlantName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String Location) {
		this.Location = Location;
	}
	public int getTotalPcapacity() {
		return TotalPcapacity;
	}
	public void setTotalPcapacity(int TotalPcapacity) {
		this.TotalPcapacity = TotalPcapacity;
	}
	public int getProductionCostPMW() {
		return ProductionCostPMW;
	}
	public void setProductionCostPMW(int ProductionCostPMW) {
		this.ProductionCostPMW = ProductionCostPMW;
	}
	public int getTotalCustomer() {
		return TotalCustomer;
	}
	public void setTotalCustomer(int TotalCustomer) {
		this.TotalCustomer = TotalCustomer;
	}
	public int getpriceOfoneKW() {
		return priceOfoneKW;
	}
	public void setpriceOfoneKW(int priceOfoneKW) {
		this.priceOfoneKW = priceOfoneKW;
	}
	public double getTotalCollectBill() {
		return totalCollectBill;
	}	
	public void setTotalCollectBill(double totalCollectBill) {
		this.totalCollectBill = totalCollectBill;
	}
	void profit() {
		profit = TotalPcapacity * ProductionCostPMW - totalCollectBill ;
		System.out.println("Total Profit:"+profit);
	}

}


