package com.syntaxclass14;

public class MethodExamples {
//want to create the method
	//that will be greeting a person
	void greet() {
		System.out.println("Hello Sarmed");
	}
	void greet1(String name) {
		System.out.println("Hello "+name);
	}
	public static void main(String[] args) {
		//how to call the method greet---need to create an object of the class 
		//to which the object belongs
		//className variableName=new ClassName();
		MethodExamples object1=new MethodExamples();
		object1.greet1("Sarmeed");
		object1.greet1("Faisal");
		object1.greet1("John");
		object1.greet1("Guleen");
		
	}
}
