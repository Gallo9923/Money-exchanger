package model;

public class MoneyExchanger {
	
	public static final double ONE_USD_TO_COP = 3979.72;
	
	public static double calculateToCOP(double USD) {
		return USD * ONE_USD_TO_COP;
	}
	
	public static double calculateTOUSD(double COP) {
		return COP/ONE_USD_TO_COP;
	}
	
	
	
	
}
