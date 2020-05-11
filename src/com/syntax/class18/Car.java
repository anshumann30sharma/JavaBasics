package com.syntax.class18;

public class Car {
String make,model,color;
int year,door,wheels;
public void printDetails() {
	System.out.println("I have "+year+" "+make+" "+model+" in " +color+" color");
			
}
public static void main(String[] args) {
	Car car=new Car();
	car.make="BMW";
	car.model="m5";
	car.year=2020;
	car.color="Black";
	car.door=2;
	car.wheels=5;
	car.printDetails();
	
	System.out.println("---------------------");
	
	
	
	Car car1=new Car();
	//we are using instance variable without assigning values
	//constructors assigned default value
	
	System.out.println(car1.year);
	
	//int doors;//local variable needs to be initialised
	//System.out.println(doors);
	
}


}
