package com.syntax.class020;

public class Car {
String make, model;
public Car() {
	System.out.println("I am a parent class constructor");
	
}
public Car(String make, String model) {
	this.make=make;
	this.model=model;
	
	
}
}
class Mercedes extends Car{
	String sportModel;
	public Mercedes() {
		//super();//compiler add super() by default
	}
	public Mercedes(String make,String model,String sportModel) {
		
	
	}
}