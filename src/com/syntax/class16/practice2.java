package com.syntax.class16;

public class practice2 {


	public static void main(String[] args) {
		Main country1=new Main();
		Main country2=new Main();
		
		String print;
		country1.nameOftheCountry="USA";
		country1.capital="Washington DC";
		country1.populationSize=33000000;
		
		
		print=country1.displayValues();
		System.out.println(print);
		
		country2.nameOftheCountry="Canada";
		country2.capital="Toronto";
		country2.populationSize=20000000;
		print=country2.displayValues();
		System.out.println(print);
		
		
		
//		Country1.nameOftheCountry="USA";
//		Country1.capital="Washington DC";
//		Country1.populationSize=330000000;
//		Country2.displayValues();
//		
//		Main Country2=new Main();
//		Country2.nameOftheCountry="Kazakhstan";
//		Country2.capital="Astana";
//		Country2.populationSize=18500000;
			
		
	}

}
