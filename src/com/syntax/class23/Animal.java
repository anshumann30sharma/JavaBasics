package com.syntax.class23;

public class Animal {

	public void whoAmI() {
		System.out.println("I am an animal");
	}
	public void sleep(){
		System.out.println("Animals Sleep");
	}

class Bird extends Animal{
	
//We are not override--it is Method hiding
	public void whoAmI() {
		System.out.println("I am an Bird");
}
	
	public void sleep(){
		System.out.println("Birds Sleep");
	}
}
}
	