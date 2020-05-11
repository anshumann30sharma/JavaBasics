package com.syntax.class24;

public abstract class Vehicle {
	static int totalVehicles;
	String color;
	protected Vehicle(String color){
		this.color=color;
		totalVehicles++;
	}
	public static void total() {
		System.out.println("We build "+totalVehicles+" Cars");
	}
public void drive() {
	System.out.println("Vehicle drives");
}
public void stop() {
	System.out.println("Vehicle stops");
//}
//public abstract void start();
//public abstract void brake();
//can abstract method be static==No, be final=No.
//can abstract method be private=No

//}
//public abstract class Car extends Vehicle{
//	String carType;
//	Car(String color,String carType){
	//	super(color);
//		this .carType=carType;	
	}
	public void brake() {
//		System.out.println(carType+" have brakes");
	}
//}
//class Tesla extends Car{
//	String make;
	//Tesla(String color,String carType,String make){
	//	super(color, carType);
//		this.make=make;
//	}
	//override 
//	public void drive() {
//		System.out.println(make+"drive on autopilot");
//	}
	//override
//	public void start() {
	//	System.out.println(make+" starts remotely");
//	}
//	public void display() {
//		System.out.println("We have "+make);
	//}
//}
//class Toyota extends Car{
	//String make;
//	Toyota(String color,String carType,String make){
	//	super(color, carType);
//		this.make=make;
//	}
	//override
	//public void start() {
//		System.out.println(make+" starts remotely");
//	}
	protected abstract void start();
}