package Uber;

public class Main {
	
	public static void main(String[] args) {
		
		Uber ub = new Uber();
		
		
		ub.setdistanceKM(10);
		ub.setperKmPrice(5);
		
		ub.setwithdiscount(50*10/100);
		ub.TotalFare();
	}

}
