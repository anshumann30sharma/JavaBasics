package com.syntax.class02;

public class Variables {
	public static void main(String[]args) {
		String firstName="Anshumann";
		String lastName="Sharma";
		String grade="A";
		String city="Vienna";
		String state="Virginia";
		String phoneNumber="7034024869";
		
		//String city="Chantelly";--> error saying dupl
		city="Chantilly";
		state="Fairfax";
	
		System.out.println("My first name is "+ firstName);
		System.out.println("My last name is "+lastName);
		System.out.println("My grade is "+ grade);
		System.out.println("I live in the city "+ city);
		System.out.println("My city is in the state "+ state);
		System.out.println("My phone number is "+phoneNumber);
		
}
}