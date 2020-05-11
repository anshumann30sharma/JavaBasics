package com.syntax.class23;

public class Car {
String make;
Car(String make){
	this.make=make;
}
public void display() {
	System.out.println("I have  "+make);
}
public void start() {
	System.out.println(make+" starts by turning key");
}
}
class BMW extends Car{
	public BMW(String make){
		super(make);
	}
	public void start() {
		System.out.println(make+" starts by pushing button");
	}
	public void navigate() {
		System.out.println(make+" I can navigate");
}
class Mercedes extends Car{
	public Mercedes(String make) {
		super(make);
		
	}
	public void statr() {
		System.out.println(make+" starts remotely");
}
}
class Tesla extends Car{
	public Tesla(String make) {
		super(make);
		
}

	public void start() {
		System.out.println(make+" starts by voice command");
	}
	}
}