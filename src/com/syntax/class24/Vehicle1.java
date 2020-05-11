package com.syntax.class24;

public abstract class Vehicle1 {
public static final int length = 0;
	//	Complete this diagram.
//	Create a class Bus, which will be concrete child class of the vehicle class.
//	Create a SchoolBus class that will be a subclass of the Bus and override method drive() and stop().
//	Create an array of vehicles and see which methods will be available and see the output of the program
	void start(){
		System.out.println("most of the vehicles starts by truning the key");
	}
	void stop() {
		System.out.println("vehicles should stop for pedisterian crosswalk");
	}
	abstract void brake();
	abstract void drive();
}
class Buss extends Vehicle1{
	@Override
	public void brake() {
		System.out.println("bus should barke at red light camera");
	}
	@Override
	public void drive() {
		System.out.println("Bus can drive fast");
	}
}
class SchoolBus extends Buss{
	public void start() {
		System.out.println("school bus start remotly");
	}
	public void stop() {
		System.out.println("School bus stops for childern");
	}
}

