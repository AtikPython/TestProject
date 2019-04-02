package Uber;

public class Uber {
	private double distanceKM;
	private int perKmPrice;
	private double withdiscount;
	private double TotalFare;
	private double withoutDiscount;
	
	public double getdistanceKM(){
		return distanceKM;
	}
	public void setdistanceKM(double distanceKM) {
		this.distanceKM = distanceKM;
	}
	public int getperKmPrice() {
		return perKmPrice;
	}
	public void setperKmPrice(int perKmPrice) {
		this.perKmPrice = perKmPrice;
	}
	public double getwithdiscount() {
		return withdiscount;
	}
	public void setwithdiscount(double withdiscount) {
		this.withdiscount = withdiscount;
	
	
	}
	public void TotalFare() {	
		TotalFare = distanceKM*perKmPrice-withdiscount;
		withoutDiscount = distanceKM*perKmPrice;
		System.out.println("Total Fare With Discount: "+TotalFare);
		System.out.println("Total Fare Without Discount: "+withoutDiscount);
	}
	
}

