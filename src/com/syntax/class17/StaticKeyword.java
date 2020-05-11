package com.syntax.class17;

public class StaticKeyword {
//create a template for a Phone
	//instance var
	String color;
	int memory;
	//static var
	static String brand;
	static boolean touchScreen;
	
	//return type,name and parameters
	//static & instance methods
	static void displayGeneralInfo() {
		System.out.println("We are building "+brand+" with touch screen "+touchScreen);
		
	}
	void displaySpecifications() {
		System.out.println("We build phone with "+memory+"GB memory in "+color+" color");
		
	}
	//static void displaySpecifications() {
	//	System.out.println("We build phone with "+memory+"GB memory in "+color+" color");
	//static methods cannot access non static members of the class
	
	public static void main(String[]args) {
		//since class name is static.., static object may be created by name
		brand="iPhone";
		touchScreen=true;
	//	accessing instance var. through instance of the class 
		StaticKeyword obj=new StaticKeyword();
		obj.color="grey";
		obj.memory=64;
		//accessing static method in a static way
		displayGeneralInfo();
		obj.displaySpecifications();
		
	}
}
