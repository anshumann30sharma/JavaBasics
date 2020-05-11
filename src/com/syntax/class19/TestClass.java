package com.syntax.class19;

public class TestClass {

	public static void main(String[] args) {
		Dogs dogs=new Dogs();
		//access variables from own class
			dogs.breed="Husky";
			//access variables from parent class
			dogs.color="Grey";
			dogs.fur="Too much";
			dogs.size="Big";
			//access from own class
			dogs.bark();
			//access methods from parent class
			dogs.eat();
			dogs.bewild();
			dogs.sleep();
			dogs.age=2;
			
			Animals animal=new Animals();
			//can access only features defined in its class
			animal.color="Any";
			animal.size="Any";
			animal.fur="Any";
			
			animal.sleep();
			animal.eat();
			animal.bewild();
			
		animal.toString();
		
	}

}
