package com.syntax.class15;

import com.syntax.class16.Dog;

public class practice2 {
	String car;
	String color;
	 String Make;
	 int Year;
	private String Color;
	  
	  
	  void car(String Make,String color,int Year) {
			System.out.println("Car color is "+Color+ "and car year is" +Year+" and car model is"+ Make);
	  
	  }
	public static void main(String[] args){	
		practice2 car=new practice2();
		car.Make="BMW";
		car.Color="Black";
		car.Year=2019;
		System.out.println("Car color is "+car.Color+ " and car year is " +car.Year+" and car model is "+ car.Make); 
		car.Color="White";
		car.Year=2018;
		car.Make="Toyota";
		
			System.out.println("Car color is "+car.Color+ " and car year is " +car.Year+" and car model is "+ car.Make);
		}
				
}

