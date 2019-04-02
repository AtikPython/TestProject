package FAO;

public class Country {
	public int countryId;
	public String countryName;
	public int totalFoodProduced;
	

	Country(int Id,String N,int t){
		countryId = Id;
		countryName = N;
		totalFoodProduced = t;	
	}
	public void totalFoodProduction() {
		System.out.println("Country Id Is: "+countryId);
		System.out.println("Country Name Is: "+countryName);
		System.out.println("Total Food Produced Is: "+totalFoodProduced);
		
		if(totalFoodProduced >=50 && totalFoodProduced<=500) {
			System.out.println("The country does not need any support from FAO.");
		}
		else if(totalFoodProduced<49) {
			System.out.println("Country need FAO support for Food Production.");
		}
		else {
			System.out.println("Total Food Production is Greater than 500 Tons.");
		}
		
	}
	
	      

}
