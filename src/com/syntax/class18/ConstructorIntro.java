package com.syntax.class18;

public class ConstructorIntro {

	
	//to create a constructor:1.name must be same as class name;
	//2. no return type(not even void).
	ConstructorIntro(){
		System.out.println("I am a constructor");
	}
	public static void main(String[] args) {
		ConstructorIntro obj=new ConstructorIntro();
		System.out.println("Code after constructor");
		obj.hello();
	}
	void hello() {
	System.out.println("Hello Class");
}
}