public class MainClass {
	public static void main(String[] args) {
	
		
		PowerPlant pp = new PowerPlant();
		pp.setPowerPlantName("ABC");
		pp.setLocation("Dhaka");
		pp.setTotalPcapacity(400000);
		pp.setProductionCostPMW(40);
		pp.setTotalCustomer(200);
		pp.setpriceOfoneKW(4);
		
		MConsumer mc = new MConsumer();
		mc.setId(1001);
		mc.setName("Atik");
		mc.setLocation("Dhaka");
		mc.setMonthlyUsedKW(200);
		mc.setPowerPlantName("ABC");
		mc.setTotalBill(2000);
		mc.setTax(2000*4/100);
		mc.setServiceCharge(2000*3/100);
		mc.setDiscount(2000*2/100);
		
		
		YConsumer yc = new YConsumer();
		yc.setId(1002);
		yc.setName("Mesbah");
		yc.setLocation("Dhaka");
		yc.setMonthlyUsedKW(22);
		yc.setPowerPlantName("ABC");
		yc.setTotalBill(2020);
		yc.setTax(2000*4/100);
		yc.setServiceCharge(2000*2/100);
		yc.setDiscount(2000*2/100);
		
		Employee emp = new Employee();
		emp.setId(2001);
		emp.setName("Sakil");
		emp.setTotalCollectBill(2020);
		emp.setPowerPlant("ABC");
		
		PowerPlant powerplant = new PowerPlant();
		powerplant.setPowerPlantName("ABC");
		powerplant.setLocation("Dhaka");
		powerplant.setTotalPcapacity(2000000);
		powerplant.setProductionCostPMW(5000);
		powerplant.setTotalCustomer(2000);
		powerplant.setpriceOfoneKW(20);
		powerplant.setTotalCollectBill(2020);
		
		mc.Display();
		yc.Display();
		emp.TotalCollectBill();
		powerplant.profit();
	
		
	}

}
