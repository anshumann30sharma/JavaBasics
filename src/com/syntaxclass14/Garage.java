package com.syntaxclass14;

public class Garage {
public static void main(String[] args) {
	//build individual objects
	 car car1=new car();
	 car1.make="Lombarghini";
	 car1.model="Gallardo";
	 car1.year=2020;
	 car1.color="Blue";
	 System.out.println(car1.make);
	 car car2=new car();
	 car2.make="BMW";
	 car1.model="M5";
	 car1.year=2019;
	 car1.color="Pink";
	 
	 System.out.println(car1.make);
	 //accessing behavior/methods of Car car1
	 car1.drive();
	 car1.accelerate();
	 car1.stop();
	 car1.makeNoise();
	//accessing behavior/methods of Car car2
		 car2.drive();
		 car2.accelerate();
		 car2.stop();
		 car2.makeNoise();
	 //I drive pink BMW
	 System.out.println("I drive pink "+car2.make);
	 //create bike object
	 //cannot create object if we do not have a class
	 //create dogs
	 
	 
	 
}
}
