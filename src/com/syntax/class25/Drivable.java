package com.syntax.class25;

public interface Drivable {
	//compiler by default adds public static final
 boolean MOVE_FAST=true;
 
 //compiler by default adds public abstract
void drive();
}
abstract class Vehicles{
	abstract void stop();
}
//Achieving multiple inheritance
class Cars extends Vehicles implements Drivable{
//	@override
	public void drive() {
		System.out.println("Car drives");
	}
//	@override
	 void stop() {
		System.out.println("Car stops");
}

}
	
		
	
